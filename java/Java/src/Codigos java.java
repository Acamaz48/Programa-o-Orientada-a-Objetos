import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        int vogais = 0;  
        int digitos = 0;  
        int outros = 0;  

        System.out.println("Digite caracteres até digitar '.' (ponto) para parar:");

      
        while (true) {
            char c = input.next().charAt(0);  

            if (c == '.') { 
                break;
            }

            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vogais++;
            }
            // Verifica se é um dígito
            else if (Character.isDigit(c)) {
                digitos++;
            }
            // Caso contrário, é considerado "outro" caractere
            else {
                outros++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        input.close();  
    }
}
