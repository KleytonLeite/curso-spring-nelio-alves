package com.kleytonleite.cursospring.domain;



import java.util.Date;

import javax.persistence.Entity;

import com.kleytonleite.cursospring.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Date  dataVencimento;
	private Date  dataPagamentro;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamentro) {
		super(id, estado, pedido);
			this.dataVencimento = dataVencimento;
			this.dataPagamentro = dataPagamentro;

	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamentro() {
		return dataPagamentro;
	}

	public void setDataPagamentro(Date dataPagamentro) {
		this.dataPagamentro = dataPagamentro;
	}
	
	
	
}
