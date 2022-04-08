package method_study;

public class MethodAssignment {

	public static void main(String[] args) {
  
      student_info("namrata",3,'S',90);
      
      student_info1();
	}

	public static void student_info(String name,int roll_num,char grade,
			float marks) {
	System.out.println("*******************************");
	System.out.println("student name is "+name);
	System.out.println("student roll number is "+roll_num);
	System.out.println("student grade is "+grade);
	System.out.println("student marks are "+marks);
	System.out.println("*******************************");
	}
	
	public static void student_info1() //method without parameter
	{
		String name="Nandkumar";
		int roll_num=20;
		char grade='B';
		float marks=30;
		System.out.println("*******************"); 
		System.out.println("my name is "+name);
		System.out.println("my roll num is "+roll_num);
		System.out.println("my grade is "+grade);
		System.out.println("my marks is "+marks);
	
	
	}
}
