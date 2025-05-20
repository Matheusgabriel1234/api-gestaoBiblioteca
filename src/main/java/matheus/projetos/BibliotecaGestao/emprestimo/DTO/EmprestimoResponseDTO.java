package matheus.projetos.BibliotecaGestao.emprestimo.DTO;

import java.time.LocalDate;

public record EmprestimoResponseDTO(
        Long id,
        Long usuarioId,
        Long livroId,
        String nomeUsuario,
        String tituloLivro,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        Double multa
) {
}
