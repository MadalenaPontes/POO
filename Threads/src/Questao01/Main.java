package Questao01;

public class Main {

	public static void main(String[] args) {
		ImprimeNumPrimos inp = new ImprimeNumPrimos();
		Thread th = new Thread(inp);
		th.start();
	}

}
