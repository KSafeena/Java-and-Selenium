package practice;
class base
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}
class child extends base
{
	int b=20;
	void show()
	{
		System.out.println(b);
	}
}
class grandchild extends base
{
	int c=200;
	void print()
	{
		System.out.println(c);
	}

}
public class inheritance {

	public static void main(String[] args) {
		grandchild g=new grandchild();
		g.display();
		g.print();
		child c=new child();
		c.show();
		c.display();
		
	}

}
