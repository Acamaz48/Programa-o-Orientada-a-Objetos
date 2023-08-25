public class SistemaEventos {
    Evento[] eventos;
    int eventosCount;
    
    
    public SistemaEventos() {
        eventos = new Evento[100]; 
        eventosCount = 0;
    }
    
    public void cadastrarEvento(String nome, String data, String local, int maxParticipantes) {
        if (eventosCount < eventos.length) {
            eventos[eventosCount] = new Evento(nome, data, local, maxParticipantes);
            eventosCount++;
        }
    }
    
    public Evento[] getEventosFuturos() {
        Evento[] eventosFuturos = new Evento[eventosCount];
        int count = 0;
        for (int i = 0; i < eventosCount; i++) {
            if (eventos[i].Data().compareTo("2023-08-25") > 0) { 
                eventosFuturos[count] = eventos[i];
                count++;
            }
        }
        return eventosFuturos;
    }

    
    
}



