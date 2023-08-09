package tfr.Tools.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import tfr.Tools.entities.enums.EstadoPagamento;

@Entity
public class PagamentoSemMontagem extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private Date dataEntrega;

	public PagamentoSemMontagem() {}

	public PagamentoSemMontagem(Long id, EstadoPagamento estado, Pedido pedido, Date dataEntrega) {
		super(id, estado, pedido);
		this.dataEntrega = dataEntrega;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
	
	
}
