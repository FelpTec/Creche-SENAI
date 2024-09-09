import java.util.*;

public class Creche {
    private List<Crianca> criancas = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();

    public void cadastrarCrianca(Crianca crianca) {
        criancas.add(crianca);
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void gerarRelatorioCriancasPorTurma() {
        System.out.println("\nRelatório de Crianças por Turma:");
        for (Turma turma : turmas) {
            System.out.println("\nTurma: " + turma.getNome());
            for (Crianca crianca : criancas) {
                if (crianca.getTurma() == turma) {
                    System.out.println(" - " + crianca.nome);
                }
            }
        }
    }

    public void gerarRelatorioCriancasPorHorario() {
        System.out.println("\nRelatório de Crianças por Horário:");
        for (Crianca crianca : criancas) {
            System.out.println("Nome: " + crianca.nome + " - Horário: " + crianca.getHorario());
        }
    }

    public void gerarRelatorioProfessoresPorTurma() {
        System.out.println("\nRelatório de Professores por Turma:");
        for (Turma turma : turmas) {
            turma.mostrarDetalhes();
        }
    }
}

