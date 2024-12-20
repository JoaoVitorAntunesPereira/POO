import java.io.BufferedReader;
import java.io.FileReader;

public class Vendas{
    public static void main(String[] args) throws Exception{

        String nomeArquivo = "vendas.csv";
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        Arquivo arquivo = new Arquivo(nomeArquivo);

        System.out.println("Quantidade de vendas reallizadas: " + (arquivo.getConteudo().size() - 1));
        System.out.println("Valor total das vendas: " + arquivo.calcularValorTotal());
        System.out.println("Valor total das vendas a vista: " + arquivo.calcularValorTotalVista());
        System.out.println("Valor total das vendas a prazo: " + (arquivo.calcularValorTotal() - arquivo.calcularValorTotalVista()));

        reader.close();
    }


    /*public static String[] lerArquivo(String nomeArquivo, BufferedReader reader) throws Exception{
        ArrayList<String> conteudo = new ArrayList<>();
        String linha = "";

        do{
            linha = reader.readLine();
            if (linha != null) {
                conteudo.add(linha);
            }
        }while(linha != null);

        return conteudo.toArray(new String[0]);
    }

    public static String[] pegarColuna(String[] conteudo, int indice){
       ArrayList<String> coluna = new ArrayList<>();

        for (String linha : conteudo) {
            linha.split(";");
            coluna.add(linha);
        }

        return coluna.toArray(new String[0]);
    }

    public static float calcularValorTotal(){
        float valorTotal = 0;

        String[] coluna = pegarColuna(lerArquivo(null, null), 3);

        for (String iterable_element : iterable) {

        }

        return valorTotal;
    }*/
}