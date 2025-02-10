import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Transportadora implements ImportacaoArquivos{

    BufferedReader reader;
    Float precoEE;
    Float precoEN;
    Encomenda[] encomendasNormais = new Encomenda[1000];
    EncomendaExpressa[] encomendasExpressas = new EncomendaExpressa[1000];
    

    public static void main(String[] args) throws Exception{
        Transportadora tr = new Transportadora();
        tr.reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arqConfig = null;
        

        while(arqConfig == null){
            System.out.println("Informe o nome do arquivo de configurações.");
            String nomeArqConfig = tr.reader.readLine();
            arqConfig = tr.carregarConfiguracoes(nomeArqConfig);
            
        }
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
        System.out.println("3 - Exibir encomendas expressas.");
        System.out.println("4 - Sair");
        opt =  Integer.parseInt(tr.reader.readLine());

        switch (opt) {
            case 1:
                System.out.println("Informe o nome do arquivo");
                nomeArquivo = tr.reader.readLine();
                
                if(importarDados(nomeArquivo) == 1){
                    System.out.println("Erro ao ler o arquivo!");
                }
                menu();
                break;
            case 2:
                listarEncomendasNormais(this.encomendasNormais);
                menu();
                break;
            case 3:
                listarEncomendasExpressas(this.encomendasExpressas);
                menu();
                break;
            case 4:
                System.out.println("Saiu"); 
                break;
            default:
                System.out.println("Informe uma opção válida!");;
                menu();
        }
    }
    

    public String[] carregarConfiguracoes(String arqConfig){
        String[] conteudo = new String[500];

        try {
            reader = new BufferedReader(new FileReader(arqConfig));
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
            
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou falha ao abrir.");
            return null;
        }
    }     
    

    public int importarDados(String arqConfig) throws Exception{
        String[] conteudo = new String[2];

        try {
            reader = new BufferedReader(new FileReader(arqConfig));    
        } catch (FileNotFoundException e) {
            return 1;
        }
        
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
                    ee.setValorFrete(ee.calcularFrete(ee.getPeso(), this.precoEE, ee.getPrazoEntrega()));
                    encomendasExpressas[i] = ee;
                    i++;
                }else{
                    Encomenda en = new Encomenda();
                    en.setNumPedido(selecionarColuna(linha, 0));
                    en.setDataPostagem(selecionarColuna(linha, 1));
                    en.setPeso(Float.valueOf(selecionarColuna(linha, 4)));
                    en.setValorFrete(en.calcularFrete(en.getPeso(), this.precoEN));
                    encomendasNormais[j] = en;
                    j++;
                }
            }
        } while (linha != null);
        reader.close();

        return 0;
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
                               " Frete: R$" + encomendasNormais[i].getValorFrete() + 
                               " Data Postagem: " + encomendasNormais[i].getDataPostagem());
            i++;
        }
    }

    public void listarEncomendasExpressas(EncomendaExpressa[] encomendasExpressas){
        int i = 0;
        while (encomendasExpressas[i] != null) {
            System.out.println("Número pedido: " + encomendasExpressas[i].getNumPedido() + 
                               " Peso: " + encomendasExpressas[i].getPeso() +
                               " Frete: R$" + encomendasExpressas[i].getValorFrete() + 
                               " Data Postagem: " + encomendasExpressas[i].getDataPostagem());
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