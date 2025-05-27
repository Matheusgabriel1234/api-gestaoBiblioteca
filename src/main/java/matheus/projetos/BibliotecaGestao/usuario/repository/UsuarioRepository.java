package matheus.projetos.BibliotecaGestao.usuario.repository;

import matheus.projetos.BibliotecaGestao.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    boolean existsByEmail(String email);
    Optional<Usuario> findByEmail(String email);
    Usuario findByDocument(String document);
}
