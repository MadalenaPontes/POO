package QuestaoPratica04;

public class Senha implements Comparable<Senha> {
	
	
	private String nome;
	private int idade;
	private int cpf;
	
	public Senha(){}
	
	public Senha(String nome, int idade, int cpf){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	

	@Override
	public int compareTo(Senha s) {
		return ((Integer)s.getIdade()).compareTo(idade);
	
	}
	public String toString(){
		return "Nome :"+this.nome+"\n Idade :"+this.idade+"\n CPF :"+this.cpf;
	}

}	
