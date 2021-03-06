package QuestaoPratica01;

public class Contato {
	private String nome;
	private int numero;
	private String email;
	
	public Contato(){
		this.nome = "";
		this.numero = 0;
		this.email = "";
	}
	public Contato(String nome, int numero,String email){
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
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else if(obj instanceof Contato){
			Contato c = (Contato)obj;
				if(c.getNome().equals(this.nome) && c.getNumero() == this.numero && c.getEmail().equals(this.email)){
					return true;
				}
		}
		return false;
				
		}
	}

	  

