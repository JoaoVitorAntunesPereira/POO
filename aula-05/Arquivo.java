import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Arquivo {
    private static ArrayList<String> conteudo;

    public Arquivo(String nomeArquivo) throws Exception {
        conteudo = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        String linha = "";

        do {
            linha = reader.readLine();
            if (linha != null) {
                conteudo.add(linha);
            }
        } while (linha != null);
        reader.close();
    }

    public ArrayList<String> getConteudo(){
        return conteudo;
    }

    public static String[] getColuna(int indice){
        ArrayList<String> coluna = new ArrayList<>();

        for (int i = 1; i < conteudo.size(); i++) {
            String linha = conteudo.get(i);
            String[] parts = linha.split(";");

            if (parts.length > indice) {
                coluna.add(parts[indice]);
            }
        }

        return coluna.toArray(new String[0]);
    }


     public float calcularValorTotal(){
        float valorTotal = 0;

        String[] coluna = getColuna(2); 

        for (String valor : coluna) {
            valorTotal += formatarFloat(valor);
        }

        return valorTotal;
    }

    private float formatarFloat(String valor){
        valor = valor.replace(",", ".");
        float valorReal = Float.parseFloat(valor);
        return valorReal;
    }

    public float calcularValorTotalVista(){
        float total = 0;
        int i = 0;
        String[] colunaValor = getColuna(2); 
        String[] colunaTipoPag = getColuna(3);

        for (String tipo : colunaTipoPag) {
            if(tipo.equalsIgnoreCase("V")){
                total += formatarFloat(colunaValor[i]);
            }    
            i++;
        }
        return total;
    }
}