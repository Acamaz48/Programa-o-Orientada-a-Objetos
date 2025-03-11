import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Digite o número de alunos: ");
        int alunos = input.nextInt();  
        
        float somageral = 0;  
        int contador = 0;  

        while (contador < alunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            float nota = input.nextFloat();  
            somageral += nota;  
            contador++;  
        }

        float media = somageral / alunos;
        System.out.printf("A média das notas é: %.2f\n", media);  

        input.close();  
    }
}
