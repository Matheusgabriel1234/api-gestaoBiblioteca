package matheus.projetos.BibliotecaGestao.emprestimo.DTO;

import java.time.LocalDate;

public record EmprestimoDTO(
        Long usuarioID,
        Long livroID,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        Double multa) {
}
