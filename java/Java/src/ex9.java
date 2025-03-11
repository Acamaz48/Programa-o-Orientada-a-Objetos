import java.util.Scanner; // Importação correta do Scanner

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Criando o objeto Scanner

        System.out.print("Digite o numero real: ");
        double real = input.nextDouble(); // Lendo um número real

        double decimal = real - (int) real; // Calculando a parte decimal
        int arredondado; // Declarando a variável para o número arredondado

        if (decimal > 0.5) {
            arredondado = (int) real + 1; // Arredonda para cima
        } else {
            arredondado = (int) real; // Arredonda para baixo
        }

        System.out.println(arredondado); // Exibindo o número arredondado
    }
}
