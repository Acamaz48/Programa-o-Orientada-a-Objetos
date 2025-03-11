import java.util.Scanner;

public class ex12 {

    public static void impriPares(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % 2 != 0) {
            a++; 
        }

        boolean encontrouPar = false; 
        for (int i = a; i <= b; i += 2) {
            System.out.print(i + " ");
            encontrouPar = true; 
        }

        if (!encontrouPar) {
            System.out.println("Nenhum número par encontrado no intervalo.");
        } else {
            System.out.println(); 
        }
    }

    public static void calcSomaEMedia(int a, int b) {
        int soma = a + b;
        double media = (a + b) / 2.0; 
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f\n", media);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = input.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = input.nextInt();

        System.out.print("Números pares no intervalo: ");
        impriPares(a, b);

        calcSomaEMedia(a, b);
    }
}
