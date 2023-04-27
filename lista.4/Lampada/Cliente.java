import lampada.Lampada;
import lampada.LampadaAVenda;
import lampada.LampadaTresEstados;

public class Cliente {
  public static void main(String[] args) {
    Lampada lampada = new Lampada();
    lampada.setEstadoDaLampada("apagado");
    lampada.mostrarEstado();
    lampada.acende();
    lampada.mostrarEstado();

    System.out.println("------------------------------------");

    LampadaAVenda lampadaAVenda = new LampadaAVenda();
    lampadaAVenda.setTipo("LED");
    lampadaAVenda.setVoltagem(110);
    lampadaAVenda.setCor("amarela");
    lampadaAVenda.setMarca("philips"); 
    lampadaAVenda.setPreco(8);
    lampadaAVenda.setPotencia(4.5);

    System.out.println(lampadaAVenda.sobreALampada());

    System.out.println("------------------------------------");

    LampadaTresEstados lampadaTresEstados = new LampadaTresEstados();
    lampadaTresEstados.setEstadoDaLampada(100);
    lampadaTresEstados.mostrarEstado();
    lampadaTresEstados.setEstadoDaLampada(45);
    lampadaTresEstados.mostrarEstado();
    lampadaTresEstados.setEstadoDaLampada(0);
    lampadaTresEstados.mostrarEstado();
  }
}
