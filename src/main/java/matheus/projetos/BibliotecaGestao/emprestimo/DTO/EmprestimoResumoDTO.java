package matheus.projetos.BibliotecaGestao.emprestimo.DTO;

import java.time.LocalDate;

public record EmprestimoResumoDTO(
        Long id,
        String tituloLivro,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao

) {
}
