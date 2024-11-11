public class Turma {
  private int nroTurma;
  private String nomeCurso;
  private int anoIngresso;
  private int qtdeAlunos;
  private Aluno[] vetAlunos;

  public Turma(){
      this.vetAlunos = new Aluno[40];
  }

  public int getNroTurma(){
      return this.nroTurma;
  }

  public void setNroTurma(int nt){
      this.nroTurma = nt;
  }

  public String getNomeCurso() {
      return nomeCurso;
  }

  public void setNomeCurso(String nomeCurso) {
      this.nomeCurso = nomeCurso;
  }

  public int getAno() {
      return anoIngresso;
  }

  public void setAno(int ano) {
      this.anoIngresso = ano;
  }    

  public int getQtdeAlunos(){
      return this.qtdeAlunos;
  }

  public Aluno getAluno(int pos){
      return vetAlunos[pos];
  }

  public void setAluno(Aluno a){
      if(this.qtdeAlunos < 40){
          this.vetAlunos[qtdeAlunos] = a;
          qtdeAlunos++;
      }
  }
}
