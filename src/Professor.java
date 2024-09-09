import java.util.*;
public class Professor extends Pessoa {
    private String disciplina;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Turmas:");
        for (Turma turma : turmas) {
            System.out.println(" - " + turma.getNome());
        }
    }
}

