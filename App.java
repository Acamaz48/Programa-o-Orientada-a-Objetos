public class App {
    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "Arthur Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "Arthur Autor", "PDF");
         
        // Exibirá um texto dizendo que o livro precisa ser revisado.
        livro1.emprestar(); 

        // As mensagens abaixo devem exibir na tela que os livros foram reservados com sucesso
        livro1.reservar();
        ebook1.reservar();
        
        // Deve dizer que a reserva foi cancelada

        ebook1.cancelarReserva(); 


        livro1.emprestar(); // Vai informar que o livro foi emprestado com sucesso
        livro1.emprestar(); // Vai exibir um texto dizendo que o livro já está emprestado
        livro1.devolver(); // Vai exibir um texto dizendo que o livro foi devolvido
    }
}