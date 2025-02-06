public class EncomendaExpressa extends Encomenda{
    private int prazoEntrega;
    private String foneContato;

    public int getPrazoEntrega() {
        return prazoEntrega;
    }
    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }
    public String getFoneContato() {
        return foneContato;
    }
    public void setFoneContato(String foneContato) {
        this.foneContato = foneContato;
    }

    public Float calcularFrete(Float peso, Float preco, int prazo){
        Float frete;
        if(prazo >= 3){
            frete = peso * preco;
        }else{
            frete = peso * preco;
            frete += (frete * 0.25f);
        }

        return frete;
    }

}
