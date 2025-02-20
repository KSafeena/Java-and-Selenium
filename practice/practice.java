package practice;

public class practice {
	int id;
	String name;
	int percentage;
	public practice(int id,String name,int percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
		
	}
	public static void main(String[] args) {
		practice p=new practice(21,"Bob",78);
		
		System.out.println(p.id+" "+p.name+" "+p.percentage);
		practice p1=new practice(22,"priya",89);
		System.out.println(p1.id+" "+p1.name+" "+p1.percentage);
	}

}
