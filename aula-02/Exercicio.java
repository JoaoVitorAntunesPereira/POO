public class Exercicio{
  public static void main(String[] args){
    String s1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucária, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Paraná - (45)3422-5348";

    int indexCep = s1.indexOf("CEP")+4;
    String cep = s1.substring(indexCep, (indexCep + 10));
    String fone = s1.substring((s1.length()-13), s1.length());
    String fone2 = fone.substring((fone.length()-4), fone.length());
    Integer fone3 = Integer.parseInt(fone2);
    System.out.println("CEP: " + cep);
    System.out.println("Fone: " + fone);
    System.out.println("Telefone dividido por 2: " + fone3/2); 
  }
}