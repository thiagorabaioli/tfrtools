package tfr.Tools.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import tfr.Tools.entities.Categoria;
import tfr.Tools.repositories.CategoriaRepository;
import tfr.Tools.services.exceptions.ObjectNotFound;
import org.springframework.data.domain.Sort.Direction;
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Dado não encontrado: id:" + id + " da classe: " +  Categoria.class.getName()));
	}
	
	public List<Categoria> findAll(){
		List<Categoria> list = repo.findAll();
		return list;
	}
	

	public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	

}
