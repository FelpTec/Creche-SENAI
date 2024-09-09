import java.util.*;

public class Turma {
    private String nome;
    private String faixaEtaria;
    private List<Professor> professores = new ArrayList<>();

    public Turma(String nome, String faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        professor.adicionarTurma(this);
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDetalhes() {
        System.out.println("Turma: " + nome);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Professores:");
        for (Professor professor : professores) {
            System.out.println(" - " + professor.nome);
        }
    }
}

