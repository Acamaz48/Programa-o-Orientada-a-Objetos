public class Livro {
    private String titulo;
    private boolean reservado;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("O livro \"" + titulo + "\" foi reservado com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("A reserva do livro \"" + titulo + "\" foi cancelada.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não estava reservado.");
        }
    }

    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado com sucesso.");
        } else if (!reservado) {
            System.out.println("O livro \"" + titulo + "\" precisa ser reservado primeiro.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não está emprestado.");
        }
    }
}

class LivroFisico extends Livro {
    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
    }
}

class Ebook extends Livro {
    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
    }
}


