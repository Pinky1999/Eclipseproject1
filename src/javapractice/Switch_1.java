package javapractice;

public class Switch_1 {

	public static void main(String[] args) {
		
		int a=3,b=4;
		char c='-';
		switch(c)
		{
		case '+': 
			System.out.println("a+b=" +(a+b));
			break;
		case '-':
			System.out.println("a-b=" +(a-b));
			break;
		case '/':
		System.out.println("a/b=" +(a/b));
		break;
		case '*':
			System.out.println("a*b= +a*b");
			break;
		default:
			System.out.println("Invalid choice");
			
			
		}
	}

}
