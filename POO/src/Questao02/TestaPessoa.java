package Questao02;
import javax.swing.JOptionPane;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa P = new Pessoa();
		 
		 String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		 int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		 double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		 double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		 String sexo = JOptionPane.showInputDialog("Informe seu sexo");

		 P.setNome(nome);
		 P.setPeso(peso);
		 P.setAltura(altura);
		 
	  JOptionPane.showMessageDialog(null,P.calculaIMC()+P.toString());
		 
	}

}
