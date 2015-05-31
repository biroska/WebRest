package beans;

public class Album {

	private String nome;
	private int anoDeLancamento;
	private int id;
	
	public Album(){}
	
	public Album( int id, String nome, int anoDeLancamento ){
		
		this.id = id;
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}