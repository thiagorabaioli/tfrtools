package tfr.Tools.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import tfr.Tools.entities.enums.EstadoPagamento;

@Entity
public class PagamentoComMontagem extends Pagamento{
	
	
	private static final long serialVersionUID = 1L;
	
	
	@JsonFormat(pattern="dd/MM/yyyy")
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
