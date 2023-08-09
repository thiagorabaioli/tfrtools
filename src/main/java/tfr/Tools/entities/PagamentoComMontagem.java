package tfr.Tools.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import tfr.Tools.entities.enums.EstadoPagamento;

@Entity
public class PagamentoComMontagem extends Pagamento{
	
	
	private static final long serialVersionUID = 1L;
	
	private Date dataMontagem;

	public PagamentoComMontagem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagamentoComMontagem(Long id, EstadoPagamento estado, Pedido pedido, Date dataMontagem) {
		super(id, estado, pedido);
		this.dataMontagem = dataMontagem;
	}

	public Date getDataMontagem() {
		return dataMontagem;
	}

	public void setDataMontagem(Date dataMontagem) {
		this.dataMontagem = dataMontagem;
	}
	
	

}
