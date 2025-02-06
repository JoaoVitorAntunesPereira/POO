import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

class Transportadora implements ImportacaoArquivos{

    BufferedReader reader;
    Float precoEE;
    Float precoEN;
    Encomenda[] encomendasNormais = new Encomenda[1000];
    EncomendaExpressa[] encomendasExpressas = new EncomendaExpressa[1000];
    
    public void Transportadora(){

    }

    public static void main(String[] args) throws Exception{
        Transportadora tr = new Transportadora();
        tr.reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe o nome do arquivo de configurações.");
        String nomeArqConfig = tr.reader.readLine();

        String[] arqConfig = tr.carregarConfiguracoes(nomeArqConfig);

        if(tr.selecionarColuna(arqConfig[1], 1).equals("EN")){
            tr.setPrecoEN(Float.valueOf(tr.selecionarColuna(arqConfig[1], 2)));
            tr.setPrecoEE(Float.valueOf(tr.selecionarColuna(arqConfig[2], 2)));
        }else{
            tr.setPrecoEN(Float.valueOf(tr.selecionarColuna(arqConfig[2], 2)));
            tr.setPrecoEE(Float.valueOf(tr.selecionarColuna(arqConfig[1], 2)));
        }

        System.out.println("Preço encomendas normais " + tr.getPrecoEN());
        System.out.println("Preço encomendas expressas " + tr.getPrecoEE());
        tr.menu();
    }

    public void menu()throws Exception{
        int opt;
        String nomeArquivo;
        Transportadora tr = new Transportadora();
        tr.reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1 - Importar arquivos de encomenda. ");
        System.out.println("2 - Exibir encomendas normais.");
        System.err.println("3 - Exibir encomendas expressas.");
        opt =  Integer.parseInt(tr.reader.readLine());

        switch (opt) {
            case 1:
                System.out.println("Informe o nome do arquivo");
                nomeArquivo = tr.reader.readLine();
                importarDados(nomeArquivo);
                menu();
                break;
            case 2:
                listarEncomendasNormais(this.encomendasNormais);
                menu();
            case 3:
                listarEncomendasExpressas(this.encomendasExpressas);
                menu();
            case 4:
                break;
            default:
                System.out.println("Informe uma opção válida!");;
                menu();
        }
    }
    

    @Override
    public String[] carregarConfiguracoes(String arqConfig) throws Exception{
        String[] conteudo = new String[500];
        BufferedReader reader = new BufferedReader(new FileReader(arqConfig));
        String linha;
        int i = 0;
        do {
            linha = reader.readLine();
            if (linha != null) {
                conteudo[i] = linha;
                i++;
            }
        } while (linha != null);
        reader.close();
        return conteudo;
    }     
    
    @Override
    public String[] importarDados(String arqConfig) throws Exception{
        String[] conteudo = new String[2];
        BufferedReader reader = new BufferedReader(new FileReader(arqConfig));
        String linha;
        int i = encontrarPrimeiraPosicaoVazia(encomendasExpressas), j = encontrarPrimeiraPosicaoVazia(encomendasNormais);
        linha = reader.readLine();

        do {
            linha = reader.readLine();
            if (linha != null) {
                if(selecionarColuna(linha, 2).equals("EE")){
                    EncomendaExpressa ee = new EncomendaExpressa();
                    ee.setNumPedido(selecionarColuna(linha, 0));
                    ee.setDataPostagem(selecionarColuna(linha, 1));
                    ee.setPrazoEntrega(Integer.parseInt(selecionarColuna(linha, 3)));
                    ee.setPeso(Float.valueOf(selecionarColuna(linha, 4)));
                    ee.setFoneContato(selecionarColuna(linha, 0));
                    ee.setValorFrete(ee.calcularFrete(ee.getPeso(), this.precoEE));
                    encomendasExpressas[i] = ee;
                    System.out.println("i: " + i);
                    i++;
                }else{
                    Encomenda en = new Encomenda();
                    en.setNumPedido(selecionarColuna(linha, 0));
                    en.setDataPostagem(selecionarColuna(linha, 1));
                    en.setPeso(Float.valueOf(selecionarColuna(linha, 4)));
                    en.setValorFrete(en.calcularFrete(en.getPeso(), this.precoEN));
                    encomendasNormais[j] = en;
                    System.out.println("j: " + j);
                    j++;
                }
            }
        } while (linha != null);
        reader.close();

        return conteudo;
    }  

    public String selecionarColuna(String linha, int coluna){
        String[] linhaSeparada = new String[100];
        linhaSeparada = linha.split(";");
        return linhaSeparada[coluna];
    }

    public void listarEncomendasNormais(Encomenda[] encomendasNormais){
        int i = 0;
        while (encomendasNormais[i] != null) {
            System.out.println("Número pedido: " + encomendasNormais[i].getNumPedido() + 
                               " Peso: " + encomendasNormais[i].getPeso() +
                               " Frete: R$" + encomendasNormais[i].getValorFrete());
            i++;
        }
    }

    public void listarEncomendasExpressas(EncomendaExpressa[] encomendasExpressas){
        int i = 0;
        while (encomendasExpressas[i] != null) {
            System.out.println("Número pedido: " + encomendasExpressas[i].getNumPedido() + 
                               " Peso: " + encomendasExpressas[i].getPeso() +
                               " Frete: R$" + encomendasExpressas[i].getValorFrete());
            i++;
        }
    }

    private int encontrarPrimeiraPosicaoVazia(Object[] vetor) {
        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k] == null) {
                return k;
            }
        }
        return 1000;
    }
    


    public void setPrecoEE(Float precoEE) {
        this.precoEE = precoEE;
    }

    public void setPrecoEN(Float precoEN) {
        this.precoEN = precoEN;
    }

    public Float getPrecoEE() {
        return precoEE;
    }

    public Float getPrecoEN() {
        return precoEN;
    }



}