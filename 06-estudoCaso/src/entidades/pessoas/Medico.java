package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;
import entidades.Especialidade;
import entidades.salas.Consultorio;

public class Medico extends Pessoa {
    private Especialidade especialidade;
    private String crm;
    private double valorHora;
    private Consultorio consultorio;

    public Medico(String nome, String cpf, Endereco endereco, LocalDate dataNascimento, String crm) {
        super(nome, cpf, endereco, dataNascimento);
        this.crm = crm;
    }

    public void defineValorHora(double valor) {
        this.valorHora = valor;
    }

    public double calculaAtendimento(int numHoras) {
        return this.valorHora * numHoras;
    }

    public void alocaConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void cadastraEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Médico(a) " + super.toString() + "\n" +
            "CRM: " + this.crm + "\n" +
            "Especialidade: " + this.especialidade + "\n" +
            "Valor por hora: R$" + this.valorHora + "\n" +
            "Atende no consultorio " + this.consultorio;
    }
}
