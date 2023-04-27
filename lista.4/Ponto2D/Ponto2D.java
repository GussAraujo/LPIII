import java.lang.Math;

public class Ponto2D {
  private int x, y;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void imprimirPonto() {
    System.out.println("x: " + x + " Y: " + y);
  }

  public boolean isEixoX() {
    if (x == 0) return true;
    else return false;
  }

  public boolean isEixoY() {
    if (y == 0) return true;
    else return false;
  }

  public int quadrante() {
    return
      (x > 0 && y > 0) ? 1:
      (x < 0 && y > 0) ? 2:
      (x < 0 && y < 0) ? 3:
      (x > 0 && y < 0) ? 4: 0;
  }

  public float distancia(int x, int y) {
    float distancia = (float) Math.pow((this.x - x), 2) + (float) Math.pow((this.y - y), 2);
    return (float) Math.pow(distancia, 0.5);
  }
}
