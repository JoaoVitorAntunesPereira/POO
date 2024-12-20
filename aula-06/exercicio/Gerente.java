package exercicio;

public class Gerente extends Pessoa {
    private String areaAtuacao;
    private String equipe;

    public Gerente(String nome, int idade, String cpf, String areaAtuacao, String equipe) {
        super(nome, idade, cpf);
        this.areaAtuacao = areaAtuacao;
        this.equipe = equipe;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
