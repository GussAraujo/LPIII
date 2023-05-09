/**
 * Client
 */
public class Client {

  public static void main(String[] args) {
    Ponto2D ponto = new Ponto2D(5, -5);
    System.out.println("Quadrante: " + ponto.quadrante());
    System.out.println("Distancia euclidiana: " + ponto.distancia(2, 3));
  }
}