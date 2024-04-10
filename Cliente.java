package listaUm;

public class Cliente {
	private String nome;
	private String cpf;
	private Data dataNasc;
	
	public Cliente (String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.dataNasc = d;	
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getCpf () {
		return cpf;
	}
	
	public Data getDataNasc () {
		return dataNasc;
	}
	
	public void setNome (String n) {
		this.nome = nome;
	}
	
	public void setCpf (String c) {
		this.cpf = c;
	}
	
	public void setDataNasc (Data d) {
		this.dataNasc = d;
	}

}
