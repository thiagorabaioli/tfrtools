package tfr.Tools.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfr.Tools.entities.Categoria;
import tfr.Tools.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
