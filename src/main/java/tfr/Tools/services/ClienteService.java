package tfr.Tools.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfr.Tools.entities.Cliente;
import tfr.Tools.repositories.ClienteRepository;
import tfr.Tools.services.exceptions.ObjectNotFound;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente findById(Long id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Dado não encontrado: id:" + id + " da classe: " +  Cliente.class.getName()));
	}

}
