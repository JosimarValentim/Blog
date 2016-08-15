package br.aeso.blog;

import java.util.ArrayList;

public class Blog {
	private String data;
	private Usuario dono;
	private String titulo;
	private ArrayList<Conteudo> listaConteudo;
	
	public Blog(String data, Usuario dono, String titulo, ArrayList<Conteudo> listaConteudo){
		this.data = data;
		this.dono = dono;
		this.titulo = titulo;
		this.listaConteudo = listaConteudo;
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

	public ArrayList<Conteudo> getListaConteudo() {
		return listaConteudo;
	}
	public void setListaConteudo(ArrayList<Conteudo> listaConteudo) {
		this.listaConteudo = listaConteudo;
	}
	public String toString() {
		return "Blog [data=" + data + ", dono=" + dono + ", titulo=" + titulo + ", ListaConteudo=" + listaConteudo
				+ "]";
	}
	

}
