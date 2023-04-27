public class Cliente {
  public static void main(String[] args) {
    Contato contato = new Contato();

    contato.inicializarContato("Gustavo", "gustavo@outlook.com", "99972-5488", "25/04/2002");
    contato.imprimirContato();
    contato.calcularIdade();
  }
}
