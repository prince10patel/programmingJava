package programmingJava;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two int value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==y) {
			System.out.println(x+" and "+y +"Equals");
		}
		if(x!=y) {
			System.out.println(x+" and "+y+ " not Equals");
		}
	}
}
