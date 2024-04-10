package listaUm;

public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	
	public ContaCorrente (int n, double s) {
		this.numeroConta = n;
		this.saldo = s;
		
	}
	
	public int getNumeroDaConta () {
		return numeroConta;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setNumeroConta (int n) {
		this.numeroConta = n;
	}
	
	public void setSaldo (double s) {
		this.saldo = s;
	}
	public double depositar (double Deposito) {
		return this.saldo += Deposito;
	}
	public double sacar (double Saque) {
		return this.saldo -= Saque;  
	}
	public String toString () {
		return "Conta:" + numeroConta + "\nSaldo:R$" + saldo;
	}
	
}
