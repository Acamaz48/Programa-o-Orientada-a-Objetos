public class Evento {
     String nome;
     String data;
     String local;
     int maxParticipantes;
     int participantesCount;
    
    public Evento(String nome, String data, String local, int maxParticipantes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.maxParticipantes = maxParticipantes;
        this.participantesCount = 0;
    }
    
    public String Nome() {
        return nome;
    }
    
    public String Data() {
        return data;
    }
    
    public String Local() {
        return local;
    }
    
    public int MaxParticipantes() {
        return maxParticipantes;
    }
    
    public int getParticipantesCount() {
        return participantesCount;
    }
    
    public boolean inscreverAluno() {
        if (participantesCount < maxParticipantes) {
            participantesCount++;
            return true;
        }
        return false;
    }
}

