import java.util.Scanner;

public class Calculadora {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
         return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Escolha a operação: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 2.0;
            String operacao = "";

            switch (escolha) {
                case 1:
                    resultado = somar(num1, num2);
                    operacao = "soma";
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    operacao = "subtração";
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    operacao = "multiplicação";
                    break;
                case 4:
                    try {
                        resultado = dividir(num1, num2);
                        operacao = "divisão";
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                        continue; // Volta ao início do loop
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continue; // Volta ao início do loop
            }

            System.out.println("Resultado da " + operacao + ": " + resultado);

            System.out.println("Deseja continuar? (Digite 'sair' para sair ou pressione Enter para continuar)");
            String opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar a calculadora!");
    }
}



        
        

    




    
 