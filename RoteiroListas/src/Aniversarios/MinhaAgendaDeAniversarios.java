package Aniversarios;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	List<Aniversariante> aniversariantes;
	
	
	public MinhaAgendaDeAniversarios(List<Aniversariante> aniversariantes){
		aniversariantes = new ArrayList<Aniversariante> ();
	}
	
	public MinhaAgendaDeAniversarios() {
		aniversariantes = new ArrayList<Aniversariante> ();
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes, int ano) {
		Aniversariante a = new Aniversariante(nome,dia,mes,ano);
		aniversariantes.add(a);
		
	}

	@Override
	public ArrayList<String> obterAniversariantesDoMes(int mes) {
		ArrayList<String> aniversariantesDoMes = new ArrayList();
		for(Aniversariante ani: aniversariantes){
			if(ani.getDataAniversario().getMes()== mes){
				aniversariantesDoMes.add(ani.getNome());
			}
		}
		return aniversariantesDoMes;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) {
		for(Aniversariante a : aniversariantes){
			if(a.getNome().equals(nomeAniversariante)){
				aniversariantes.remove(a);
				break;
			}
		}
		
	}

	public List<Aniversariante> getAniversarios() {
		return aniversariantes;
	}
	
}
