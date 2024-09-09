public class Crianca extends Pessoa {
    private String dataNascimento;
    private String endereco;
    private String telefoneContato;
    private Turma turma;
    private String horario; // Integral ou Meio Período

    public Crianca(String nome, String cpf, String dataNascimento, String endereco, String telefoneContato, String horario) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.horario = horario;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone de Contato: " + telefoneContato);
        System.out.println("Horário: " + horario);
        if (turma != null) {
            System.out.println("Turma: " + turma.getNome());
        } else {
            System.out.println("Turma: Não atribuída");
        }
    }
}

