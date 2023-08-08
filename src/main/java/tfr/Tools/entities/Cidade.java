package tfr.Tools.entities;

public class Cidade {
	
	private Long id;
	private String name;
	private Estado estado;
	
	
	
	public Cidade() {}
	
	
	
	public Cidade(Long id, String name, Estado estado) {
		super();
		this.id = id;
		this.name = name;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	

}
