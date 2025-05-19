package matheus.projetos.BibliotecaGestao.livro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import matheus.projetos.BibliotecaGestao.emprestimo.entity.Emprestimo;

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
    private Integer anoPublicacao;
    private String isbn;
    @OneToMany(mappedBy = "livro")
    private List<Emprestimo> emprestimos;
}
