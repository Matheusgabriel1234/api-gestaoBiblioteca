package matheus.projetos.BibliotecaGestao.livro.mapper;

import matheus.projetos.BibliotecaGestao.emprestimo.DTO.EmprestimoResponseDTO;
import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;
import matheus.projetos.BibliotecaGestao.emprestimo.mapper.EmprestimoMapper;
import matheus.projetos.BibliotecaGestao.livro.DTO.LivroDTO;
import matheus.projetos.BibliotecaGestao.livro.entity.Livro;

import java.util.List;
import java.util.stream.Collectors;

public class LivroMapper {

    public LivroDTO convertToEntity(Livro livro){
        return new LivroDTO(livro.getAuthor(), livro.getTitle(),livro.getAnoPublicacao(),
                livro.getIsbn()
                );
    }

    public Livro convertDTOToEntity(LivroDTO livroDTO){
        Livro livro = new Livro();
        livro.setAuthor(livroDTO.author());
        livro.setTitle(livroDTO.title());
        livro.setAnoPublicacao(livroDTO.anoPublicacao());
        livro.setIsbn(livroDTO.isbn());


        return livro;
    }

}
