package tfr.Tools.entities;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private Integer id;
	private String name;
	private List<Cidade> cidades = new ArrayList<>();
	
	public Estado() {}
	
	public Estado(Integer id, String name, List<Cidade> cidades) {
		super();
		this.id = id;
		this.name = name;
		this.cidades = cidades;
	}
	
	
	

}
