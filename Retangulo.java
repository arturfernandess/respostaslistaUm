package listaUm;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo (double b, double a) {
		this.base = b;
		this.altura = a;
		
	}
	
	public double getBase () {
		return base;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setBase (double b) {
		this.base = b;
		
	}
	
	public void setAltura (double a) {
		this.altura = a;
		
	}
	
	public double CalcularArea () {
		return (this.base * this.altura);
	}
	
	public double CalcularPerimetro () {
		return (2 * this.base) +  (2 * this.altura);
		
	}
}
