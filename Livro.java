package listaUm;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoP;
	public Livro(String titulo, String autor, String editora, int anoP) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoP = anoP;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoP() {
		return anoP;
	}
	public void setAnoP(int anoP) {
		this.anoP = anoP;
	}
	
	


}
