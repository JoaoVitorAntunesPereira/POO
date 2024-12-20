package exercicio;

public class Cliente extends Pessoa {
    private double saldoCredito;
    private String dataCadastro;

    // Construtor
    public Cliente(String nome, int idade, String cpf, double saldoCredito, String dataCadastro) {
        super(nome, idade, cpf);  // Chama o construtor da classe Pessoa
        this.saldoCredito = saldoCredito;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public double getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(double saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
