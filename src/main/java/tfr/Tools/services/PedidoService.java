package tfr.Tools.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfr.Tools.entities.Pedido;
import tfr.Tools.repositories.PedidoRepository;
import tfr.Tools.services.exceptions.ObjectNotFound;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido findById(Long id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Dado não encontrado: id:" + id + " da classe: " +  Pedido.class.getName()));
	}

}
