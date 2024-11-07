import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class ExemploVet1{
  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //declara um vetor de int já atrubuindo os valores
    int[] vetValores = {3, 5, 1, 6, 4, 8, 3};
    //System.out.print(vetValores[1]);

    //declara um vetor de String com 12 posições
    String[] meses = new String[12];
    meses[0] = "Janeiro";
    meses[1] = "Fevereiro";
    meses[2] = "Março";
    meses[3] = "Abril";
    meses[4] = "Maio";
    meses[5] = "Junho";
    meses[6] = "Julho";
    meses[7] = "Agosto";
    meses[8] = "Setembro";
    meses[9] = "Outubro";
    meses[10] = "Novembro";
    meses[11] = "Dezembro";

    int pos = 100;

    while(pos != 0){
      System.out.println("Informe o número do mês que deseja ou 0 para sair: ");
      pos = Integer.parseInt(reader.readLine());
      if(pos > 0 && pos < 13){
        System.out.println(meses[pos +- 1]);
      }
    }
  }
}