package programmingJava;

import java.util.Scanner;

public class SimplelInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		double principal=sc.nextDouble();
		System.out.println("enter the rate of interest");
		double rate=sc.nextDouble();
		System.out.println("enter time");
		double time=sc.nextDouble();
		double simple=(principal*rate*time)/100;
		System.out.println("the simple interst is"+simple);
	}
}
