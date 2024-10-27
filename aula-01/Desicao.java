public class Desicao{
  public static void main(String[] args){

    if(args.length < 2){
      System.out.println("O programa precisa de 2 parâmetros.");
      System.exit(0);
    }

    int valor1 = Integer.parseInt(args[0]);
    int valor2 = Integer.parseInt(args[1]);

    OperacoesMatematicas oprMat = new OperacoesMatematicas();

    if(valor1 < 5 || valor2 != 2){
      System.out.println(valor1 + " + " + valor2 + " = " + oprMat.somar(valor1, valor2));
    }
  }	
}
