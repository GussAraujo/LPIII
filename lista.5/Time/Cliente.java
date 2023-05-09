public class Cliente {

  public static void main(String[] args) {
    Time time = new Time(12, 05);
    Time time2 = new Time(13, 25);
    System.out.println("Am? " + time.isAm());
    System.out.print("Passou quantos segundos de " + time.getHoras() + "hrs " + time.getMinutos() + "min até " + time2.getHoras() + "hrs " + time2.getMinutos() + "min? ");
    System.out.println(time.cron(time2) + "s");
    System.out.print(time.getHoras() + "hrs " + time.getMinutos() + "min");
    
    int secs = 3660;
    System.out.println(" adicionando " + secs +"s: ");
    time.addSeconds(secs);
    System.out.print(time.getHoras() + "hrs " + time.getMinutos() + "min");
  }
}