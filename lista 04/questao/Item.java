﻿
public class Item{
	int codigo;
	int quantidadeVendida;
	Produto;
	
	public void setCodigo(){
		this.codigo = codigo;
	}
	public void setQuantidadeVendida(){
		this.QuantidadeVendida = QuantidadeVendida;
	}
	public void setProduto(){
		this.Produto = Produto;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	public int getQuantidadeVendida(){
		return this.QuantidadeVendida;
	}
	public Produto getProduto(){
		return Produto;
	}
	
	public Item(int codigo, int quantidadeVendida, Produto){
		this.codigo = codigo;
		this.QuantidadeVendida = QuantidadeVendida;
		this.Produto = Produto;
	}
	
}