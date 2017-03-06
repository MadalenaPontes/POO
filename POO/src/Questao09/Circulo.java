package Questao09;

public class Circulo implements FormaGeometrica {
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	public double calculaPerimetro(){
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}
	public double calculaArea(){
		double area = 3.14 * raio * raio;
		return area;
	}
	public String toString(){
		return "Raio: "+ this.raio;
	}
}

