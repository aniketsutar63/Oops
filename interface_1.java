package Abstraction;

public class interface_1 {

	public static void main(String[] args) {

	 Bike bike = new Bike() {

		@Override
		public void name(String str) {

System.out.println("name is the bike is "+str);			
		}

		@Override
		public void model(String str) {
			System.out.println("model of the bike is "+str);
			
		}

		@Override
		public void year(String str) {
			System.out.println("year of the bike is "+str);
			
		}
		 
	 };
	 bike.model("2025-22");
	 bike.name("splender");
	 bike.year("2025");
		
		
}

	


}

interface Bike{
	
	void name(String str);
	
	void model(String str);
	 
	void year(String str);
}
	
	 
//}
//interface price{
//	
//	 void Amount(String str);
//	 void discount(String str);
//	 
//}
// class bike1  implements bike,price{
//
//	@Override
//	public void Amount(String str) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void discount(String str) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void name(String str) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void model(String str) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void year(String str) {
//		// TODO Auto-generated method stub
//		
//	}
//	 
// }
//
