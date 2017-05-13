package Questao03;

public class Main {

	public static void main(String[] args) {
		Codigo<String,Integer> codigo = new Codigo<String,Integer>("MPE",1611);
		ProdutoGenerico<Codigo<String,Integer>> ProdG = new ProdutoGenerico<Codigo<String,Integer>>(codigo,"Muito Importante, CUIDADO",900.0);
		System.out.println(ProdG.toString());
	}


	

}
