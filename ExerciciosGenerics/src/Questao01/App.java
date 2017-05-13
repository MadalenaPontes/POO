package Questao01;

public class App {
	public static void main(String[] args) {
		
		Par<String,Double> par1 = new Par<String,Double>("Maria ",9.0);
		Par<Integer,String> par2 = new Par<Integer,String> (11," José");
		Par<Float,Float> par3 = new Par<Float,Float> (new Float(3.0),new Float(5.0));
		
		System.out.println(par1.toString()+"\n"+ par2.toString()+"\n"+ par3.toString());
		
		
	}
	

}
