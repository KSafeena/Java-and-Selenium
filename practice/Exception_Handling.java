package practice;
import java.util.Scanner;
public class Exception_Handling {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		try {		
		int num=sc.nextInt();
		System.out.println(100/num);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("The Execution is Succesfull");
		}
	}
}
