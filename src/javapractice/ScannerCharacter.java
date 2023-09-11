package javapractice;

import java.util.Scanner;

public class ScannerCharacter {

	public static void main(String[] args) {
	
		System.out.println("Enter the character");
		
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		System.out.println("Character="+c);
	}

}
