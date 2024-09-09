import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Creche creche = new Creche();
        Turma turmaMaternal = new Turma("Maternal", "2 a 3 anos");
        Turma turmaPre1 = new Turma("Pré-1", "4 a 5 anos");
        creche.cadastrarTurma(turmaMaternal);
        creche.cadastrarTurma(turmaPre1);

        int opcao;

        do {
            System.out.println("Bem vindo!O que deseja?\n");
            System.out.println("\n1 - Matricular novos alunos.");
            System.out.println("\n2 - Contratar novos professores.");
            System.out.println("\n3 - Consultar Informações.");
            System.out.println("\n4 - Encerrar programa.");
            System.out.print("\nQual opção de sua escolha? ");
            String sla = scanner.nextLine();
            opcao = Integer.parseInt(sla);
            String continuarCadastro;

            switch (opcao) {

                case 1:
                    // Loop para cadastrar crianças
                    do {
                        //  Scanner scNome = new Scanner(System.in);

                        System.out.println("=== Cadastro de Crianças ===");
                        System.out.print("Nome: ");
                            String nome = scanner.nextLine();
                            // scNome.close();
                        System.out.print("CPF: ");
                            String cpf = scanner.nextLine();
                        System.out.print("\nData de Nascimento: ");
                            String dataNascimento = scanner.nextLine();
                        System.out.print("\nEndereço: ");
                            String endereco = scanner.nextLine();
                        System.out.print("\nTelefone de Contato: ");
                            String telefone = scanner.nextLine();
                        System.out.print("\nHorário (Integral/Meio Período): ");
                            String horario = scanner.nextLine();

                        Crianca crianca = new Crianca(nome, cpf, dataNascimento, endereco, telefone, horario);

                        // Atribuir a criança a uma turma
                        System.out.println("Escolha uma turma:");
                        System.out.println("1 - Maternal (2 a 3 anos)");
                        System.out.println("2 - Pré-1 (4 a 5 anos)");
                        int opcaoTurma = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha
                        if (opcaoTurma == 1) {
                            crianca.setTurma(turmaMaternal);
                        } else if (opcaoTurma == 2) {
                            crianca.setTurma(turmaPre1);
                        }

                        creche.cadastrarCrianca(crianca);
                    
                        System.out.print("Deseja continuar cadastrando crianças? (S/N): ");
                        continuarCadastro = scanner.nextLine();
                        } while (continuarCadastro.equalsIgnoreCase("S"));

                    break;
            
                case 2:
                    
                do {
                    System.out.println("=== Cadastro de Professores ===");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();
        
                    Professor professor = new Professor(nome, cpf, disciplina);
                    creche.cadastrarProfessor(professor);
        
                    System.out.print("Deseja continuar cadastrando professores? (S/N): ");
                    continuarCadastro = scanner.nextLine();
                } while (continuarCadastro.equalsIgnoreCase("S"));    

                    break;

                case 3:

                    int opcao2;
                    do {
                        System.out.println("========================================================");
                        System.out.println("\nO que deseja? \n");
                        System.out.println("1 - Gerar Relatório de Crianças por Turma.\n");
                        System.out.println("2 - Gerar Relatório de Crianças por Horário.\n");
                        System.out.println("3 - Gerar Relatórios de Professores por Turma.\n");
                        System.out.println("4 - Voltar ao menu principal.\n3");
                        System.out.println("========================================================");
                        opcao2 = scanner.nextInt();

                        switch (opcao2) {
                            case 1:
                                
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

                                creche.gerarRelatorioCriancasPorTurma();

                                break;
                        
                            case 2:
                                
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

                                creche.gerarRelatorioCriancasPorHorario();

                                break;
                            case 3:
                            
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

                                creche.gerarRelatorioProfessoresPorTurma();

                                break;
                            default:
                                break;
                        }
                    } while(opcao2 != 4);

                    break;
                default:
                    break;
            }

        }   while(opcao != 4);
        
        scanner.close();
    }
}
