package constructor_study;

public class CS3 {
	// USE of user defined constructor to initialize value
	
			int a; //non-static variable declaration
			int b;  //non-static variable declaration

			public CS3()
			{
			System.out.println("running user defined without parameter");
			a=10; //assigning value to variable a within contstructor
			b=20;//assigning value to variable a within contstructor
			
			}
	public static void main(String[] args) {
		
		CS3 c=new CS3();
		 System.out.println("value of a is "+c.a);
		 System.out.println("value of a is "+c.b);
		
	}

}
