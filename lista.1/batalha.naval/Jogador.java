import java.util.Scanner;

class Jogador {
  private String nome;
  private Tabuleiro tabuleiro;

  public Jogador(String nome, Tabuleiro tabuleiro) {
    this.nome = nome;
    this.tabuleiro = tabuleiro;
  }

  public String getNome() {
    return nome;
  }

  public void jogar() {
    Scanner scanner = new Scanner(System.in);

    tabuleiro.exibir(false);

    int linha, coluna;
    System.out.println(this.nome+ ", enter hit row/column:");

    do{
      linha = scanner.nextInt();
      coluna = scanner.nextInt();
    } while(!tabuleiro.atirar(linha, coluna, nome));

    tabuleiro.exibir(false);
  }

  public boolean perdeu() {
    return tabuleiro.perdeu();
  }

  public void exibirTab() {
    tabuleiro.exibir(true);
  }
}