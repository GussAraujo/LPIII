public class BatalhaNaval {
  public static void main(String[] args) {
    System.out.println("Welcome to Battleship!");

    System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
    Tabuleiro tabuleiro1 = new Tabuleiro(5, 5);
    tabuleiro1.posicionarNavios();

    System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
    Tabuleiro tabuleiro2 = new Tabuleiro(5, 5);
    tabuleiro2.posicionarNavios();

    Jogador jogador1 = new Jogador("PLAYER 1", tabuleiro2);
    Jogador jogador2 = new Jogador("PLAYER 2", tabuleiro1);

    Jogador jogadorAtual = jogador1;

    while (true) {
      System.out.println("Player " + jogadorAtual.getNome() + ", enter hit row/column:");
      jogadorAtual.jogar();

      if (jogadorAtual.perdeu()) {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;

        System.out.println();
        System.out.println(jogadorAtual.getNome() + " WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
        System.out.println("Final boards:");

        jogador1.exibirTab();
        jogador2.exibirTab();

        break;
      }

      jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }
  }
}