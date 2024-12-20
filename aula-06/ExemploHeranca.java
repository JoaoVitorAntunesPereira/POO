public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("nullo");
        p1.setEmail("mail@mail.main");
        p1.setIdade(12);
        System.out.println("Nome da pessoa 1: " + p1.getNome());

        Pessoa p2 = new Pessoa("joao", "joaomial@gmail.com", 18);

        Aluno a1 = new Aluno();
        a1.setNome("nulla");
        a1.setEmail("a@gmail.com");
        a1.setIdade(0);
        a1.setNota1(1);
        a1.setNota2(2);
        a1.setNota3(3);
        a1.setNota4(4);

        Aluno a2 = new Aluno(4, 1, 4, 1, "joa", "aaaaaaaaaa@gmail.com", 54);
    }
}
