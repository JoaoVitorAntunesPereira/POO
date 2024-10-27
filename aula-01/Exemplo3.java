public class Exemplo3{
  public static void main(String[] args){
    Pet pet1 = new Pet();

    pet1.nome = "Pitty";
    pet1.idade = 16;
    pet1.especie = "Felina";

    System.out.println("Especie: " + pet1.especie + "\nNome: " + pet1.nome + "\nIdade: " + pet1.idade);
    System.in(pet1.nome);
    System.out.println("NOme2:" + pet1.nome);
  }
}