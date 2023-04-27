/**
 * Data
 */
public class Data {

  private int dia, mes, ano;

  public void inicializarData(int dia, int mes, int ano) {
    if (verificarData(dia, mes, ano)) {
      setDia(dia);
      setMes(mes);
      setAno(ano);
    } else {
      setDia(0);
      setMes(0);
      setAno(0);
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

  public boolean verificarData(int dia, int mes, int ano) {
    if ((dia >= 1) && (dia <= 31) && (mes >= 1) && (mes <= 12)) {
      return true;
    } else
      return false;
  }

  public void imprimirData() {
    if (mes < 10) System.out.println(dia + "/0" + mes + "/" + ano);
    else System.out.println(dia + "/" + mes + "/" + ano);
  }

  public void imprimirDataExtenso() {
    switch (mes) {
      case 1:
        System.out.println(dia + " de janeiro de " + ano);
        break;
      case 2:
        System.out.println(dia + " de fevereiro de " + ano);
        break;
      case 3:
        System.out.println(dia + " de março de " + ano);
        break;
      case 4:
        System.out.println(dia + " de abril de " + ano);
        break;
      case 5:
        System.out.println(dia + " de maio de " + ano);
        break;
      case 6:
        System.out.println(dia + " de junho de " + ano);
        break;
      case 7:
        System.out.println(dia + " de julho de " + ano);
        break;
      case 8:
        System.out.println(dia + " de agosto de " + ano);
        break;
      case 9:
        System.out.println(dia + " de setembro de " + ano);
        break;
      case 10:
        System.out.println(dia + " de outubro de " + ano);
        break;
      case 11:
        System.out.println(dia + " de novembro de " + ano);
        break;
      case 12:
        System.out.println(dia + " de dezembro de " + ano);
        break;
      default:
        break;
    }
  }
}