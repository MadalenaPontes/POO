package Questao09;

public class Quadrado implements FormaGeometrica {
	 private double lado;
	 
	 public Quadrado(double lado){
		 this.lado = lado;
	 }
	public double calculaPerimetro(){
		double perimetro = 4 * lado;
		return perimetro;
	}
	public double calculaArea(){
		double area = lado * lado;
		return area;
	}
	public String toString(){
		return "Lado: "+ this.lado;
	}
}
