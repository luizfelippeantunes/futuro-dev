package exercicios5.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import exercicios5.models.Usuario;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Classe para estabelecer o gerenciador de Token
public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter {


    // Configurando o gerenciador de autenticação
    protected JwtLoginFilter(String url, AuthenticationManager authenticationManager){
        super(new AntPathRequestMatcher(url)); // Obriga a autenticar a URL
        setAuthenticationManager(authenticationManager); // Gerenciador de autenticação
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        // Pegamos o token do usuário para válidar
        Usuario user = new ObjectMapper()
                .readValue(request.getInputStream(), Usuario.class);

        // Retorna o usuário: login, senha e acessos
        return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(user.getLogin(), user.getSenha()));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        new JwtTokenAutenticacaoService().addAuthentication(response, authResult.getName());
    }
}