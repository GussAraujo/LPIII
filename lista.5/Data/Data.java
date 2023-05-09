public class Data {
  
  private int dia;
  private int mes;
  private int ano;

  Data(int dia, int mes, int ano) {
    if ((dia >= 1) && (dia <= 31) && (mes >= 1) && (mes <= 12)) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      this.dia = 0;
      this.mes = 0;
      this.ano = 0;
    }
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
  
  public boolean isPrevious(Data outraData) {
    if(outraData.dia < dia || outraData.mes < mes || outraData.ano < ano) {
      return true;
    } else {
      return false;
    }
  }

  // public int nowManyDays(Data outraData) {
    
  // }

  // public String dayOfWeek() {

  // }
}
