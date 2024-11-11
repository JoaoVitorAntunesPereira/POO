import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaAereo {
    private Companhia c1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception{
        SistemaAereo sa = new SistemaAereo();
        sa.c1 = new Companhia();
        sa.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Informe o nome da companhia: ");
        sa.c1.setNome(sa.reader.readLine());
        System.out.println("Informe a sede da companhia: ");
        sa.c1.setSede(sa.reader.readLine());

        sa.menu();
    }

    private void menu() throws Exception{
        String opcao = "0";

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
                    consultarVoo();
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
    }

    private void cadastrarVoo() throws Exception{
        Voo v = new Voo();
        
        System.out.println("CADASTRO DO VOO");
        System.out.println("Informe o ID do voo");
        v.setIdVoo(this.reader.readLine());
        System.out.println("Informe o destino: ");
        v.setDestino(this.reader.readLine());
        System.out.println("Informe a origem: ");
        v.setOrigem(this.reader.readLine());
        System.out.println("Informe a data do voo: ");
        v.setData(this.reader.readLine());
        System.out.println("Informe a hora de saída do voo");
        v.setHoraSaida(this.reader.readLine());

        for (int i = 0; i < 50; i++) {
            String nome;
            System.out.println("Informe o nome do passageiro: ");
            nome = this.reader.readLine();
            
            if (nome.equals("")) {
                break;
            }
            
            Passageiro passageiro = new Passageiro();
            passageiro.setNome(nome);
            System.out.println("Informe a identificação do passageiro |Passaporte/CPF| :");
            passageiro.setIdPass(this.reader.readLine());
            System.out.println("Informe a classe do assento do passageiro");
            passageiro.setClasse(this.reader.readLine());
        }
    }

    private void listarVoos() throws Exception{

    }

    private void consultarVoo() throws Exception{

    }
}
