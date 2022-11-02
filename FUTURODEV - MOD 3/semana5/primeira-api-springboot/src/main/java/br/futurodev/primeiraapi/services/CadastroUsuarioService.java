package br.futurodev.primeiraapi.services;

import br.futurodev.primeiraapi.models.UsuarioModel;
import br.futurodev.primeiraapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel salvar(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public void deletar(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    public UsuarioModel buscar(Long idUsuario){
        return usuarioRepository.findById(idUsuario).get();
    }

    @Query()
    public List<UsuarioModel> buscarPorNome(String nome){
        return usuarioRepository.buscarPorNome(nome);
    }

}
