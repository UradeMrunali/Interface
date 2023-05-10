interface Printable{  
		void print();  
		}  
interface TestTnterface 
		{  
		 void scan();
		}
		
		
		class Show implements Printable,TestTnterface
		{
		public void print()
		{
			System.out.println("Hello   world");
		}

		@Override
		public void scan() {
			System.out.println("hello");
			
		}   
		}
public  class A {
	
		public static void main(String args[])
		{
	Show s=new Show();
	s.print();
	s.scan();
		} 
}
		

