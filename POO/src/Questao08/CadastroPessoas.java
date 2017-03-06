package Questao08;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
	 private List <Pessoa> pessoas;
	 
	 public CadastroPessoas(){
		 pessoas = new ArrayList <Pessoa> ();
	 }
	 
	 public void cadastraPessoa(Pessoa pessoa){
		 pessoas.add(pessoa);
	 }
	 public void imprimeCadastro(){
		 for(Pessoa p: pessoas){
			 p.imprimeDados();
		 }
	 }	
}