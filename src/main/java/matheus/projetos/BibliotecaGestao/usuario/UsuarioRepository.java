package matheus.projetos.BibliotecaGestao.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    boolean existsByEmail(String email);
    Usuario findByEmail(String email);
    Usuario findByDocument(String document);
}
