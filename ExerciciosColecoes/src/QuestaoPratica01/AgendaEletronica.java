package QuestaoPratica01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {
	protected List<Contato> contatos;
	
	
	public AgendaEletronica() {
		contatos = new ArrayList<Contato> ();
	}

	public void addContato(Contato c){
		contatos.add(c);
	}
	public boolean removerContato(Contato c){
		Iterator<Contato> cont = contatos.iterator();
		while(cont.hasNext()){
			Contato co = cont.next();
			if(co.equals(c)){
				cont.remove();
				return true;
			}
		}
		return false;
	}
	
	public void removerContato(String id){
		Iterator<Contato> cont = contatos.iterator();
		while(cont.hasNext()){
			Contato co = cont.next();
			if(co.getNome().contains(id)){
				cont.remove();
			}
		}
	}
		public List<Contato> listarContatos(String id){
			List<Contato> stringId = new ArrayList<Contato>();
			for(Contato c:contatos){
				if(c.getNome().contains(id)){
					stringId.add(c);
				}
			}
			return stringId;
		}
		
	
	public List<Contato> getListContatos(){
		return this.contatos;
	}
}

		
		
		
		
		
		
		
	
