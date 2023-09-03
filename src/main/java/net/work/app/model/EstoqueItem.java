package net.work.app.model;

import jakarta.persistence.*; 

@Entity
@Table(name = "EstoqueItem")

public class EstoqueItem {
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
  
  @Column(name = "nome")
	private String nome;
  
  @Column(name = "descricao")
	private String descricao;
  
  @Column(name = "quantidade")
	private int quantidade;
  
  @Column(name = "preco")
	private double preco;
  
  public EstoqueItem(){}
  
	public long getId() {
    return id;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public int getQuantidade() {
    return quantidade;
  }
  
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public double getPreco() {
    return preco;
  }
  
  public void setPreco(double preco) {
    this.preco = preco;
  }
}
