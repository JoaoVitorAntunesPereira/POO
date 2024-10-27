import java.util.Scanner;

public class Cap2_carona {
    public void espaco() {
        System.out.println("                            ");
        System.out.println("==============================================================================================================================================================================================");
        System.out.println("         ");
    }

    public Scanner Scan = new Scanner(System.in);
    public int escolha;
    public Hospital hospital = new Hospital();
    public Delegacia delegacia = new Delegacia();

    public void carona() {
        espaco();
        System.out.println("Você para o carro então um homem entra no carro e vocês saem dali o mais rápido possível");
        Main.espaco_escolhas();
        System.out.println("1) Você sabe oq esta acontecendo?");
        System.out.println("2) Você está bem?");
        escolha = Scan.nextInt();
        if(escolha==1) {
            escolha01();
        }else if(escolha == 2){
            escolha02();
        }else {
          carona();
        }
    }

    public void escolha02() {
        espaco();
        System.out.println("Ele- Sim, eu cai enquanto corria deles mas não foi nada demais");
        System.out.println("Você- Você sabe oq esta acontecendo?");
        escolha01();
    }

    public void escolha01() {
        espaco();
        System.out.println("Não muito bem. Até onde eu sei o governo  está por trás disso pelo que um amigo meu do exército me falou.");
        Main.espaco_escolhas();
        System.out.println("1) O que seu amigo sabe sobre isso?");
        System.out.println("2) Você ainda tem contato com ele?");
        escolha = Scan.nextInt();
        if (escolha==1) {
            escolha03();
        }else if(escolha == 2){
            escolha04();
        }else {
          escolha01();
        }
    }

    public void escolha03() {
        espaco();
        System.out.println("Ele- Ele ligou para mim alguns dias atrás e só disse para pegar minhas coisas e fugir para outro país pq aqui não era mais seguro");
        System.out.println("Você- Por que aqui não é mais seguro?");
        escolha05();
    }

    public void escolha04() {
        espaco();
        System.out.println("Ele ligou para mim alguns dias atrás e só disse para pegar minhas coisas e fugir para outro país pq aqui não era mais seguro, depois disso não falei mais com ele");
        Main.espaco_escolhas();
        System.out.println("1) Ele deve estar bem.");
        System.out.println("2) Por que aqui não é mais seguro?");
        escolha = Scan.nextInt();
        if(escolha == 1){
            escolha06();
        }else if(escolha == 2){
            escolha05();
        }else {
          escolha04();
        }
    }

    public void escolha05() {
        espaco();
        System.out.println("Ele- Eu não sei, ele não me disse mais nada e desligou, parece que é uma guerra em algum lugar");
        System.out.println("Você- Mas que guerra é essa que nenhum lugar do país é seguro?");
        System.out.println("Ele- Também quero saber");
        System.out.println("Você- Aliás qual o seu nome?");
        System.out.println("Ele- Paulo e o seu");
        System.out.println("Você- Meu nome é Rodrigues");
        escolha07();
    }

    public void escolha06() {
        espaco();
        System.out.println("Ele-Tomara que sim, ele também me disse que estava indo para o sul do pais e que isso seria muito importante para todos nós");
        System.out.println("Você- Por que aqui não é mais seguro?");
        Main.inventario.sul_do_pais = true;
        escolha05();
    }

    public void escolha07(){
        espaco();
        System.out.println("Vocês seguem a estrada por cerca de mais 5 minutos e ao longo da estrada observam como toda a cidade está quase sendo dizimada por pessoas se matando por medo do que está acontecendo.");
        System.out.println("Paulo diz: Aqui por perto tem um mercado e uma delegacia, qual você acha que seria melhor de irmos?");
        Main.espaco_escolhas();
        System.out.println("1) Ir para o hospital em busca de suprimentos para tentar se curar");
        System.out.println("2) Ir para a delegacia e tentar se armar para se proteger");
        if(Main.inventario.sul_do_pais == true){
            System.out.println("3) Ir para a delegacia e depois ir para o hospital que é em direção ao fim da cidade e ao sul do pais");
        }
        escolha = Scan.nextInt();
        if(escolha == 1){
            hospital.hospital();
        }else if(escolha == 2){
            delegacia.delegacia();
        }else if(escolha == 3){
            Main.inventario.delegacia_hospital = true;
            delegacia.delegacia();
        }else {
          escolha07();
        }
    }
}