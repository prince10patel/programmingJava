package programmingJava;

import java.util.Scanner;

public class MainBig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two int value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y) {
			System.out.println("Biggest num is ="+x);
		}else {
			System.out.println("biggest num is ="+y);
		}
	}
}
