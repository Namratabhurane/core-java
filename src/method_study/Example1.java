package method_study;

public class Example1 {

	public static void main(String[] args) {
		
		Example2.method1(); //calling static method from another class
		Example2.method2(); //calling static method from another class
			
		test1();   //calling static method from same class
		test2();
			
			
		}
	  public static void test1()
	  {
	
	System.out.println("test1 method is running");
	  }
	
	 public static void test2() 
	 {
		 
	System.out.println("test2 method is running");	 
	 } 

}