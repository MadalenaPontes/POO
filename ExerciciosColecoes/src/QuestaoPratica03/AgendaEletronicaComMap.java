package QuestaoPratica03;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AgendaEletronicaComMap {
	protected Map<String, ContatoComMap> contatos;
	
	
	public AgendaEletronicaComMap() {
		contatos = new HashMap<String,ContatoComMap> ();
	}

	public void addContato(String nome,ContatoComMap c){
		contatos.put(nome,c);
	}
	public boolean removerContato(ContatoComMap c){
		for(ContatoComMap cont : contatos.values()){
			if(cont.equals(c)){
				contatos.remove(c);
				return true;
			}
		}
		return false;
	}
	
	public void removerContatos(String id){
		Iterator<String > cont = contatos.keySet().iterator();
		while(cont.hasNext()){
			String co = cont.next();
			if(co.contains(id)){
				cont.remove();
			}
		}
	}
		public HashMap<String,ContatoComMap> listarContatos(String id){
			HashMap<String,ContatoComMap> ContatosComStringId = new HashMap<String,ContatoComMap>();
			for(String chave: contatos.keySet()){
				if(chave.contains(id)){
					ContatosComStringId.put(chave,contatos.get(chave));
				}
			}
			return ContatosComStringId;
		}
		
	
	public Collection<ContatoComMap> getListContatos(){
		return this.contatos.values();
	}
}

		
		
		
		
		
		
		
	
