package matheus.projetos.BibliotecaGestao.emprestimo.DTO;

import java.time.LocalDate;

public record EmprestimoResponseDTO(
        Long Id,
        String nomeUsuario,
        String tituloLivro,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        Double multa
) {
}
