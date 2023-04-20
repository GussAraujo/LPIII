package lampada;
/**
 * Lampada
 */
public class Lampada {

  private String estadoDaLampada;

  public void acende() {
    estadoDaLampada = "aceso";
  }

  public void apaga() {
    estadoDaLampada = "apagado";
  }

  public boolean estaLigada() {
    if (estadoDaLampada == "aceso") return true;
    else return false;
  }

  public void mostrarEstado() {
    if (estadoDaLampada == "aceso") System.out.println("A lampada esta acesa!");
    else System.out.println("A lampada esta apagada!");
  }
}