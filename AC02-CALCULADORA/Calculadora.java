import java.util.Scanner;

public class Calculadora{
     public static double somar(double num1, double num2){
        return num1 + num2;
     }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        return num1/ num2;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean continuar = true;
         String operação = "invalido";
         double num1;
         double num2;
         int escolha;
         double resultado = 0.0;

         while (continuar) {
         if (operação.equals("invalido")){
         System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble(); 
         System.out.println("Digite o segundo número: ");
            num2 = scanner.nextDouble();
         } else {
            num1 = resultado;
            System.out.println("Digite o segundo número:");
            num2 = scanner.nextDouble();
         }
         
                    
         

         System.out.println("Escolha a operação: ");
         System.out.println("1. Soma");
         System.out.println("2. Subtração");
         System.out.println("3. Multiplicação");
         System.out.println("4. Divisão");
         System.out.println("5. Limpar Memória"); 
         escolha = scanner.nextInt();


         switch (escolha){
            case 1:
                    resultado = somar(num1, num2);
                    operação = "soma";
                    break;
            case 2:
                    resultado = subtrair(num1, num2);
                    operação = "subtração";
                    break;
            case 3:
                    resultado = multiplicar(num1, num2);
                    operação = "multiplicação";
                    break;
            case 4:
                    resultado = dividir (num1, num2);
                    operação = "dividir";
                    break;
                    default:
                    
            case 5:
                    resultado = 0.0; // Limpar a memória, resetando o resultado
                    operação = "invalido";
                    break;
                    default: 
                    System.out.println("Escolha inválida.");
         }

         System.out.println("Resultado da " + operação + ": " + resultado);

         System.out.println("Deseja continuar? (Digite 'sair' para sair ou pressione Enter para continuar)");
            String opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Muito obrigado por usar a calculadora!");
    }
}


            
        
        
         
         
        
        


         

            


        

    
        
        


    





        
        

    




    
 
