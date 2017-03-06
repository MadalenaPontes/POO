package Questao08;

public class Funcionario extends Pessoa {
	
	protected float salario;
	
	public Funcionario(String nome, Data nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}
	
	public float calculaImposto(){
		return (float) 0.03 * salario;
	}
	public void imprimeDados(){
		System.out.println("Nome: "+ super.nome + "\nNascimento: "+ super.nascimento + "\nSalário: "+ this.salario+ " \nImposto: "+ calculaImposto()+"\n");
		
	}
}
