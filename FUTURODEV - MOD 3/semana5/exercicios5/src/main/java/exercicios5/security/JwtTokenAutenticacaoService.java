package exercicios5.security;

import exercicios5.context.ApplicationContextLoad;
import exercicios5.models.Usuario;
import exercicios5.repositories.UsuarioRepository;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Service
@Component
public class JwtTokenAutenticacaoService {

    // A validade do token (em milisegundos) - Exemplo de 2 dias
    private static final long EXPIRATION_TIME = 24 * 60 * 60 * 2;

    // Uma senha única para compor a autenticação e auxiliar na segurança
    private static final String SECRET = "S3nh@F0rt3";

    // Prefixo padrão do Token
    private static final String TOKEN_PREFIX = "Bearer";

    // O cabeçalho do Token
    private static final String HEADER_STRING = "Authorization";

    // Gerando o Token de autenticação e adicionando ao cabeçalho de resposta HTTP
    public void addAuthentication(HttpServletResponse response, String username) throws IOException {
        // Montagem do Token
        String JWT = Jwts.builder() // Chama o gerador de token
                .setSubject(username) // Adicionamos o usuário
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRATION_TIME)) // Tempo de expiração do Token
                .signWith(SignatureAlgorithm.HS512, SECRET).compact(); // Comptacantaodo e usando o algoritmo de criptografia

        String token = TOKEN_PREFIX + " " + JWT; // Juntando o cabeçalho ao Token

        // Adiciona no cabeçalho HTTP
        response.addHeader(HEADER_STRING, token);

        // Escrevendo o Token como resposta no corpo HTTP
        response.getWriter().write("{\"Authorization\": \""+token+"\"}");
    }

    // Método para retornar o usuário validado com o Token, ou caso seja inválido retorna null
    public Authentication getAuthentication(HttpServletRequest request){
        // Pegar o token enviado no cabeçalho HTTP
        String token = request.getHeader(HEADER_STRING);
        if (token != null){
            String user = Jwts.parser().setSigningKey(SECRET)
                    .parseClaimsJwt(token.replace(TOKEN_PREFIX, "")) // Retirando o Prefixo do Token
                    .getBody().getSubject(); // Pega o usuário
            if(user != null){
                Usuario usuario = ApplicationContextLoad.getApplicationContext()
                        .getBean(UsuarioRepository.class).findUserByLogin(user);
                if(usuario != null){
                    return new UsernamePasswordAuthenticationToken(usuario.getLogin(), usuario.getSenha(), usuario.getAuthorities());
                }
            }
        }
        return null; // Usuário não autorizado
    }
}
