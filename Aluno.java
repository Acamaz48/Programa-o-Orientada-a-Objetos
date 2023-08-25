public class Aluno {
     String nome;
     String matricula;
     String email;
     String curso;
    
    public Aluno(String nome, String matricula, String email, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
    }
    
    public String Nome() {
        return nome;
    }
    
    public String Matricula() {
        return matricula;
    }
    
    public String Email() {
        return email;
    }

    public String curso() {
        return curso;
    }
}

