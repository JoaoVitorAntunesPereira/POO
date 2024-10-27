import java.util.Scanner;

public class Inicio {

    public Scanner Scan = new Scanner(System.in);
    public int escolha;
    Cap2_carona Cap2 = new Cap2_carona();
    public void espaco() {
        System.out.println("                            ");
        System.out.println("==============================================================================================================================================================================================");
        System.out.println("         ");
    }
    public void comeco() {
        espaco();
        System.out.println("Você acorda para ir para a escola, assim como qualquer outro dia. Você veste suas roupas, seus tênis, pega sua mochila e vai");
        System.out.println("No meio do caminho você olha para a paisagem da cidade, vê fumaça em alguns locais, não dá bola para isso.");
        System.out.println("Andando na rua um homem vem em sua direção, ele é estranho, \"um mendigo\" você pensa");
        Main.espaco_escolhas();
        System.out.println("1)Desviar o caminho para o outro lado da rua");
        System.out.println("2)Continuar andando");
        escolha = Scan.nextInt();

        if (escolha==1) {
            Desviar();
        }else
        if(escolha==2) {
            Continuar();
        }else {
          comeco();
        }
    }

    public void Desviar() {
        espaco();
        System.out.println("Você atravessa para o outro lado da rua para tentar evitar uma situação desconfortável");
        System.out.println("Ele segue você, por achar isso estranho você vira a esquina para ver se ele realmente está te seguindo");
        virar();
    }

    public void Continuar() {
        espaco();
        System.out.println("Você segue andando, pois pensa que ele só passará por você");
        System.out.println("Você desvia mas ele \r\n"
                + " continua seguindo, ele começa a andar mais rápido, você corre, ele também, você se depara com mais pessoas “bêbadas” na rua");
        Main.espaco_escolhas();
        System.out.println("1)seguir correndo");
        System.out.println("2)virar a esquina");
        escolha = Scan.nextInt();
        if (escolha==1) {
            seguir();
        }else
        if (escolha==2) {
            virar();
        }else {
          Continuar();
        }
    }

    public void seguir() {
        espaco();
        System.out.println("Ao seguir correndo você vê um carro e então corre atrás dele e grita para ele parar, mas ele parece não desacelerar e continua vindo em sua direção.");
        if(Main.obj.Agilidade<2) {
            mortecarro();
        }else if (Main.obj.Agilidade>2){
            desviarcarro();
        }else {
          seguir();
        }
    }

    public void desviarcarro() {
        System.out.println("Você consegue desviar do carro se jogando no chão, após isso você vê alguém saindo do carro e correr atrás de você, então você corre então");
        virar();
    }

    public void mortecarro() {
        System.out.println("Você não consegue desviar do carro e acaba morrendo atropelado por ele");
        Main.jogar_novamente();
    }

    public void desviar() {
        System.out.println("Você consegue desviar do carro se jogando no chão, após isso você vê um carro com a porta aberta, entra nele e tenta ligá-lo para fugir dali");
        carro();
    }

    public void virar() {
        System.out.println("Você vira a esquina e entra em um beco e vê a cena mais traumatizante de sua vida um grupo de três ou quatro pessoas canibalizando");
        System.out.println("alguém que usa suas últimas forças para tentar gritar por socorro, mas que logo em seguida morre você vira para correr,");
        System.out.println("mas dá de cara com alguém que o ataca, e tenta o morder, você luta para escapar dele.");
        if(Main.obj.Forca<=3) {
            morte_zumbi();
        }else if(Main.obj.Forca >3){
            escapar();
        }else {
          virar();
        }
    }

    public void morte_zumbi() {
        System.out.println("Você não teve força o suficiente para lutar com ele e acabou morrendo canibalizado por ele.");
        Main.jogar_novamente();
    }

    public void escapar() {
        System.out.println("Você consegue escapar dele mas fica ferido pelas suas unhas, então corre");
        System.out.println("Você vê um carro com a porta aberta, entra nele e tenta ligá-lo para fugir dali");
        System.out.println("Após alguns metros andando com o carro você se sente tonto e cansado, você acha que é por ter acontecido muita coisa no último momento");
        carro();
    }

    public void carro() {
        espaco();
        System.out.println("Você consegue ligar o carro e fugir de onde você estava, mas alguns metros depois você encontra um homem acenando para o carro enquanto outras pessoas correm atrás dela");
        Main.espaco_escolhas();
            System.out.println("1)passar reto e não dar carona para ela;");
            System.out.println("2)parar o carro e dar carona para ela;");
            escolha = Scan.nextInt();
            if(escolha==1) {
                passar_reto();
            }else
            if(escolha==2) {
                dar_carona();
            }else {
              carro();
            }
    }

    public void passar_reto() {
        espaco();
        System.out.println("Você bate o carro e morre porque é pau no cu.");
        Main.jogar_novamente();
    }

    public void dar_carona() {
        Cap2.carona();
    }
}