import java.util.Scanner;

import java.util.ArrayList;

public class Caracteristicas {
    public void espaco() {
        System.out.println("==============================================================================================================================================================================================");
    }
    public int Forca = 0;
    public int Inteligencia = 0;
    public int Carisma = 0;
    public int Agilidade = 0;
    public int pontos, pontosiniciais=15, n;
    Scanner Scan = new Scanner(System.in);
    ArrayList <String> caracteristicas = new ArrayList<String>();

    public void Pontos() {
        Forca = 0;
        Inteligencia = 0;
        Carisma = 0;
        Agilidade = 0;
        pontosiniciais=15;
        caracteristicas.add("Força");
        caracteristicas.add("Intelgência");
        caracteristicas.add("Carisma");
        caracteristicas.add("Agilidade");
        espaco();
        System.out.println("As características são: " + caracteristicas);
        System.out.println("Você tem 15 pontos");
        n=1;
        Switch();
    }

    public void Switch() {
        switch (n) {
          case 1:
             espaco();
                System.out.println("Escolha quantos pontos deseja colocar.");
            System.out.println("Força");
            pontos = Scan.nextInt();
            if(pontos>pontosiniciais) {
                System.out.println("Você excedeu os pontos de características");
                Switch();
            }else {
                n=2;
                pontosiniciais -=pontos;
                Forca += pontos;
                if(pontosiniciais==0) {
                    System.out.println("Você zerou seus pontos de característica");
                    CaracteristicasFinais();
                }else {
                    Switch();
                }
            }
            break;
          case 2:
                 espaco();
            System.out.println("Escolha quantos pontos deseja colocar.");
            System.out.println("Pontos restantes: "+pontosiniciais);
            System.out.println("Intelgência");
            pontos = Scan.nextInt();
            if(pontos>pontosiniciais) {
                System.out.println("Você excedeu os pontos de características");
                Switch();
            }else {
                n=3;
                pontosiniciais -=pontos;
                Inteligencia += pontos;
                if(pontosiniciais==0) {
                    System.out.println("Você zerou seus pontos de característica");
                    CaracteristicasFinais();
                }else {
                    Switch();
                }
            }
            break;
          case 3:
                 espaco();
            System.out.println("Escolha quantos pontos deseja colocar.");
            System.out.println("Pontos restantes: "+pontosiniciais);
            System.out.println("Carisma");
            pontos = Scan.nextInt();
            if(pontos>pontosiniciais) {
                System.out.println("Você excedeu os pontos de características");
                Switch();
            }else {
                n=4;
                pontosiniciais -=pontos;
                Carisma += pontos;
                System.out.println("Pontos restantes: "+pontosiniciais);
                if(pontosiniciais==0) {
                    System.out.println("Você zerou seus pontos de característica");
                    CaracteristicasFinais();
                }else {
                    Switch();
                }
            }
            break;
          case 4:
                 espaco();
            System.out.println("Escolha quantos pontos deseja colocar.");
            System.out.println("Pontos restantes: "+pontosiniciais);
            System.out.println("Agilidade");
            pontos = Scan.nextInt();
            if(pontos>pontosiniciais) {
                System.out.println("Você excedeu os pontos de características");
                Switch();
            }else {
                pontosiniciais -=pontos;
                Agilidade += pontos;
                System.out.println("Pontos restantes: "+pontosiniciais);
                if(pontosiniciais==0) {
                    System.out.println("Você zerou seus pontos de característica");
                    CaracteristicasFinais();
                }else {
                    CaracteristicasFinais();
                }
            }
            break;
            default:
                 espaco();
                System.out.println("Você digitou um número fora dos falados");
                Pontos();
        }
    }
    public void CaracteristicasFinais() {
      espaco();
        System.out.println("As características finais ficaram:");
        System.out.println("Força: " + Forca);
        System.out.println("Inteligência: " + Inteligencia);
        System.out.println("Carisma: " + Carisma);
        System.out.println("Agilidade: " + Agilidade);
        System.out.print("Se deseja escolher novamente seus pontos digite 1, se deseja prosseguir digite 2:");
        int escolhacaracnovo;
        escolhacaracnovo = Scan.nextInt();
        if(escolhacaracnovo==1) {

            Forca = 0;
            Inteligencia = 0;
            Carisma = 0;
            Agilidade = 0;
            pontosiniciais=15;
            Pontos();
        }else {
          Main.inicio.comeco();
        }
    }

}