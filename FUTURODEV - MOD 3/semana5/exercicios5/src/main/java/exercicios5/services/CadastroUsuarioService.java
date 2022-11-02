package exercicios5.services;

import exercicios5.models.Usuario;
import exercicios5.repositories.UsuarioRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CadastroUsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario) {
        usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }

    @Transactional
    public void deletar(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    @Transactional(readOnly = true)
    public Usuario buscar(Long idUsuario){
        Usuario usuario = usuarioRepository.findById(idUsuario).get();
        usuario.getTelefones().size();
        return usuario;
    }

    @Transactional(readOnly = true)
    public List<Usuario> buscarPorNome(String nome){
        List<Usuario> usuarios = usuarioRepository.buscarPorNome(nome);

        for(Usuario usuario: usuarios){
            usuario.getTelefones().isEmpty();
        }
        return usuarios;
    }


    @Override
    public UserDetails loadUserByUsername(String usarname) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findUserByLogin(usarname);
        if(user == null){
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
        return new User(user.getLogin(), user.getPassword(), user.getAuthorities());
    }
}
