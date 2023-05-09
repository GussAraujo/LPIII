public class Cliente {
  public static void main(String[] args) {
    Lampada lampada = new Lampada("apagado");
    lampada.mostrarEstado();
    lampada.acende();
    lampada.mostrarEstado();

    System.out.println("------------------------------------");

    LampadaAVenda lampadaAVenda = new LampadaAVenda("LED", 220, "azul", "consul", 10, 5.5);
    lampadaAVenda.setTipo("LED");
    lampadaAVenda.setVoltagem(110);
    lampadaAVenda.setCor("amarela");
    lampadaAVenda.setMarca("philips"); 
    lampadaAVenda.setPreco(8);
    lampadaAVenda.setPotencia(4.5);

    System.out.println(lampadaAVenda.sobreALampada());

    System.out.println("------------------------------------");

    LampadaTresEstados lampadaTresEstados = new LampadaTresEstados(100);
    lampadaTresEstados.setEstadoDaLampada(100);
    lampadaTresEstados.mostrarEstado();
    lampadaTresEstados.setEstadoDaLampada(45);
    lampadaTresEstados.mostrarEstado();
    lampadaTresEstados.setEstadoDaLampada(0);
    lampadaTresEstados.mostrarEstado();
  }
}
