package matheus.projetos.BibliotecaGestao.emprestimo.mapper;

import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResponseDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;
import matheus.projetos.BibliotecaGestao.livro.entity.Livro;
import matheus.projetos.BibliotecaGestao.usuario.entity.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class EmprestimoMapper {

    public static Emprestimo toEntity(EmprestimoDTO dto, Livro livro, Usuario usuario){
           Emprestimo emprestimo = new Emprestimo();
           emprestimo.setUsuario(usuario);
           emprestimo.setDataEmprestimo(dto.dataEmprestimo());
           emprestimo.setDataDevolucao(dto.dataDevolucao());
           emprestimo.setLivro(livro);
           emprestimo.setMulta(dto.multa());
           return emprestimo;
    }

    public static EmprestimoResponseDTO toDTO (Emprestimo e){
        String nome = e.getUsuario().getFirstname() + " "  + e.getUsuario().getLastname();
        return new EmprestimoResponseDTO(
                e.getId(),
                e.getUsuario().getId(),
                e.getLivro().getId(),
                nome,
                e.getLivro().getTitle(),
                e.getDataEmprestimo(),
                e.getDataDevolucao(),
                e.getMulta());}

    public static List<EmprestimoResponseDTO> toResponseDto(List<Emprestimo> emprestimos) {
        return emprestimos.stream()
                .map(EmprestimoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static Emprestimo ResponseDTOtoEntity(EmprestimoResponseDTO dto, Usuario usuario, Livro livro) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(dto.id());
        emprestimo.setUsuario(usuario);
        emprestimo.setLivro(livro);
        emprestimo.setDataEmprestimo(dto.dataEmprestimo());
        emprestimo.setDataDevolucao(dto.dataDevolucao());
        emprestimo.setMulta(dto.multa());
        return emprestimo;
    }
    }





