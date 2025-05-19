package matheus.projetos.BibliotecaGestao.emprestimo;

import matheus.projetos.BibliotecaGestao.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long> {

}
