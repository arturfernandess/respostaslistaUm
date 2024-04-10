package listaUm;

public class Produto {
	private String nome;
	private double preço;
	private int quant;
	
	public Produto (String n, double p, int q) {
		this.nome = n;
		this.preço = p;
		this.quant = q;
	}
	
	public String getNome () {
		return nome;
	}
	
	public double getPreço () {
		return preço;
	}
	
	public int getQuant () {
		return quant;
	
	}
	
	public void setNome (String n){
		this.nome = n;
	}
	
	public void setPreço (double p) {
		this.preço = p;
		
	}
	
	public void setQuant (int q) {
		this.quant = q;
	}
	
	public double CalcularTotal () {
		return (this.preço * this.quant);
		
	}
	
	
	
}
