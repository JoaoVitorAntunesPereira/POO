public class Passageiro {
    private String nome;
    private String idPass;
    private String numAssento;

    // Tornar o vetor de assentos estático e compartilhado entre todos os passageiros
    private static String[] assentos = new String[50];

    // Inicializar o array de assentos uma única vez
    static {
        for (int i = 0; i < 25; i++) {
            assentos[i] = (i + 1) + "A";
        }
        for (int i = 25; i < 40; i++) {
            assentos[i] = (i - 24) + "B";
        }
        for (int i = 40; i < 50; i++) {
            assentos[i] = (i - 39) + "C";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPass() {
        return idPass;
    }

    public void setIdPass(String idPass) {
        this.idPass = idPass;
    }

    public String getNumAssento() {
        return numAssento;
    }

    public void setNumAssento(String numAssento) {
        this.numAssento = numAssento;
    }

    public static String[] getAssentos() {
        return assentos;
    }

    public static void setAssento(int i, String a) {
        assentos[i] = a;
    }
}
