package matheus.projetos.BibliotecaGestao.emprestimo.repository;

import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long> {

}
