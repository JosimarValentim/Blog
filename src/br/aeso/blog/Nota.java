package br.aeso.blog;

import java.util.ArrayList;

public class Nota extends Conteudo {
	
	private ArrayList<Comentario> comentario;
	
	public Nota(String data, String texto, Usuario autor){
		super(data, texto, autor);
		comentario = new ArrayList<>();
	}
	
	private void inserirComentario(Comentario comentario){
		this.comentario.add(comentario);
	}
	private void removerComentario(Comentario comentario){
		this.comentario.add(comentario);
	}
	private ArrayList<Comentario> listaComentario(){
		return comentario;
	}

}
