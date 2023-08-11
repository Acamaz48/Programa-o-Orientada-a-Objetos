public class App {

    public static void main(String[] args) throws Exception {
        // Teste do método calcularMedia
        System.out.println(calcularMedia(7.5,10.0,8.5));


        int NumeroPrimo = 47;
        boolean resultadoPrimo = ePrimo(NumeroPrimo);

        if (resultadoPrimo) {
            System.out.println(" Este  número é primo.");
            
        } else {
            System.out.println(" Este  número não é primo.");
            
        }

        int ano1 = 1995;
        int ano2 = 2012;
        int ano3 = 1900;
        int ano4 = 2000;

        System.out.println( " é bissexto? " + eBissexto(ano1));
        System.out.println(" é bissexto? " + eBissexto(ano2));
        System.out.println(" é bissexto? " + eBissexto(ano3));
        System.out.println(" é bissexto? " + eBissexto(ano4));

        mostrarNumerosEntre150e200();
    }

    public static double calcularMedia(double ap1, double ap2, double ac) {
        return (ap1 + ap2) * 0.4 + ac * 0.2;
    }
   

    public static void mostrarNumerosEntre150e200() {
        for (int i = 150; i <= 200; i++) {
            System.out.println(i);
        }
    } 
    
        // Teste do método ePrimo  
    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println( " é divisível por ");
            return false;
            }
        }

        return true;
    }
    public static void exibirDiaDaSemana(int numeroDia) {
        switch (numeroDia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
    public static boolean eBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

        
    
 
