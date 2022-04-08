package method_study;

public class Math_Operation {

	public static void main(String[] args) {
		
      addition(); //calling static method
      
      Math_Operation obj=new Math_Operation();
      obj.substraction();
   
      
	}

	public static void addition()  //static method
	{
	int a=10;
	int b=20;
	int sum;
	sum=a+b;
	System.out.println("addition is "+sum);
	}
	
	public void substraction()// non-static method
	{  int c=20;
	   int d=10;
	   int sub;
	   sub=c+d;
	   System.out.println("substraction is "+sub);
		
		
	}
}
