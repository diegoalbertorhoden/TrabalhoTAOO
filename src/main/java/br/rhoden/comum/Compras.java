package br.rhoden.comum;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compras {
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Date getDatacompra() {
		return datacompra;
	}
	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
	}
	public String getValortotal() {
		return valortotal;
	}
	public void setValortotal(String valortotal) {
		this.valortotal = valortotal;
	}
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="produto")
	private String produto;
	@Column(name="datacompra")
	private Date datacompra;
	@Column(name="valortoral")
	private String valortotal;

}
