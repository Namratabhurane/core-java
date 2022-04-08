package constructor_study;

public class EX1 {
	// THIS is example for variable in class
			int a=10; //non-static variable-->initialization -->manually
			 
			static int c=20;//static variable
			
	public static void main(String[] args) {
		
		
		EX1 e=new EX1();
		System.out.println("value of a is "+e.a);
		System.out.println("value of b is "+c);
		

	}

}
