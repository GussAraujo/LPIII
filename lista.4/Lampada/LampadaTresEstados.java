package lampada;
public class LampadaTresEstados {

  private int estadoDaLampada;

  public void setEstadoLampada(int estadoDaLampada) {
    this.estadoDaLampada = estadoDaLampada;
  }

  public int getEstadoDaLampada() {
    return estadoDaLampada;
  }

  public void setEstadoDaLampada(int estadoDaLampada) {
    this.estadoDaLampada = estadoDaLampada;
  }

  public void mostrarEstado() {
    if (estadoDaLampada == 100) {
      System.out.println("acesa");
    } else if (estadoDaLampada == 0) {
      System.out.println("apagada");
    } else {
      System.out.println("meia-luz");
    }
  }
}
