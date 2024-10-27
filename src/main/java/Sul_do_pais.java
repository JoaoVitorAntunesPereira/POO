import java.util.Scanner;

public class Sul_do_pais {
    Scanner Scan = new Scanner(System.in);
    int escolha;
    String nada;
    public void inicio_sul_do_pais(){
      Main.inicio.espaco();
        System.out.println("Então vocês seguem para o sul do pais");
        System.out.println("Você então dirige em caminho à cidade mais ao sul do país, mas você não está se sentindo tão bem e manchas e feridas começam a aprecer pelo seu corpo. Paulo nota que você não está bem");
      Main.inicio.espaco();
        System.out.println("Você está bem? Pergunta Paulo.");
        Main.espaco_escolhas();
        System.out.println("1) Sim");
        System.out.println("2) Não");
        escolha = Scan.nextInt();
        if(escolha == 1){
            certeza();
        }else if(escolha == 2){
            if(Main.inventario.suprimentos_medicos == true){
                tomar_remedios();
            }else{
                descansar();
            }
        }else{
            inicio_sul_do_pais();
        }
    }

    public void certeza(){
      Main.inicio.espaco();
        System.out.println("Você tem certeza? Parece meio pálido");
        if(Main.inventario.suprimentos_medicos == true){
            tomar_remedios();
        }else{
            descansar();
        }
    }

    public void tomar_remedios(){
      Main.inicio.espaco();
        System.out.println("Quer tomar alguns remédios?");
        Main.espaco_escolhas();
        System.out.println("1) Sim");
        System.out.println("2) Não");
        escolha = Scan.nextInt();
        if(escolha == 1){
            tomou_remedios();
        }else if(escolha == 2){
            nao_tomar();
        }else{
            tomar_remedios();
        }
    }

    public void tomou_remedios(){
      Main.inicio.espaco();
        System.out.println("Você então toma alguns remédios e vai para o banco do passageiro descansar enquanto Paulo dirige. Após alguns minutos já se sente um pouco melhor");
        mercado();
    }

    public void nao_tomar(){
      Main.inicio.espaco();
        System.out.println("Você não toma os remédios e somente vai para o banco de passageiro descansar enquanto Paulo dirige");
        Main.inventario.infeccao_rapida = true;
        mercado();
    }

    public void descansar(){
      Main.inicio.espaco();
        System.out.println("Você para de dirigir o carro e vai para o banco do carona descansar enquanto Paulo dirige");
        Main.inventario.infeccao_rapida = true;
        mercado();
    }

