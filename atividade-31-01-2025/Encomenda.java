import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Encomenda{
    private String numPedido;
    private LocalDate dataPostagem;
    private Float peso;
    private Float valorFrete;
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }
    public String getDataPostagem() {
        return dataPostagem.format(formatoData);
    }
    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = LocalDate.parse(dataPostagem, formatoData);
    }
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Float getValorFrete() {
        return valorFrete;
    }
    public void setValorFrete(Float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Float calcularFrete(Float peso, Float preco){
        Float frete;
        frete = peso * preco;
        return frete;
    }
}