import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVet2 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int pos = -1;
    Meses meses = new Meses();
    while (pos != 0) {
      System.out.println("Informe o número do mês que deseja ou 0 para sair: ");
      pos = Integer.parseInt(reader.readLine());
      String mes = meses.pegarNomeMes(pos);

      if (!mes.equals("")) {
        System.out.println("O mês é: " + mes);
      } else if (pos != 0) {
        System.out.println("Valor inválido");
      }
    }

  }
}