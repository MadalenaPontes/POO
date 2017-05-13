package Questao03;

public class Codigo<T,P> {
	private T codigoP1;
	private P codigoP2;
	
	public Codigo(T codP1, P codP2){
		this.codigoP1 = codP1;
		this.codigoP2 = codP2;
	}
	
	public Codigo<T,P> getCodigo() {
		return new Codigo<T,P> (codigoP1,codigoP2);
	}
	
	public void setCodigo(T COD1, P COD2) {
		this.codigoP1 = COD1;
		this.codigoP2 = COD2;
	}
	public String toString(){
		return codigoP1 +""+codigoP2;
	}
	
	

}
