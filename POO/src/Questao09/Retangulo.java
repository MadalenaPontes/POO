package Questao09;

public class Retangulo implements FormaGeometrica{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double calculaPerimetro() {
		double perimetro = 2 * base + 2 * altura;
		return perimetro;
	}

	
	public double calculaArea() {
		double area = base * altura;
		return area;
	}
	public String toString(){
		return "Base: "+ this.base + "  Altura: "+this.altura;
	}
}
