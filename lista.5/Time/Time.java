public class Time {
  
  private int horas;
  private int minutos;

  Time(int horas, int minutos) {
    if(horas < 24 && minutos < 60){
      this.horas = horas;
      this.minutos = minutos;
    } else {
      this.horas = 0;
      this.minutos = 0;
    }
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public boolean isAm() {
    if (horas < 12) {
      return true;
    } else { 
      return false;
    }
  }

  public int cron(Time outraHora) {
    int h = outraHora.horas - horas;
    int m = outraHora.minutos - minutos;
    
    return (h*60 + m)*60;
  }

  public void addSeconds(int secs) {
    int aux = secs / 60;

    if(aux < 60){
      minutos += aux;
    } else {
      horas += aux/60;
      if (aux > 60) {
        aux /= 60;
        minutos += aux;
      }
    }
  }
}
