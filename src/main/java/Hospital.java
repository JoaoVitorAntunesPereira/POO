public class Hospital {

    Sul_do_pais viagem = new Sul_do_pais();

    public void hospital(){
        System.out.println("Vocês seguem para o hospital. Ao chegar lá pecebem que ele está quase todo destruído, algo aconteceu lá");
        System.out.println("Ao adentrar nele pessoas mortas estão no chão, então vocês seguem até achar vários kits e suprimentos médicos");
        System.out.println("Mas então vocês veem uma horda de pessoas vindo atrás de vocês, então correm o mais rápido para o carro e fogem dali");
        Main.inventario.suprimentos_medicos = true;
        if(Main.inventario.delegacia_hospital == true){
            System.out.println("Não compensa usar armas contra eles");
            viagem.inicio_sul_do_pais();
        }

        if(Main.inventario.sul_do_pais == false){
            System.out.println("Para onde vamos agora? Você pergunta a Paulo");
            System.out.println("Meu amigo também me disse que o lugar mais seguro era o sul do pais, nãos ei bem o por que mas eu acho que os militares devem estar lá");
            viagem.inicio_sul_do_pais();
        }
    }
}