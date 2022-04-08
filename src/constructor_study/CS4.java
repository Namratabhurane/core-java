package constructor_study;

public class CS4 {
	
	 int a;
	 int b;
	 int c;

	public static void main(String[] args) {
		
		CS4 c=new CS4();
		c.addition();
		
		CS4 c1=new CS4(50);
		c1.addition();
		
		CS4 c2=new CS4(60);
		c2.addition();
		
		CS4 c3=new CS4(50,60,70);
		c3.addition();


	}

	 public CS4() //zero parameter constructor
	 {  a=10;
	    b=20;
	    c=30;
	    System.out.println("userdefined constructor is running");
	 }
	 
	 public CS4(int num) //constructor with parameter
	 {
	 a=num;
	 System.out.println("userdefined constructor with 1 parameter is running");
	 }
	 
	 
	 public CS4(int num,int num1,int num2)
	 { a=num;
	   b=num1;
	   c=num2;
	 System.out.println("userdefined constructor with 3 parameter is running");
	 }
	 
	 public void addition()
	 {
	 int sum=a+b+c;
	 System.out.println("addition is "+sum);
	 }
	 
}
