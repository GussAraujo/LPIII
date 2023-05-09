public class Circulo {
  private int x, y, raio;

  Circulo(int x, int y, int raio) {
    this.x = x;
    this.y = y;
    this.raio = raio;
  }

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

  public int getRaio() {
    return raio;
  }

  public void setRaio(int raio) {
    this.raio = raio;
  }
  
  boolean isInnerPoint(Ponto2D p) {
    if (p.getX() < x && p.getY() < y){
      return true;
    } else {
      return false;
    }
  }

  public float area() {
    return (float)(3.14 * (raio * raio));
  }

  public float perimetro() {
    return (float)(2 * 3.14 * raio);
  }

  boolean isBiggerThan(Circulo c) {
    if (c.area() < this.area()) {
      return true;
    } else {
      return false;
    }
  }
}
