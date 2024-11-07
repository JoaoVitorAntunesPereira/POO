import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicio{
  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] vetA = new int[4]; 
    String[] vetB = new String[4];
    
    for(int i = 0; i < 4; i++){
      System.out.println("Informe o " + (i+1) + "° número: ");
      vetA[i] = Integer.parseInt(reader.readLine());
    }

    for(int i = 0; i < 4; i++){
      System.out.println("Informe a " + (i+1) + "° palavra: ");
      vetB[i] = reader.readLine();
    }

    for(int i = 0; i < vetB.length; i++){
      for(int j = 0; j < vetA[i]; j++){
        System.out.println(vetB[i]);
      }
    }
  }


 
}