package practice;
class student_info
{
	void info(int a,int b) {
		System.out.println(a+b );
	}
	
}
class student1 
{
	void info(double a,double b) {	
		System.out.println(a+b);
	}
	
}

public class Student {

	public static void main(String[] args) {
		student1 s1=new student1();
		s1.info(10,90);
		s1.info(2.0,8.0);

	}

}
