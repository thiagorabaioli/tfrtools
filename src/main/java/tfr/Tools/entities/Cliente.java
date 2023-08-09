package tfr.Tools.entities;

import java.util.ArrayList;




import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import tfr.Tools.entities.enums.TipoCliente;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String nif;
	private Integer tipo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	List<Pedido> pedidos = new ArrayList<>();
	

	
	@OneToMany(mappedBy="cliente", fetch = FetchType.EAGER)
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	


	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="TELEFONE")
	private Set<String> telefones = new HashSet<String>();
	
	public Cliente() {}

	public Cliente(Long id, String name, String email, String nif, TipoCliente tipo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.nif = nif;
		this.tipo = tipo.getCod();
	}
	
	

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo.getCod();
	}

	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	
	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	

}
