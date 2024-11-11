public class Voo {
    private String idVoo;
    private String destino;
    private String origem;
    private String data;
    private String horaSaida;
    private int qtdPass;
    private Passageiro[] vetPassageiros;

    public Voo(){
        this.vetPassageiros = new Passageiro[50];
    }
    
    public Passageiro getPassageiro(int num){
        return this.vetPassageiros[num];
    }

    public void setPassageiro(Passageiro p){
        if(this.qtdPass < 50){
            this.vetPassageiros[qtdPass] = p;
            this.qtdPass++;
        }
    }

    public String getIdVoo(){
        return this.idVoo;
    }

    public void setIdVoo(String id){
        this.idVoo = id;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String d){
        this.destino = d;
    }

    public String getOrigem(){
        return this.origem;
    }

    public void setOrigem(String o){
        this.origem = o;
    }

    public String getData(){
        return this.data;
    }

    public void setData(String d){
        this.data = d;
    }

    public int getQtdPass(){
        return this.qtdPass;
    }

    public String getHoraSaida(){
        return this.horaSaida;
    }

    public void setHoraSaida(String h){
        this.horaSaida = h;
    }
}
