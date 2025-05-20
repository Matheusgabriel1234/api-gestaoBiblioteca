package matheus.projetos.BibliotecaGestao.livro.DTO;


import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResponseDTO;

import java.util.List;

public record LivroDTO(
        String author,
        String title,
        int anoPublicacao,
        String isbn

) {
}
