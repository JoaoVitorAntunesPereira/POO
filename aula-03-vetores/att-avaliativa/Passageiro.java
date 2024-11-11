public class Passageiro {
    private String nome;
    private String idPass;
    private String numAssento;
    private String classe;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getIdPass(){
        return this.idPass;
    }

    public void setIdPass(String id){
        this.idPass = id;
    }

    public String getNumAssento(){
        return this.numAssento;
    }

    public void setNumAssento(String a){
        this.numAssento = a;
    }

    public String getClasse(){
        return this.classe;
    }

    public void setClasse(String c){
        this.classe = c;
    }
}

