package br.aeso.blog;

import java.util.List;

public class Nota extends Comentario {
	
	private List<Comentario> listaComentario;
	
	public Nota(List<Comentario> listaComentario){
		this.listaComentario = listaComentario; 
	}
	
	public List<Comentario> getListaComentario(){
		return listaComentario;
	}
	public void setListaComentario(List<Comentario> listaComentario){
		this.listaComentario = listaComentario;
	}
	
	public String toString(){
		return " Nota [listaComentario=" + listaComentario + "]";
	}
	

}
