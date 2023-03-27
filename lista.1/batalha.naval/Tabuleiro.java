import java.util.Scanner;

class Tabuleiro {
  private char[][] tabuleiro;
  private int tamanho;
  private int numNavios;

  public Tabuleiro(int tamanho, int numNavios) {
    this.tamanho = tamanho;
    this.numNavios = numNavios;
    this.tabuleiro = new char[tamanho][tamanho];

    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        tabuleiro[i][j] = '-';
      }
    }
  }

  public void posicionarNavios() {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < numNavios; i++) {
      System.out.println("Enter ship " + (i + 1) + " location:");
      int linha, coluna;
      do {
        linha = scanner.nextInt();
        coluna = scanner.nextInt();
      } while (!posicionarNavio(linha, coluna));
    }

    this.exibir(true);
  }

  private boolean posicionarNavio(int linha, int coluna) {
    if (linha > 4 || coluna > 4 || linha < 0 || coluna < 0) {
      System.out.println("Invalid coordinates. Choose different coordinates.");
      return false;
    } else if (tabuleiro[linha][coluna] == '@') {
      System.out.println("Invalid coordinates. Choose different coordinates.");
      return false;
    }

    tabuleiro[linha][coluna] = '@';
    return true;
  }

  public boolean atirar(int linha, int coluna, String nome) {
    if (linha > 4 || coluna > 4 || linha < 0 || coluna < 0) {
      System.out.println("Invalid coordinates. Choose different coordinates.");
      return false;
    } else if (tabuleiro[linha][coluna] == '@') {
      tabuleiro[linha][coluna] = 'X';
      System.out.println(nome + " HIT SHIP!\n");
      return true;
    } else {
      tabuleiro[linha][coluna] = 'O';
      System.out.println(nome + " MISSED!");
      return true;
    } 
  }

  public boolean perdeu() {
    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < tamanho; j++) {
        if (tabuleiro[i][j] == '@') {
          return false;
        }
      }
    }
    return true;
  }

  public void exibir(boolean mostrarNavios) {
    System.out.println("  0 1 2 3 4");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < tamanho; j++) {
        if (!mostrarNavios && tabuleiro[i][j] == '@') {
          System.out.print("- ");
        } else {
          System.out.print(tabuleiro[i][j] + " ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }
}