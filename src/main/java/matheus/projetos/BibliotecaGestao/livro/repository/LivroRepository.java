package matheus.projetos.BibliotecaGestao.livro.repository;

import matheus.projetos.BibliotecaGestao.livro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {
    List<Livro> findByAuthor(String autor);
    Livro findByTitle(String title);
}
