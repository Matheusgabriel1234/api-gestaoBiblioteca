package matheus.projetos.BibliotecaGestao.usuario.service;

import lombok.extern.slf4j.Slf4j;
import matheus.projetos.BibliotecaGestao.usuario.DTO.UsuarioDTO;
import matheus.projetos.BibliotecaGestao.usuario.entity.Usuario;
import matheus.projetos.BibliotecaGestao.usuario.mapper.UsuarioMapper;
import matheus.projetos.BibliotecaGestao.usuario.repository.UsuarioRepository;
import org.apache.el.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO addUsuario(Usuario usuario) {
        Usuario savedUser = usuarioRepository.save(usuario);
        return UsuarioMapper.convertEntityToDto(savedUser);
    }

    public UsuarioDTO getUsuarioById(Long id) {
        Usuario user = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        return UsuarioMapper.convertEntityToDto(user);
    }

    public  List<UsuarioDTO> getAllUsuarios(){
         return usuarioRepository.findAll().stream().map(UsuarioMapper::convertEntityToDto).toList();
    }

    public UsuarioDTO getUsuarioByEmail(String email){
        Usuario user = usuarioRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        return UsuarioMapper.convertEntityToDto(user);
    }

    public UsuarioDTO updateUsuario(Usuario newUser,Long id){
        Usuario user = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        user.setFirstname(newUser.getFirstname());
        user.setLastname(newUser.getLastname());
        user.setDocument(newUser.getDocument());
        user.setEmail(newUser.getEmail());
        Usuario savedUser = usuarioRepository.save(user);
        return UsuarioMapper.convertEntityToDto(savedUser);
    }



}