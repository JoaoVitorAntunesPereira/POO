public class ExemploString {
    public static void main(String[] args) {
        String str1, str2, str3;
        str1 = "   Um texto qualquer. ..         ";
        System.out.println("[" + str1 + "]");
        str1 = str1.trim();
        System.out.println("[" + str1 + "]");

        System.out.println("Tamanho do String str1: " + str1.length());

        //Substituir uma substring dentro de um String

        str2 = str1.replace("texto", "teste");
        System.out.println("[" + str2 + "]");
        str2 = str2.replace("e","x");
        System.out.println("[" + str2 + "]");

        //Copiar substring

        str2 = str1.substring(9, 17);
        System.out.println("[" + str2 + "]");

        //procurar substring
        str1 = "humberto.beneduzzi@ifpr.edu.br";
        int pos = str1.indexOf("@");
        System.out.println("@ está na posição " + pos);

        String nome = str1.substring(0, str1.indexOf("@"));
        nome = nome.replace(".", " ");
        System.out.println("Nome: "+nome);

        String ende = str1.substring((pos+1), (str1.length()));
        System.out.println("Domínio: " + ende);

        //Quebrar String em vetor
        String valores = "4/6/4/24/54/24";
        String[] arrayValores = valores.split("/");
        for (String valor : arrayValores) {
            System.out.print("["+valor+"] ");
        }
    }
}
