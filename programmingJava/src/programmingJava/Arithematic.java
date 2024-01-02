package programmingJava;

import java.util.Scanner;

public class Arithematic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two int value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("sum is"+(x+y));
		System.out.println("diff is"+(x-y));
		System.out.println("product is"+(x*y));
		System.out.println("quotiens is"+(x/y));
		System.out.println("reminder is"+(x%y));


	}
}
