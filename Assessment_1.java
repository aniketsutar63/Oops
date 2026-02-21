package Encapsulation;

import java.util.Scanner;

public class Assessment_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StudentInfo aniket=new StudentInfo();
		
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
		char  divison=sc.next().charAt(0);
		char Divison=divison;
		aniket.setDivison(Divison);
		
		
		System.out.println("Please enter the marks for the five subjects:::");
		int[] marks=new int[5];
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter the subject :"+(i+1) +" :marks");
			marks[i]=sc.nextInt();
		}
		
		aniket.setMarks(marks);
		
		
		
System.out.println("*******************************************************************************");
		
			System.out.println("Name         :- " +aniket.getname());
			System.out.println("Std ID       :- " +aniket.getID());
			System.out.println("Std num      :-  +91 " +aniket.getphonenumber());
			System.out.println("Std Gmail    :- " +aniket.getEmailID());
			System.out.println("Std City     :- " +aniket.getCity());
			System.out.println("Std State    :- " +aniket.getState());
			System.out.println("Std pincod   :- " +aniket.getPincode());
			System.out.println("Std Div      :- " +aniket.getDivison());
			
			System.out.println("Now coming to the  marks and perecentage part : Best of luck ::::::");
			System.out.println("Final Result :- " +aniket.getResult());
			System.out.println("Final %      :- " +aniket.getpercentage());
			

	

	}

}
class StudentInfo{
	String name;
	int id;
	private String number;
	private String EmailID;
	String City;
	String State;
	String Pincode;
	char Divison;
	int[] marks=new int[5];
	
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
	public void setDivison(char Divison )
	{
		this.Divison=Divison;
	}
	public char   getDivison()
	{
		return this.Divison;
	}
	
	
	
	String result="Pass";
	
	double perecentage;
	boolean showprecentage=true;
	public void setMarks(int[] marks)
	{
		this.marks=marks;
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
			{
				result="fail";
			}
			else
			{ 
				 sum=sum+marks[i];
			}
		}
		
		perecentage=(double)sum/marks.length;
		
		
	}
	
	public int[] getMarks()
	{
		return this.marks;
	}
	
	public String getResult()
	{
		 if(result.equals("fail"))
		 {
			 showprecentage=false;
		 }
		return this.result;
	}
	
	public String getpercentage()
	{
		//System.out.println(this.showprecentage);
		String str=new String();
		if(showprecentage) {
		return perecentage+" "+str; 
		}
		return "sorry you are failed in one or  more subjects:";
	}
}
