package QuestaoPratica02;

public class ContatoComSet implements Comparable<ContatoComSet>{
	private String nome;
	private int numero;
	private String email;
	
	public ContatoComSet(){
		this.nome = "";
		this.numero = 0;
		this.email = "";
	}
	public ContatoComSet(String nome, int numero,String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int compareTo(ContatoComSet c) {
		int comparacao = c.getNome().compareTo(this.nome);
		return comparacao;
	}
}
	  

