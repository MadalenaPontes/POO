package Questao01;

public class ImprimeNumPrimos implements Runnable{

	public static boolean verificaNum(int num){
		if(num == 1){
			return true;
		}
		int contador = 1;
		for(int i = 1; i<=num/2; i++){
			if(num % i == 0){
				contador ++ ;
			}
			if(contador > 2){
				return false;
			}
		}
		if(contador == 2){
			return true;
		}
		return false;
	}


	@Override
	public void run() {
		int i;
		int tam = 99999;
		for(i = 1 ; i < tam + 1; i++){
			if(verificaNum(i)){
				System.out.println(i);
			}
		}

	}

}
