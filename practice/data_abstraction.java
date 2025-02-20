package practice;
interface shape
{
	int length=10;
	int width=3;
	abstract void circle();//abstract class
	default void square()
	{
		System.out.println(length*width);
	}
	static void rectangle()
	{
		System.out.println(2*(length+width));
	}
	
}


public class data_abstraction implements shape {
	public void circle()
	{
		System.out.println("This is implementation for the circle" );
	}

	
	public static void main(String[] args) {
		data_abstraction daobj=new data_abstraction();
		daobj.square();
		daobj.circle();
		shape.rectangle();
	}

}
