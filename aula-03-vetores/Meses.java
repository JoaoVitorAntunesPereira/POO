public class Meses{
  String[] meses = new String[12];

  //Método construtor
  //Executando automaticamente sempre que se cria objeto ou classe
  public Meses(){
    atriuirValores();
  }
  
  private void atriuirValores(){
    meses[0] = "Janeiro";
    meses[1] = "Fevereiro";
    meses[2] = "Março";
    meses[3] = "Abril";
    meses[4] = "Maio";
    meses[5] = "Junho";
    meses[6] = "Julho";
    meses[7] = "Agosto";
    meses[8] = "Setembro";
    meses[9] = "Outubro";
    meses[10] = "Novembro";
    meses[11] = "Dezembro";
  }

  public String pegarNomeMes(int pos){
    if(pos > 0 && pos < 13){
      return meses[pos -1];
    }else{
      return "";
    }
  }
}
