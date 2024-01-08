package programmingJava;

import java.util.Scanner;

public class MainPositive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the int value");
		int n=sc.nextInt();
		if(n<0) {
			n=-n;
		}
		System.out.println("enter num is ="+n);
	}
}
