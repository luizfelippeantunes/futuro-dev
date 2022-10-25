package br.futurodev.primeiraapi.services;

import br.futurodev.primeiraapi.models.Usuario;
import br.futurodev.primeiraapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    public Usuario buscar(Long idUsuario){
        return usuarioRepository.findById(idUsuario).get();
    }

    @Query()
    public List<Usuario> buscarPorNome(String nome){
        return usuarioRepository.buscarPorNome(nome);
    }

}
