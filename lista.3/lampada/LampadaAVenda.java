package lampada;
/**
 * Lampada
 */
public class LampadaAVenda {

  private String tipo,cor,marca;
	private int voltagem;
	private double preco, potencia;

	public LampadaAVenda() {}
  
	public LampadaAVenda(String tipo, int voltagem, String cor, String marca, double preco, double potencia) {
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
	}

	public String getTipo() {
		return this.tipo;
	}
	public int getVoltagem() {
		return this.voltagem;
	}
	public String getCor() {
		return this.cor;
	}
	public String getMarca() {
		return this.marca;
	}
	public double getPreco() {
		return this.preco;
	}
	public double getPotencia() {
		return this.potencia;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String sobreALampada() {
		String retorno="";

		retorno += "Sobre a lâmpada:\n";
		retorno += "  Tipo: "+this.tipo+"\n";
		retorno += "  Voltagem: "+this.voltagem+"\n";
		retorno += "  Cor: "+this.cor+"\n";
		retorno += "  Marca: "+this.marca+"\n";
		retorno += "  Preço: "+this.preco+"\n";
		retorno += "  Potência: "+this.potencia+"\n";

		return retorno;
	}
}