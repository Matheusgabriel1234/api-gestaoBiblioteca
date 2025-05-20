package matheus.projetos.BibliotecaGestao.usuario.DTO;

import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResponseDTO;

import java.util.List;

public record UsuarioDTO(
        String firstname,
        String lastname,
        String email,
        String document

) {
}
