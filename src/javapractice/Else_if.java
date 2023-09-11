package javapractice;

public class Else_if {

	public static void main(String[] args) {
		
		int a=40,b=53,c=78;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
	}

}
