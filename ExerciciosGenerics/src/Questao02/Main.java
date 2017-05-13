package Questao02;

public class Main {

	public static void main(String[] args) {
		Codigo c = new Codigo("1611");
		ProdutoGenerico<Codigo> PG = new ProdutoGenerico<Codigo>(c,"Muito Importante, CUIDADO",350.0);
		System.out.println(PG.toString());

	}

}