    public void mercado(){
        System.out.println("Vocês decidem parar em um mercado para pegar algumas coisas para comer enquanto viajam");
        System.out.println("Antes de saírem do carro vocês pegam algumas armas para tentar se protegerem caso tenhha alguém lá dentro");
        System.out.println("Chegando perto da entrada do mercado vocês vêem alguém estranho do outro lado da rua");
        Main.inicio.espaco();
        System.out.println("Paulo -Já faz um tempinho que eu estou pensando nisso, você vai dizer que é loucura mas essa é a única resposta que se encaixa mais no que está acontecendo aqui");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Do que que tu ta falando?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Paulo -Essas coisa são zumbis!");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Sinceramente, também acho.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Paulo -Sério?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Sim, mas agora a gente tem que descobrir o que ta causando isso.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Nesse momento em que vocês estão conversando veem uma nave passando pelo céu.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Paulo -Aquilo não me parece ser militar, mas se for eles esconderam por um bom tempo essa tecnologia.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Após isso vocês entram no mercado para pegar alguma coisa pra comer. Lá vocês veem um zumbi.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Já que eles não são mais humanos acho que não tem problema em matar, então Paulo atira nele e vocês pegam algumas coisas e saem do mercado.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Vocês entram no carro e seguem o caminho.");
        System.out.println("Depois de um longo caminho vocês chegam na cidade e veem a nave no topo de uma montanha.");
        if(Main.inventario.infeccao_rapida == true){
            passar_mal();
        }else{
            seguir();
        }
    }

    public void passar_mal(){
        System.out.println("Mas você começa a passar mal");
        if(Main.inventario.suprimentos_medicos == true) {
          System.out.println("Paulo -Você está bem? Eu disse pra tomar os remédios.");
            System.out.println("Pressione enter para continuar.");
            Scan.nextLine();
        }else {
            System.out.println("Paulo -Você está bem?");
            System.out.println("Pressione enter para continuar.");
            Scan.nextLine();
        }
        System.out.println("Você -To só um pouco cansado.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Paulo -Vem aqui, deixa que eu te ajudo a subir");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        seguir();
    }

    public void seguir(){
        System.out.println("Vocês seguem para a montanha para tentar entrar na nave, parece uma ideia idiota, mas vocês querem respostas");
        System.out.println("Você- Tu não acha estranho que o lugar mais seguro seja justamente onde começou tudo isso?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Paulo -Realmente. Não faz sentido, talvez a gente descubra alguma coisa lá dentro");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Vocês então sobem e entram na nave, lá dentro vocês veem capsulas com água e criaturas dentro delas, algumas aparentemente da Terra e outras que parecem ser de filmes de ficção científica.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Então de repente aparece um humanoide e vocês se assustam e se afastam dele.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Por mais que eu tenha começado isso eu quero ajudar vocês.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Então tudo isso é culpa sua?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Infelizmente, eu cai no seu planeta devido a eu ter entrado em um buraco negro e ter sido atingido por um meteoro, por iso eu cai aqui.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -O que você sabe sobre os zumbis.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Zumbis? Então é assim que vocês estão chamando os infectados.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Você pode curar eles?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Sim, e você também. Diz ele apontando para você");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Como assim me curar?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Desde o momento em que eu vi você percebi que estava infectado, você quer que eu te cure?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Sim, mas você terá que curar todos os outros.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Você terá que vim comigo então.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Mas por que?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Além do seu exército estar atrás de mim eu não ter conhecimento sobre a sua espécie, o que dificulta na criaçao de um antídoto para o vírus.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -E para onde eu iria com você?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Alien -Não precisamos ir tão longe, somente subir longe o suficiente para que eles não me ataquem, e vai ser só por um curto período de tempo já que minha nave está meio danificada.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        escolhas_finais();
    }

    public void escolhas_finais() {
        if(Main.inventario.armas == true) {
            Main.espaco_escolhas();
          System.out.println("1) Apontar a arma pra ele e o obrigar a ficar e curar todo mundo.");
          System.out.println("2) Tudo bem, se você voltar eu aceito.");
          escolha = Scan.nextInt();
          if(escolha == 2) {
            ir_com_ele();
          }else if(escolha == 1) {
            matar_alien();
          }else {

          }
        }else {
          ir_com_ele();
        }
    }

    public void matar_alien() {
      System.out.println("Você então aponta a arma pra ele e o obriga a ficar.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Por que? Eu disse que ajudaria você.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você -Acha mesmo que vou acreditar em você? Eu vi corpos humanos lá na entrada, o que você quer com a gente?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Vocês são uma raça interessante, já os observo a um bom tempo, sempre quis saber como os vírus se comportam em vocês.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      if(Main.inventario.infeccao_rapida == true) {
        final_6();
      }else {

      }
      System.out.println("Ele rapidamente avança para cima de você, então Paulo e você atiram nele, nada acontece.");
      if(Main.inventario.espada == true) {
        final_5();
      }else {
        final_4();
      }
    }

    public void ir_com_ele() {
      System.out.println("Tudo bem, se você voltar eu aceito.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Vocês então entram na nave e ela começa a subir.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      if(Main.inventario.infeccao_rapida == true) {
        virar_zumbi();
      }else {
        final_3();
      }
    }

    public void virar_zumbi() {
      System.out.println("Você começa a sentir dores de cabeça e ficar tonto.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Devido ao vírus estar muito avançado você está se tornando um zumbi, não sei se poderei fazer alguma coisa.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você então perde neste momento todas as suas características humanas e avança em direção a Paulo mordendo-o e arranhando-o.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Então o alien humanoide tenta prender você para que não faça mais nada.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      if(Main.inventario.armas == true) {
        final_2();
      }else {
        final_1();
      }
    }

    public void final_1() {
      System.out.println("Você é preso e colocado nas jaulas junto com os outros, você ja perdeu tudo, sua família, amigos e até mesmo quem você era.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("A partir de agora todo o resto de sua vida, se você ainda estiver \"vivo\" será dentro de um laboratório sendo testado como uma cobaia.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      fim();
    }

    public void final_2() {
      System.out.println("Mas Paulo joga você para longe e atira no alien, ele erra todos os tiros e danifica a nave, que começa a cair.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Seu idiota, todos nós vamos morrer, eu devia ter matado vocês quando tive a chance, por isso que todos odeiam os seres humanos.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("A nave cai em cima de uma usina nuclear, fazendo ela explodir e espalhar radiação e o vírus, agora radioativo, por toda a atmosfera.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Agora todos e tudo começam a sofrer mutações, depois disso o mundo nunca mais será o mesmo.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      fim();
    }


    public void final_3() {
      System.out.println("Ela começa a acelerar e subir muito.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você -Eu acho que estamos indo muito longe.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Sim, para o meu planeta, já tenho o que preciso daqui.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você -Seu desgraçado, eu sabia que estava mentindo.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Se soubesse mesmo não tinha vindo comigo.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Paulo -Ele tem razão.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Mas a nave sobe muito e bate num asteroide fazendo-a explodir e matar todos vocês.");
      fim();
    }

    public void final_4() {
      System.out.println("Então ele o ataca matando-o.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Deveria ter aceitado servir como um experimento para mim, quem sabe eu até pensase em salvar esse planetinha de merda casso você fosse uma boa cobaia.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Paulo tenta acertar uma facada nele mas é jogado da nave tão longe que faz ele cair da montanha.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -Ele não era importante, já você, queria você vivo, mas do jeito que está serve.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Então a nave começa a subir e você dá seus últimos suspiros.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Ter ido com ele talvez teria sido uma boa opção.");
      fim();
    }

    public void final_5() {
      System.out.println("Você então pega sua espada e perfura o peito do alien.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Alien -O que você fez? Seu burro, eu era o único que poderia curar todos vocês.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você -Como se você fosse fazer isso.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Paulo -Você sabe que acabou de fadar toda a humanidade a um apocalipse né?");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você -Não é como se nós tivéssemos alguma escolha.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      fim();
    }

    public void final_6() {
      System.out.println("Ele rapidamente avança para cima de você.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      System.out.println("Você tenta atirar mas não consegue pois começa a se sentir fraco, então ele mata-o e o joga para fora da nave, você morreu.");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
      fim();
    }

    public void fim() {
      System.out.println("Obrigado por jogar.");
      Main.jogar_novamente();
    }
}