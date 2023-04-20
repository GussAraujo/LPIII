public class ContaBancariaSimplificada {
  
  String nomeDoCorrentista;
  double saldo;
  boolean contaÉEspecial;

  public ContaBancariaSimplificada(String nome, double deposito, boolean especial) {
    if (especial) abreContaEspecial(nome, deposito);
    else abreContaSimples(nome, deposito);
  }

  public void abreContaEspecial(String nome, double deposito) {
    nomeDoCorrentista = nome;
    saldo = deposito;
    contaÉEspecial = true;
  }

  public void abreContaSimples(String nome, double deposito) {
    if (deposito < 0) {
      System.err.println("Sua conta não pode ter saldo negativo!");
      deposito = 0;
    }
    nomeDoCorrentista = nome;
    saldo = deposito;
    contaÉEspecial = false;
  }

  public void setDeposito(double valor) {
    saldo += valor;
  }

  public void retirarValor(double valor) {
    if (!contaÉEspecial) {
      if (valor <= saldo) {
        saldo -= valor;
      }
    } else {
      saldo -= valor;
    }
  }

  public void mostrarDados() {
    System.out.println("O nome do correntista é: " + nomeDoCorrentista);
    System.out.println("Saldo: R$" + saldo);
    if (contaÉEspecial) System.out.println("A conta é especial!"); 
    else System.out.println("A conta é comum!");
  }
}
