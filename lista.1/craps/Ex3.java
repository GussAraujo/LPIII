import java.io.IOException;
import java.util.Random;

public class Ex3 {
  public static void main(String[] args) throws IOException {
    int[] dados = new int[2];
    int ponto = 0, lancamento = 0;
    Random gerador = new Random();

    System.out.println("Jogo do CRAPS!!!!");
    System.out.println("Aperte ENTER para jogar os 2 dados...");
    System.in.read();

    dados[0] = gerador.nextInt(6) + 1;
    dados[1] = gerador.nextInt(6) + 1; 

    ponto = dados[0] + dados[1];

    System.out.println("Valor dos dados: " + dados[0] + " e " + dados[1]);
    System.out.println("Ponto: " + ponto);

    if (ponto == 7 || ponto == 11) {
      System.out.println("Voce venceu!!!");
    } else if (ponto == 2 || ponto == 3 || ponto == 12) {
      System.out.println("Voce perdeu!!!");
    } else {
      System.out.println("\nIniciando segundo estagio...\n");
      lancamento++;
    }

    while (lancamento != 0) {
      int jogada;
      dados[0] = gerador.nextInt(6) + 1;
      dados[1] = gerador.nextInt(6) + 1;

      System.out.println("Valor dos dados: " + dados[0] + " e " + dados[1]);
      jogada = dados[0] + dados[1];

      System.out.println("Jogada " + lancamento++ + ": " + jogada);

      if (jogada == ponto) {
        System.out.println("Voce venceu!!!");
        break;
      }
    }
  }
}
