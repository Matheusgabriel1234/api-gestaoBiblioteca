package matheus.projetos.BibliotecaGestao.usuario.mapper;

import matheus.projetos.BibliotecaGestao.emprestimo.mapper.EmprestimoMapper;
import matheus.projetos.BibliotecaGestao.usuario.DTO.UsuarioDTO;
import matheus.projetos.BibliotecaGestao.usuario.entity.Usuario;

public class UsuarioMapper {


    public static UsuarioDTO convertEntityToDto(Usuario user){
        return new UsuarioDTO(
                user.getFirstname(), user.getLastname(), user.getEmail(),user.getDocument());
    }

    public static Usuario convertToDto(UsuarioDTO usuarioDTO){

        Usuario usuario = new Usuario();
        usuario.setFirstname(usuarioDTO.firstname());
        usuario.setLastname(usuarioDTO.lastname());
        usuario.setEmail(usuarioDTO.email());
        usuario.setDocument(usuarioDTO.document());

        return usuario;
    }

}
