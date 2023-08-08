package tfr.Tools.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfr.Tools.entities.Categoria;
import tfr.Tools.repositories.CategoriaRepository;
import tfr.Tools.services.exceptions.ObjectNotFound;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Dado não encontrado: id:" + id + " da classe: " +  Categoria.class.getName()));
	}

}
