package javapractice;

import java.util.Scanner;

public class Scanneraddition {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Value of a+b=" + c );
	}

}
