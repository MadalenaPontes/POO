package QuestaoPratica04;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas {
	
	private Queue<Senha> fila;

	public GerenciadorDeSenhas(boolean prioridadePorIdade){
		if(prioridadePorIdade = true){
			fila = new PriorityQueue<Senha> ();
		}else{
			fila = new LinkedList<Senha> ();
		}
	}
	
	public void emitirSenha(String nome, int idade, int cpf){ // inserir na fila
		Senha senha = new Senha(nome,idade,cpf);
		System.out.println(senha);
		fila.offer(senha);
		
		
	}
	public Senha proximaSenha(){ // remover da fila
		return fila.poll();
		 
	}
	public boolean filaVazia() {
		return this.fila.size() == 0;
	}
	public Queue<Senha> getSenhas(){
		return fila;
	}
}