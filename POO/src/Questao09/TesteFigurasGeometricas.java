package Questao09;

public class TesteFigurasGeometricas {
	public static void main(String [] args){
		
		FormaGeometrica[] fg = new FormaGeometrica[]{new Retangulo(3.0, 2.0),new Retangulo(5.0, 1.0),new Quadrado(6.0),new Quadrado(3.0),new Circulo(2.5),new Circulo(4.5)};
		for(int i =0; i< fg.length; i++){
			System.out.println( fg[i].toString() +"\n"+ fg[i].calculaPerimetro() +"\n"+ fg[i].calculaArea()+"\n" );
		}
		
	}

}
