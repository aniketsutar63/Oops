package Abstraction;

public class program_1 {

	public static void main(String[] args) {
		
		Car  first=new splender();
		first.model();
		first.name();
		
	}

}
abstract  class Car{
	
	private String year="2025";
	public abstract void name();
	 public abstract void model();
	 
	 
} 

class splender extends Car{
	


	@Override
	public void model() {
			System.out.println("Sp12-2025");
		
	}

	@Override
	public void name() {
		System.out.println("2025");
		
	}
	
}