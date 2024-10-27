

import java.util.Scanner;
public class Main {
    public static Caracteristicas obj = new Caracteristicas();
    public static Inventario inventario = new Inventario();
    public static int escolha;
    static Scanner Scan = new Scanner(System.in);
    static Inicio inicio = new Inicio();
    static Sul_do_pais a = new Sul_do_pais();
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            obj.Pontos();
    }

    public static void jogar_novamente() {
      System.out.println("Digite 1 para jogar novamente");
      escolha = Scan.nextInt();
      if(escolha == 1) {
        Main.obj.Pontos();
      }else {
      }
    }

    public static void espaco_escolhas() {
      System.out.println(" ");
    }
}