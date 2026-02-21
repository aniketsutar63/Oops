package Polymorphism;

public class dynamic_method_dispatch {

	public static void main(String[] args) {
	 
		
		Animal Type=new Lion();
		
			Type.type();
		Animal ani = new Tiger();

		 ani.obj();
		 ani.nbn();
		 
		 
	}

}
class  Animal
{
	String name;
	public void type() {
		System.out.println(" Also name as Panthera leo ");
		
	}
	
	public A obj() {
		System.out.println("Parent A");
	    return new A();
	}
	public c nbn() {
		System.out.println(" that is the obj ");
		return new c();
	}
	
}

class Lion extends Animal
{
	String name;
	public void type() {
		System.out.println(" Also name as Lion ");
		
	}
	public void Found() {
		System.out.println(" found in Africa and India also");
	}
	
}
class Tiger extends Lion
{
	String name;
	
	public void type() {
		System.out.println(" Also name as Panthera leo ");
		
	}
	public void whereLive_in() {
	 System.out.println(" From Russia to Southeast Asia ");	
	}
	
	public B obj() {
		System.out.println("Child ");
		return new B();
	}
	public c nbn() {
		System.out.println(" that is the  in java  ");
		return new c();
	}
}

class A{
  
	void sleep() {
		System.out.println();
	}
}
class B extends A{
	
}
class c extends B{
	void run() {
    System.out.println();
	}
}
