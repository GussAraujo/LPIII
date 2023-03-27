/**
 * Ex2
 */
import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    int n = 3;
    double[] voltagens = new double[n];
    double media = 0, desvioPadrao = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.println("Digite a voltagem " + (i + 1) + ":");
      voltagens[i] = sc.nextDouble();

      media += voltagens[i];
    }
    
    media /= n;

    for (int i = 0; i < n; i++) {
      desvioPadrao += Math.pow((voltagens[i] -  media), 2);
    }

    desvioPadrao = Math.sqrt(desvioPadrao/n);

    System.out.println("Media: " + media);
    System.out.println("Desvio Padrao: " + desvioPadrao);
  }
}
