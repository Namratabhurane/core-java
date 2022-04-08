package method_study;

public class Example4 {

	public static void main(String[] args) {
		
		Example4 obj=new Example4(); //to call non static method we need to create
		 obj.demo1();                             // object
		obj.demo1();//we can call multiple time
		obj.demo2();
		
		Example5 obj1=new Example5();
		obj1.demo3();  //calling non static method from another class
		obj1.demo4();
		

	}

public void demo1()	  //creating non static method
{
	System.out.println("demo1 method is running");
}
	
public void demo2()
{
	System.out.println("demo2 method is running");
}
}
