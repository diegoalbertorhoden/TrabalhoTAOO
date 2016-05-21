package br.rhoden.comum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Cliente")

public class Cliente {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="telefone")
	private String telefone;
	@Column(name="endereco")
	private String endereco;
	@OneToMany(mappedBy = "id", targetEntity = Compras.class, fetch = FetchType.LAZY)
	private String idcompras;
	
	
	public String getIdcompras() {
		return idcompras;
	}

	public void setIdcompras(String idcompras) {
		this.idcompras = idcompras;
	}

	public Cliente() {
		
	}
	
	public Cliente(String nome, String telefone, String endereco){
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}