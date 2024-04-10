package listaUm;

public class Gato {
	private String nome;
	private String raça;
	private int idade;
	
	
	public Gato (String n, String r, int i) {
		this.nome = n;
		this.raça = r;
		this.idade = i;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String n) {
		this.nome = n;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String r) {
		this.raça = r;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int i) {
		this.idade = i;
	}	
	
	public String miar() {
		return "miau"; 
	}
	public String toString () {
		return "Nome:" + nome + "\nRaça:" + raça + "\nIdade:" + idade; 
	}

	
}
