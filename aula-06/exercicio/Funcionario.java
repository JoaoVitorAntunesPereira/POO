package exercicio;

public class Funcionario extends Pessoa {
    private double salario;
    private String funcao;

    public Funcionario(String nome, int idade, String cpf, double salario, String funcao) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

