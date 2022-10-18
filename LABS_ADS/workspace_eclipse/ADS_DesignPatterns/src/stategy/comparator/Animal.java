package stategy.comparator;

public class Animal extends Object{

	private Long id;
	
	private String nome;

	//ctrl+3 > gcuf
	public Animal(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	//ctrl+3 > ggas
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}
