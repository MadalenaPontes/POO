package Aniversarios;


	public class DataAniversario {
		private int dia;
		private int mes;
		private int ano;
		
		public DataAniversario(int dia, int mes, int ano){
			this.dia =dia;
			this.mes = mes;
			this.ano = ano;
		}
		public int getDia(){
			return this.dia;
		}
		public int getMes(){
			return this.mes;
		}
		public int getAno(){
			return this.ano;
		}
		public boolean equals(Object o){
			if(o == null){
				return false;
			}else if(o instanceof DataAniversario){
				DataAniversario da = (DataAniversario) o;
				if(this.dia == da.getDia() && this.mes == da.getMes() && this.ano == da.getAno()){
					return true;
				}
			}
			return false;
		}
		
	}



