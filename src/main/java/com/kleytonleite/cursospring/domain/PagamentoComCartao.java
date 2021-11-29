package com.kleytonleite.cursospring.domain;

import javax.persistence.Entity;

import com.kleytonleite.cursospring.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	 
	private Integer numeroDePArcelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDePArcelas) {
		super(id, estado, pedido);
		this.numeroDePArcelas = numeroDePArcelas;
	}

	public Integer getNumeroDePArcelas() {
		return numeroDePArcelas;
	}

	public void setNumeroDePArcelas(Integer numeroDePArcelas) {
		this.numeroDePArcelas = numeroDePArcelas;
	}
	 
	
}
