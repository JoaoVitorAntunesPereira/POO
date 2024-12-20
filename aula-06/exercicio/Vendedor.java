package exercicio;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int idade, String cpf, double salario, String funcao, double comissao) {
        super(nome, idade, cpf, salario, funcao);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
