package constructor_study;

public class CS2 {
	
	public CS2() //USER DEFINED WITHOUT/ZERO PARAMETER CONSTRUCOR
	{
	System.out.println("HI USER DEFINED CONSTRUCTOR IS RUNNING");
	}
	public static void main(String[] args) {
		
		CS2 c=new CS2();
		c.test1();

	}

	
	public void test1() {
		
		System.out.println("hi test1 is running");
	}
	
}
