package Questao09;

public abstract class Quadrilateros implements FormaGeometrica{
	private double l1;
	private double l2;
	private double l3;
	private double l4;
	
	public Quadrilateros(double l1,double l2,double l3, double l4){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;	
	}
	public double calculaPerimetro(){
		return l1+l2+l3+l4;
	}

}
