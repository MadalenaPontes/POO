package Questao01;
import javax.swing.JOptionPane;

public class TestandoRetangulo {
	public static void main(String[] args){
		Retangulo retangulo = new Retangulo();
	
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
	
		retangulo.setLargura(largura);
		retangulo.setAltura(altura);
	
		JOptionPane.showMessageDialog(null,retangulo.toString());
	

}
}
