package QuestaoPratica02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AgendaEletronicaComSet {
	private Set<ContatoComSet> contatos;


	public AgendaEletronicaComSet() {
		contatos = new TreeSet<ContatoComSet> ();
	}

	public void addContato(ContatoComSet c) {
		contatos.add(c);
	}

	public boolean removerContato(ContatoComSet c) {
		Iterator<ContatoComSet> cont = contatos.iterator();
		while (cont.hasNext()) {
			ContatoComSet co = cont.next();
			if (co.equals(c)) {
				cont.remove();
				return true;
			}
		}
		return false;
	}

	public void removerContato(String id) {
		Iterator<ContatoComSet> cont = contatos.iterator();
		while (cont.hasNext()) {
			ContatoComSet co = cont.next();
			if (co.getNome().contains(id)) {
				cont.remove();
			}
		}
	}

	public Set<ContatoComSet> listarContatos(String id) {
		Set<ContatoComSet> stringId = new TreeSet<ContatoComSet>();
		for (ContatoComSet c : contatos) {
			if (c.getNome().contains(id)) {
				stringId.add(c);
			}
		}
		return stringId;
	}

	public Set<ContatoComSet> getListContatos() {
		return this.contatos;
	}
}
