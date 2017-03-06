package Questao08;

public class TestaCadastro {
	public static void main(String[] args){
	
	Data d1 = new Data(28,11,1997);
	Cliente c1 = new Cliente("Maria", d1,111);
	Data d2 = new Data(19,02,1990);
	Cliente c2 = new Cliente("Joaquim", d2 , 444);
	Data d3 = new Data(11,02, 1980);
	Cliente c3 = new Cliente("Antonio", d3, 555);

	
	Data d4 = new Data(23,10, 1981);
	Funcionario f1 = new Funcionario("Márcio", d4, 4000);
	Data d5 = new Data(25,06, 1970);
	Funcionario f2 = new Funcionario("Mateus", d5 , 2000);
	Data d6 = new Data(17,10,1989);
	Funcionario f3 = new Funcionario("Madalena", d6, 3000);
	
	Data d7 = new Data(11,10,1987);
	Gerente g1 = new Gerente("Marcos",d7,3500,"Administração");
	Data d8 = new Data(15,12,1988);
	Gerente g2 = new Gerente("Gabriel", d8, 7000, "TI");
	Data d9 = new Data(19,04,1977);
	Gerente g3 = new Gerente("Vinicius", d9,6000,"Saúde");
	
	CadastroPessoas cp = new CadastroPessoas();
	cp.cadastraPessoa(c1);
	cp.cadastraPessoa(c2);
	cp.cadastraPessoa(c3);
	cp.cadastraPessoa(f1);
	cp.cadastraPessoa(f2);
	cp.cadastraPessoa(f3);
	cp.cadastraPessoa(g1);
	cp.cadastraPessoa(g2);
	cp.cadastraPessoa(g3);
	
	cp.imprimeCadastro();
	
	}

}