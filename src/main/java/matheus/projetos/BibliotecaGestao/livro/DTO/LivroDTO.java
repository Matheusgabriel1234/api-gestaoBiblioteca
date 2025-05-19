package matheus.projetos.BibliotecaGestao.livro.DTO;


import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResumoDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;

import java.util.List;

public record LivroDTO(
        String author,
        String title,
        int anoPublicacao,
        String isbn,
        List<EmprestimoResumoDTO> emprestimos
) {
}
