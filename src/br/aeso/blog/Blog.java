package br.aeso.blog;

import java.util.List;

public class Blog {
	private String data;
	private Usuario dono;
	private String titulo;
	private List<Conteudo> ListaConteudo;
	
	public Blog(String data, Usuario dono, String titulo, List<Conteudo> ListaConteudo){
		this.data = data;
		this.dono = dono;
		this.titulo = titulo;
		this.ListaConteudo = ListaConteudo;
	}
	
	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data = data;
	}
	public Usuario getDono(){
		return dono;
	}
	public void setDono(Usuario dono){
		this.dono = dono;
	}
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public List<Conteudo> getListaConteudo() {
		return ListaConteudo;
	}
	public void setListaConteudo(List<Conteudo> listaConteudo) {
		ListaConteudo = listaConteudo;
	}
	public String toString() {
		return "Blog [data=" + data + ", dono=" + dono + ", titulo=" + titulo + ", ListaConteudo=" + ListaConteudo
				+ "]";
	}
	

}
