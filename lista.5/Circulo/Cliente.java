/**
 * Cliente
 */
public class Cliente {

  public static void main(String[] args) {
    Circulo circulo = new Circulo(5, 5, 10);
    Circulo circulo2 = new Circulo(7, 5, 10);
    System.out.println("Area: " + circulo.area());
    System.out.println("Perimetro: " + circulo.perimetro());
    System.out.println(circulo2.area() +" is bigger? " + circulo.isBiggerThan(circulo2));
    Ponto2D ponto = new Ponto2D(5, -5);
    System.out.println(ponto.getX() + " and " + ponto.getY() + " is inner? " + circulo.isInnerPoint(ponto));
  }
}