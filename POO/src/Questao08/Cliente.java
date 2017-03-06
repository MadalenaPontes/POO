package Questao08;

public class Cliente extends Pessoa {
	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

	public void imprimeDados(){
		System.out.println("Nome: "+ super.nome + "\nNascimento: "  +super.nascimento + "\nCódigo: " +this.codigo+"\n");
		
	}

}
