package Questao01;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(){
		this.largura = 0;
		this.altura = 0;
	}
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	public String toString(){
		return "O ret�ngulo tem largura "+largura +" e altura "+altura +"\n"+"Per�metro: "+perimetro() +"\n"+"�rea:"+areaRetangulo();
	}
	public boolean equals(Object o){
		if( o == null){
			return false;
		}else if(o instanceof Retangulo){
			Retangulo r = (Retangulo) o;
			if(this.largura == r.getLargura() && this.altura == r.getAltura()){
				return true;
			}
		}
		return false;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}
	public double getAltura(){
		return this.altura;
	}
	public double getLargura(){
		return this.largura;
	}
	public double perimetro(){
		double calculoPerimetro = 2 * (largura + altura);
		return calculoPerimetro;
	}
	public double areaRetangulo(){
		double area = largura * altura;
		return area;
	}
	
	
	
	
	
	
	
	
	
	
}