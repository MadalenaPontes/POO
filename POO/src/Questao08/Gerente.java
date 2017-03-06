package Questao08;

public class Gerente extends Funcionario {
	

	private String area;
	
	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	
	public float calculaImposto(){
		return (float) 0.05 * super.salario;
	}
	
	public void imprimeDados(){
		System.out.println("Nome: "+ super.nome + "\nNascimento: "+ super.nascimento +"\n¡rea: "+this.area+ "\nSal·rio: "+ this.salario+ " \nImposto: "+ calculaImposto()+"\n");
	}
	
	
}
