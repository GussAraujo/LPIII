/**
 * Cliente
 */
public class Cliente {

  public static void main(String[] args) {
    Data data = new Data(25, 04, 2002);
    Data data2 = new Data(15, 02, 2002);
    System.out.print(data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
    System.out.print(" is previous of ");
    System.out.print(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
    System.out.println("? " + data.isPrevious(data2));
  }
}