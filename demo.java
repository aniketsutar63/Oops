package Encapsulation;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student aniket=new Student();
		
		System.out.println("Enter the name");
		String name=sc.next();
		String Name=name;
		aniket.setName(name);
		
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		int ID=id;
		aniket.setID(ID);
	
	
		System.out.println("Enter the PhoneNumber");
		String number=sc.next();
		String Number=number;
		aniket.setphonenumber(Number);
		
		
		
		System.out.println("Enter the Email ID ");
		String email=sc.next();
		String EmailID=email;
		aniket.setEmailID(EmailID);
		
		
		System.out.println("Enter the Cast");
		String cast=sc.next();
		String Cast=cast;
		aniket.setCast(Cast);
		
		
		
		System.out.println("Enter the city");
		String city=sc.next();
		String City=city;
		aniket.setCity(City);
		
		
		
		System.out.println("Enter the state");
		String State=sc.next();
		String state=State;
		aniket.setState(state);
		
		
		System.out.println("Enter the Pincode");
		String pincode=sc.next();
		String Pincode=pincode;
		aniket.setPincode(Pincode);
		
		
		System.out.println("Enter the Divison");
		int  divison=sc.nextInt();
		int Divison=divison;
		aniket.setDivison(Divison);
		
		
		
System.out.println("*******************************************************");
		
			System.out.println(aniket.getname());
			System.out.println(aniket.getID());
			System.out.println("+91 "+aniket.getphonenumber());
			System.out.println(aniket.getEmailID());
			System.out.println(aniket.getCast());
			System.out.println(aniket.getCity());
			System.out.println(aniket.getState());
			System.out.println(aniket.getPincode());
			System.out.println(aniket.getDivison());
			

	

	}

}
class Student{
	String name;
	int id;
	private String number;
	private String EmailID;
	private String Cast;
	String City;
	String State;
	String Pincode;
	int Divison;
	private int[] marks = new int[5];
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return this.id;
	}
	public void setphonenumber(String number)
	{
		if(number !=null && number.length()==10) {
			this.number=number;
		}
		else {
			System.out.println("Enter the valid mobile number");
		}
		
	}
	public String getphonenumber()
	{
		if (this.number == null) {
	        return "No valid number stored yet.";
	        }
			else {
			return this.number;
			}
	}
	public void setEmailID(String EmailID)
	{
		if(EmailID != null &&EmailID.contains("@gmail.com")) {
			
		
		this.EmailID=EmailID;
		}else {
			System.out.println(" Enter the correct email id ");
		}
	}
	public String getEmailID()
	{

		if (this.EmailID == null) {
        return "No valid email ID stored yet.";
        }
		else {
		return this.EmailID;
		}
	}
	public void setCast(String Cast )
	{
		this.Cast=Cast;
	}
	public String getCast()
	{
		return this.Cast;
	}
	public void setCity(String City )
	{
		this.City=City;
	}
	public String getCity()
	{
		return this.City;
	}
	public void setState(String State )
	{
		this.State=State;
	}
	public String getState()
	{
		return this.State;
	}
	public void setPincode(String  Pincode )
	{
		this.Pincode=Pincode;
	}
	public String  getPincode()
	{
		return this.Pincode;
	}
	public void setDivison(int Divison )
	{
		this.Divison=Divison;
	}
	public int   getDivison()
	{
		return this.Divison;
	}
	
	
	
}
