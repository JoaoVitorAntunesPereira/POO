import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main{

    private static String nomeArquivo = "preco_custo.csv";
    public static void main(String[] args) throws Exception{
        gravarArquivo(nomeArquivo);
    }

    public static void gravarArquivo(String conteudo) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true));
        Produto produto = lerProduto();
        String linha = produto.getCodigo() + ";" +
                       produto.getEstoque() + ";" +
                       produto.getNomeProduto() + ";" +
                       produto.getPrecoCusto() + ";" +
                       produto.getCategoria();
        
        writer.newLine();
        writer.write(linha);
        writer.close();
    }

    public static Produto lerProduto() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Produto produto = new Produto();

        System.out.println("Informe o código do produto: ");
        produto.setCodigo(Integer.parseInt(reader.readLine()));
        System.out.println("Informe o estoque do produto: ");
        produto.setEstoque(Integer.parseInt(reader.readLine()));
        System.out.println("Informe o nome do produto: ");
        produto.setNomeProduto(reader.readLine());
        System.out.println("Informe o custo do produto: ");
        produto.setCusto(Float.parseFloat(reader.readLine()));
        System.out.println("Informe a margem de lucro que deseja para este produto: ");
        produto.setMargemLucro(Float.parseFloat(reader.readLine()));
        produto.setPrecoCusto(produto.getCusto() + (produto.getCusto() * produto.getMargemLucro()) / 100);
        System.out.println("Informe a categoria do produto: ");
        produto.setCategoria(reader.readLine());
        return produto;
    }
}