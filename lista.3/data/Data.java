/**
 * Data
 */
public class Data {

  private int dia, mes, ano;

  public Data(int dia, int mes, int ano) {
    if (dataÉValida(dia, mes, ano)) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      this.dia = 0;
      this.mes = 0;
      this.ano = 0;
    }
  }

  public boolean dataÉValida(int dia, int mes, int ano) {
    if ((dia >=1) && (dia <= 31) && (mes >=1) && (mes <=12)) {
      return true;
    } else return false;
  }

  public void mostrarData() {
    System.out.println(dia + "/" + mes + "/" + ano);
  }
}