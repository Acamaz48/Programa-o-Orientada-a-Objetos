public class App {
    public static void main(String[] args) throws Exception {
            SistemaEventos sistema = new SistemaEventos();
            
            sistema.cadastrarEvento("Programação orientada a objetos em desenvolvimento", "2023-08-28", "Sala de laboratório 214", 80);
            
            Aluno aluno1 = new Aluno("Alexandre O Grande", "098546", "alexandreogrande123@gmail.com", "Ciência da Computação");
            
            Evento[] eventosFuturos = sistema.getEventosFuturos();
            
            if (eventosFuturos.length > 0 && eventosFuturos[0] != null) {
                Evento evento1 = eventosFuturos[0];
                
                if (evento1.inscreverAluno()) {
                    System.out.println(" Essa inscrição foi realizada com sucesso!");
                } else {
                    System.out.println("Não foi possível realizar a inscrição, pois as vagas estão esgotadas.");
                }
            } else {
                System.out.println("Não há eventos futuros disponíveis.");
            }
        }
    }

