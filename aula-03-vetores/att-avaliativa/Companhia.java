public class Companhia {
    private String nome;
    private String sede;
    private Voo[] vetVoos;
    private int qtdVoos;

    public Companhia(){
        this.vetVoos = new Voo[10];
    }

    public Voo getVoo(int num){
        return this.vetVoos[num];
    }

    public void setVoo(Voo v){
        if(this.qtdVoos < 10){
            this.vetVoos[qtdVoos] = v;
            this.qtdVoos++;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getSede(){
        return this.sede;
    }

    public void setSede(String s){
        this.sede = s;
    }


    public int getQtdVoos(){
        return this.qtdVoos;
    }
    
}
