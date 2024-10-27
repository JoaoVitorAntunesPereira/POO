public class Exemplo4{
  public static void main(String[] args){
    OperacoesMatematicas operacoes = new OperacoesMatematicas();

    System.out.println("4 + 9: " + operacoes.somar(4, 9));
    System.out.println("6 - 90123" + operacoes.subtrair(6, 90123));
    System.out.println("5 * 2" + operacoes.multiplicar(5, 2));
    System.out.println("6 / 2" + operacoes.dividir(6, 2));
  }
}