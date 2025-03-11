import java.util.Scanner;

public class Op {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Criando o objeto Scanner

        // Lendo o nome da operação como uma String
        System.out.print("Digite a operação (soma, subtração, multiplicação, divisão): ");
        String op = input.next(); // Usando next() para ler a operação como String

        // Lendo os dois números reais (inteiros ou decimais)
        System.out.print("Digite o primeiro número (a): ");
        double a = input.nextDouble();  // Pode ser número inteiro ou decimal
        System.out.print("Digite o segundo número (b): ");
        double b = input.nextDouble();  // Pode ser número inteiro ou decimal

        double resultado = 0;

        // Realizando a operação conforme o operador fornecido
        switch (op) {
            case "soma":
                resultado = a + b;
                break;
            case "subtração":
                resultado = a - b;
                break;
            case "multiplicação":
                resultado = a * b;
                break;
            case "divisão":
                // Verificando se o divisor não é zero
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return; // Interrompe o programa caso haja divisão por zero
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return; // Interrompe o programa caso a operação seja inválida
        }

        // Imprimindo a expressão e o resultado com o formato desejado
        // Aqui, usamos %.2f para garantir que a saída tenha no máximo 2 casas decimais
        System.out.printf("%.2f %s %.2f = %.2f\n", a, op, b, resultado); 
    }
}
