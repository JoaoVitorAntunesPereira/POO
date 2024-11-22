import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaAereo {
    private Companhia c1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception {
        SistemaAereo sa = new SistemaAereo();
        sa.c1 = new Companhia();
        sa.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Informe o nome da companhia: ");
        sa.c1.setNome(sa.reader.readLine());
        System.out.println("Informe a sede da companhia: ");
        sa.c1.setSede(sa.reader.readLine());

        sa.menu();
    }

    private void menu() throws Exception {
        String opcao = "0";
        String id;
        while (!opcao.equals("4")) {
            System.out.println("----------------------------------------------");
            System.out.println("[1] Cadastrar novo voo: ");
            System.out.println("[2] Listar voos existentes: ");
            System.out.println("[3] Consultar um voo: ");
            System.out.println("[4] Sair");
            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    cadastrarVoo();
                    break;
                case "2":
                    listarVoos();
                    break;
                case "3":
                    System.out.println("Informe o ID do voo: ");
                    id = this.reader.readLine();
                    consultarVoo(id);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }

    private void cadastrarVoo() throws Exception {
        Voo voo = new Voo();

        System.out.println("CADASTRO DO VOO");
        System.out.println("Informe o ID do voo");
        voo.setIdVoo(this.reader.readLine());
        System.out.println("Informe o destino: ");
        voo.setDestino(this.reader.readLine());
        System.out.println("Informe a origem: ");
        voo.setOrigem(this.reader.readLine());
        System.out.println("Informe a data do voo: ");
        voo.setData(this.reader.readLine());
        System.out.println("Informe a hora de saída do voo");
        voo.setHoraSaida(this.reader.readLine());
        System.out.println("-----CADASTRO DE PASSAGEIROS-----");

        for (int i = 0; i < 50; i++) {
            System.out.println("Informe o nome do passageiro: ");
            String nome = this.reader.readLine();
            
            if (nome.equals("")) {
                break;
            }
            
            Passageiro passageiro = new Passageiro();
            passageiro.setNome(nome);
            System.out.println("Informe a identificação do passageiro |Passaporte/CPF| :");
            passageiro.setIdPass(this.reader.readLine());

            boolean confirm = false;
            while (!confirm) {
                String[] assentos = voo.getAssentos();
                System.out.println("Assentos disponíveis:");
                int cont = 0;
                for (String assento : assentos) {
                    if (cont == 0) System.out.print("\nEconômica: ");
                    else if (cont == 25) System.out.print("\nExecutiva: ");
                    else if (cont == 40) System.out.print("\nPrimeira Classe: ");
                    System.out.print("[" + assento + "] ");
                    cont++;
                }

                System.out.println("\nEscolha um dos assentos:");
                String ass = this.reader.readLine();

                confirm = confirmarAssento(ass, passageiro, voo);
                if (confirm) {
                    System.out.println("Assento " + ass + " confirmado para " + nome);
                    Character classe = ass.charAt(ass.length() - 1);
                    Character.toUpperCase(classe);
                    passageiro.setClasse(classe == ('A') ? "Econômica" : (classe == ('B') ? "Executiva" : "Primeira Classe"));
                    passageiro.setNumAssento(ass);
                } else {
                    System.out.println("Assento inválido ou já ocupado. Escolha outro.");
                }
            }
            voo.setPassageiro(passageiro);
        }
        c1.setVoo(voo);
    }

    private void listarVoos() throws Exception {
        Voo voo = new Voo();
        int i = 0;
        while (voo != null){
            voo = c1.getVoo(i);
            if(voo == null){
                break;
            }
            System.out.println("Voo " + (i+1));
            System.out.println("ID: " + voo.getIdVoo() 
                             + " Origem: " + voo.getOrigem()
                             + " Destino: " + voo.getData()
                             + " Data: " + voo.getData()
                             + " Horário: " + voo.getHoraSaida());
            i++;
        }
    }

    private void consultarVoo(String id) throws Exception {
        Voo voo = new Voo();
        for(int i = 0; i < c1.getQtdVoos(); i++){
            voo = c1.getVoo(i);
            if(voo.getIdVoo().equalsIgnoreCase(id)){
                System.out.println("Voo: " + voo.getIdVoo() );
                System.out.println(" Origem: " + voo.getOrigem()
                                 + " Destino: " + voo.getData()
                                 + " Data: " + voo.getData()
                                 + " Horário: " + voo.getHoraSaida());

                System.out.println("----PASSAGEIROS----");
                Passageiro p = new Passageiro();
                for(int j = 0; j < voo.getQtdPass(); j++){
                    p = voo.getPassageiro(j);
                    System.out.println("Nome: " + p.getNome()
                                     + " Identificação: " + p.getIdPass()
                                     + " Classe: " + p.getClasse()
                                     + " Assento: " + p.getNumAssento());
                }
                System.out.println("Assentos disponíveis: " + (50 - voo.getQtdPass()));
            }else{
                System.out.println("Voo não encontrado");
            }
        }
    }

    private Boolean confirmarAssento(String ass, Passageiro p, Voo v) {
        String[] vetAss = v.getAssentos();

        for (int i = 0; i < vetAss.length; i++) {
            if (vetAss[i].equalsIgnoreCase(ass) && !vetAss[i].equals("XX")) {
                p.setNumAssento(vetAss[i]);
                v.setAssento(i, "XX");
                return true;
            }
        }
        return false;
    }
}
