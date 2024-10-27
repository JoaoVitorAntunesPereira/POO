import java.util.Scanner;

public class Delegacia {
    Scanner Scan = new Scanner(System.in);
    int escolha;
    public Hospital hospital = new Hospital();
    Sul_do_pais viagem = new Sul_do_pais();

    public void delegacia(){
      Main.inicio.espaco();
        System.out.println("Vocês seguem em direção da delegacia, no caminho observam pessoas correndo atrás do carro. Elas estão sangrando e quase em estado de putrefação.");
        System.out.println("Quando chegam na delegacia, você para o carro na frente dela para que caso algo aconteça lá dentro tenham uma rota de fuga rápida.");
        Main.espaco_escolhas();
        System.out.println("Entrando nela percebem que ela está vazia, seguem andando para procurar armas");
        System.out.println("1) Seguir para o segundo andar");
        System.out.println("2) Ir para onde ficariam os detentos");
        escolha = Scan.nextInt();
        if(escolha == 1){
            segundo_andar();
        }else if(escolha == 2){
            detentos();
        }else {
          delegacia();
        }
    }

    public void segundo_andar(){
        System.out.println("No segundo andar você entra na sala do sargento, vê uma espada de decoração pendurada na parede");
        if(Main.obj.Inteligencia>2){
            Main.espaco_escolhas();
            System.out.println("1) Pegar a espada talvez ela seja útil");
            System.out.println("2) Não pegar a espada, é somente para decoração");
        }else{
            Main.espaco_escolhas();
            System.out.println("1) Pegar a espada");
            System.out.println("2) Não pegar a espada");
        }
        escolha = Scan.nextInt();
        if(escolha == 1){
            Main.inventario.espada = true;
            escadas();
        }else{
            escadas();
        }
    }

    public void escadas(){
        System.out.println("Ao descer as escadas você vê alguém vindo rapidamente em sua direção");
        if(Main.inventario.espada == true){
            matar_espada();
        }else{
            pular();
        }
    }

    public void pular(){
        if(Main.obj.Agilidade < 3){
            System.out.println("Você tenta passar por ela mas não consegue e acaba sendo agarrado por ela");
            if(Main.obj.Forca < 4){
                System.out.println("Você não teve força o suficiente para fugir dela e acabou sendo devorado");
                Main.jogar_novamente();
            }else{
                System.out.println("Você conseguiu fugir dela e descer para a parte de baixo da delegacia, mas mesmo assim ela não para de o seguir");
                paulo_matar_zumbi();
            }
        }else{
            System.out.println("Você consegue correr e passar por ela e chegar na parte de baixo da delegacia, mas mesmo assim ela não para de o seguir");
            paulo_matar_zumbi();
        }
    }

    public void paulo_matar_zumbi(){
        System.out.println("Mas então você vê Paulo que atira na pessoa");
        System.out.println("Obrigado, você diz");
        System.out.println("Fiz o mínimo, ele responde");
        detentos();
    }

    public void matar_espada(){
        System.out.println("Você saca a espada e golpeia na cabeça sem nem mesmo um pingo de receio");
        System.out.println("Após isso você sente com se não se importasse com o fato de ter matado uma pessoa, \"isso não é normal\", você pensa");
        System.out.println("Então você segue para a parte de baixo da delegacia onde encontra Paulo já armado");
        detentos();
    }

    public void detentos(){
        System.out.println("Então vocês seguem para onde ficariam os detentos");
        System.out.println("Lá encontram várias armas e munições, vocês pegam tudo o que podem para sairem o mais rápido dali");
        if(Main.inventario.espada == true){
            largar_espada();
        }else {
          sair_delegacia();
        }
    }

    public void largar_espada(){
        System.out.println("Você não quer largar essa espada já que temos armas agora? Pergunta Paulo");
        System.out.println("1) Acho que sim, agora ela vai mais atrapalhar do que ajudar");
        System.out.println("2) Acho que vou ficar mais um pouco com ela, agora tem um significado especial para mim.");
        escolha = Scan.nextInt();
        if(escolha == 1){
            System.out.println("Você então larga a espada");
            Main.inventario.espada = false;
            sair_delegacia();
        }else{
            System.out.println("Por que? Pergunta Paulo");
            System.out.println("Ela me ajudou lá em cima. Você responde");
            System.out.println("Então tá, espero que você a use bem");
            sair_delegacia();
        }
    }
    public void sair_delegacia(){
        System.out.println("Vocês então saem da delegacia e vão para o carro");
        Main.inventario.armas = true;
        if(Main.inventario.delegacia_hospital == true){
            hospital.hospital();
        }
        if(Main.inventario.sul_do_pais == false){
            System.out.println("Para onde vamos agora? Você pergunta a Paulo");
            System.out.println("Meu amigo também me disse que o lugar mais seguro era o sul do pais, nãos ei bem o por que mas eu acho que os militares devem estar lá");
            viagem.inicio_sul_do_pais();
        }
    }
}