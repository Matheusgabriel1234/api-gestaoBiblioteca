package matheus.projetos.BibliotecaGestao.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import matheus.projetos.BibliotecaGestao.emprestimo.Emprestimo;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String firstname;
private String lastname;
private String document;
private String email;
@OneToMany(mappedBy = "usuario")
private List<Emprestimo> emprestimos;




}
