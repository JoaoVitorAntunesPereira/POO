import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Float margemLucro;
        String arquivoEntrada, arquivoSaida;

        System.out.println("Informe o nome do arquivo de entrada: ");
        arquivoEntrada = reader.readLine();
        if((arquivoEntrada.trim()) == null){
            arquivoEntrada = "preco_custo.csv";
        }
        System.out.println("Informe o nome do arquivo de saida: ");
        arquivoSaida = reader.readLine();
        if((arquivoSaida.trim()) == null){
            arquivoSaida = "preco_venda.csv";
        }

        System.out.println("Informe a porcentagem de lucro para os pordutos: ");
        margemLucro = Float.parseFloat(reader.readLine());
        gravarArquivo(margemLucro, arquivoSaida, arquivoEntrada);
        comprar(lerArquivo(arquivoEntrada));
    }

    public static void gravarArquivo(Float margemLucro, String nomeArquivo, String arquivoEntrada) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
        Produto[] produtos = lerArquivo(arquivoEntrada);
        writer.write("codigo;estoque;produto;preco_venda;categoria");

        for (Produto produto : produtos) {
            String linha = produto.getCodigo() + ";" +
                        produto.getEstoque() + ";" +
                        produto.getNomeProduto() + ";" +
                        (produto.getPrecoCusto() + (produto.getPrecoCusto() * margemLucro) / 100) + ";" +
                        produto.getCategoria();
            writer.newLine();
            writer.write(linha);
        }
        writer.close();
    }

    public static Produto[] lerArquivo(String nomeArquivo) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        reader.readLine();
    
        String linha;
        ArrayList<Produto> produtos = new ArrayList<>();
    
        while ((linha = reader.readLine()) != null) {
            Produto produto = new Produto();
            String[] colunas = linha.split(";");
    
            produto.setCodigo(colunas[0]);
            produto.setEstoque(Integer.parseInt(colunas[1]));
            produto.setNomeProduto(colunas[2]);
            colunas[3] = colunas[3].replace(",", ".");
            produto.setPrecoCusto(Float.parseFloat(colunas[3]));
            produto.setCategoria(colunas[4]);
    
            produtos.add(produto);
        }
    
        reader.close();
        return produtos.toArray(new Produto[0]);
    }

    public static void comprar(Produto[] produtos) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("comprar.csv"));
        writer.write("codigo;estoque;produto;preco_custo;categoria");

        for (Produto produto : produtos) {
            if(produto.getEstoque() < 10){
                String linha = produto.getCodigo() + ";" +
                produto.getEstoque() + ";" +
                produto.getNomeProduto() + ";" +
                produto.getPrecoCusto() + ";" +
                produto.getCategoria();
            
            writer.newLine();
            writer.write(linha);
            }
        }
        writer.close();
    }

    public static Produto lerProduto() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Produto produto = new Produto();

        //System.out.println("Informe o código do produto: ");
        //produto.setCodigo(Integer.parseInt(reader.readLine()));
        //System.out.println("Informe o estoque do produto: ");
        //produto.setEstoque(Integer.parseInt(reader.readLine()));
        //System.out.println("Informe o nome do produto: ");
        //produto.setNomeProduto(reader.readLine());
        //System.out.println("Informe o custo do produto: ");
        //produto.setCusto(Float.parseFloat(reader.readLine()));
        System.out.println("Informe a margem de lucro que deseja: ");
        produto.setMargemLucro(Float.parseFloat(reader.readLine()));
        produto.setPrecoCusto(produto.getCusto() + (produto.getCusto() * produto.getMargemLucro()) / 100);
        //System.out.println("Informe a categoria do produto: ");
        //produto.setCategoria(reader.readLine());
        return produto;
    }
}