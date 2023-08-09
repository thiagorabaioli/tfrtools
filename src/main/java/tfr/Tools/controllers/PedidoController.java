package tfr.Tools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tfr.Tools.entities.Pedido;
import tfr.Tools.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
