package exercicio;

public class Caixa extends Funcionario {
    private int numeroRegistros;

    public Caixa(String nome, int idade, String cpf, double salario, String funcao, int numeroRegistros) {
        super(nome, idade, cpf, salario, funcao);
        this.numeroRegistros = numeroRegistros;
    }

    public int getNumeroRegistros() {
        return numeroRegistros;
    }

    public void setNumeroRegistros(int numeroRegistros) {
        this.numeroRegistros = numeroRegistros;
    }

}
