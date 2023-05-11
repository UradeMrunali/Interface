
interface B2
{
	void show();
}
interface C3 
{
	void display();
}
class A2 implements B2,C3
{


	@Override
	public void show() {
		System.out.println("byeeeeeee");
	}

	@Override
	public void display() {
		System.out.println("hiiiiiiiii");
		
	}

	
}

public class A1 {
 public static void main(String[] args) {
	A2 a = new A2();
	a.display();
	a.show();
}
}
