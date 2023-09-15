import java.time.LocalDate;

import entidades.Endereco;
import entidades.pessoas.Medico;
import entidades.pessoas.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente pac = new Paciente("João", "123", new Endereco(), LocalDate.of(2000, 8, 10));
        Medico med = new Medico("Ana", "456", new Endereco(), LocalDate.of(1980, 10, 5), "12345/00");

        System.out.println(pac);
        System.out.println(med);
    }
}
