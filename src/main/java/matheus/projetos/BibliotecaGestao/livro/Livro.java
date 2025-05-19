package matheus.projetos.BibliotecaGestao.livro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import matheus.projetos.BibliotecaGestao.emprestimo.Emprestimo;
import org.apache.catalina.LifecycleState;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Livro {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    private int anoPublicacao;
    private String isbn;
    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;
}
