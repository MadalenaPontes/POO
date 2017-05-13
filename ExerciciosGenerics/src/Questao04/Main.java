package Questao04;

public class Main {
	public static void main(String[] args){
		Codigo<String,Integer> cod = new Codigo<String,Integer>("MPE",1611);
		ValorM V = new ValorM(800.0);
		ProdutoGenerico2<Codigo<String,Integer>,ValorM> ProdG = new ProdutoGenerico2<Codigo<String,Integer>,ValorM>(cod,"Muito Importante, CUIDADO",V);
		System.out.println(ProdG.toString());
	}
}

