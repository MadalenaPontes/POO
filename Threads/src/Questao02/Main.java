package Questao02;

public class Main {

	public static void main(String[] args) {
		
		int somaArrayBi = 0;
		int x = 1000;
		int y = 1000;
		int[][] num = new int[x][y];
	
		for (int k = 0; k < num.length; k++) {
			for (int i = 0; i < num[k].length; i++) {
				num[k][i] = 1;
			}
		}
		SomadorArrayBi t1 = new SomadorArrayBi(0,x,num);
		Thread thr1 = new Thread(t1);
		thr1.start();
		try {
			thr1.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		somaArrayBi+=t1.getSoma();
		System.out.println(somaArrayBi);
	}

}
	


