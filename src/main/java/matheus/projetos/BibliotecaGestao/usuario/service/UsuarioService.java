package matheus.projetos.BibliotecaGestao.usuario.service;

import lombok.extern.slf4j.Slf4j;
import matheus.projetos.BibliotecaGestao.usuario.DTO.UsuarioDTO;
import matheus.projetos.BibliotecaGestao.usuario.entity.Usuario;
import matheus.projetos.BibliotecaGestao.usuario.mapper.UsuarioMapper;
import matheus.projetos.BibliotecaGestao.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UsuarioService {

@Autowired
private UsuarioRepository usuarioRepository;

public UsuarioDTO addUsuario(Usuario usuario){
    Usuario savedUser = usuarioRepository.save(usuario);
    return UsuarioMapper.convertEntityToDto(savedUser);
}



}
