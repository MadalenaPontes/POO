package Questao02;

public class SomadorArrayBi implements Runnable{
	private int ini;
	private int fim;
	private int[][] num;
	private static int somador;
	
	public SomadorArrayBi(int ini,int fim, int[][] num){
		this.ini = ini;
		this.fim = fim;
		this.num = num;
		somador = 0;
	}
	public void run(){
		for(int i = ini ; i< fim ; i++){
			for(int f = ini ; f< fim ; f++){
				if(num[i][f]!= 0){
					somador+=num[i][f];
				}
			}
			
		}
	}
	public int getSoma(){
		return SomadorArrayBi.somador;
	}

}
