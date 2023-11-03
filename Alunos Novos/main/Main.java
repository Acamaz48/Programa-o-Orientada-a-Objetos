

package main;

import java.util.List;
import java.util.Scanner;

import entidades.Aluno;
import entidades.AlunoDAO;

public class Main {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar alunos");
            System.out.println("2 - Incluir aluno");
            System.out.println("3 - Remover aluno");
            System.out.println("4 - Editar aluno");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    List<Aluno> alunos = alunoDAO.listarAlunos();
                    for (Aluno aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;
                case 2:
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    alunoDAO.incluirAluno(new Aluno(matricula, nome));
                    break;
                case 3:
                    System.out.print("Digite a matrícula do aluno a ser removido: ");
                    int matriculaRemover = scanner.nextInt();
                    alunoDAO.removerAluno(matriculaRemover);
                    break;
                case 4:
                    System.out.print("Digite a matrícula do aluno a ser editado: ");
                    int matriculaEditar = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                    System.out.print("Digite o novo nome do aluno: ");
                    String novoNome = scanner.nextLine();
                    alunoDAO.editarAluno(new Aluno(matriculaEditar, novoNome));
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

