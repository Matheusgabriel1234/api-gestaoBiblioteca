package matheus.projetos.BibliotecaGestao.emprestimo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import matheus.projetos.BibliotecaGestao.livro.Livro;
import matheus.projetos.BibliotecaGestao.usuario.Usuario;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@ManyToOne
private Usuario usuario;
@ManyToOne
private Livro livro;
private LocalDate dataEmprestimo;
private LocalDate dataDevolucao;
private Double multa;
}
