package QuestaoPratica03;

public class ContatoComMap {
	
	private int numero;
	private String email;
	
	public ContatoComMap(){
		
		this.numero = 0;
		this.email = "";
	}
	public ContatoComMap(int numero,String email){
		
		this.numero = numero;
		this.email = email;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else{
				if(obj instanceof ContatoComMap){
					ContatoComMap c = (ContatoComMap)obj;
					if(c.getNumero() == this.numero && c.getEmail().equals(this.email)){
						return true;
					}else{
						return false;
					}
				}else{
					return false;
				}
		}
	}
}
	  

