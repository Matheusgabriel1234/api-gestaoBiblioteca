package matheus.projetos.BibliotecaGestao.usuario.DTO;

import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResumoDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;

import java.util.List;

public record UsuarioDTO(
        String firstname,
        String lastname,
        String email,
        String document,
        List<EmprestimoResumoDTO> emprestimos
) {
}
