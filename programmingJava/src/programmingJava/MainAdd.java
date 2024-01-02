package programmingJava;

import java.util.Scanner;

public class MainAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two int value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=x+y;
		System.err.println("sum ="+sum);
		
	}
}
