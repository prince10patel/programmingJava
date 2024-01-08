package programmingJava;

import java.util.Scanner;

public class Amount {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		int n=amount/2000;
		System.out.println("2000 ="+n);
		int r=amount%2000;
		n=r/500;
		System.out.println("500 ="+n);
		r=r%500;
		n=r/200;
		System.out.println("200 ="+n);
		r=r%200;
		n=r/100;
		System.out.println("100 ="+n);
		r=r%100;
		n=r/50;
		System.out.println("50 ="+n);
		r=r%50;
		n=r/20;
		System.out.println("20 ="+n);
		r=r%20;
		n=r/10;
		System.out.println("10 ="+n);
		r=r%10;
		n=r/5;
		System.out.println("5 ="+n);
		r=r%5;
		n=r/2;
		System.out.println("2 ="+n);
		r=r%2;
		n=r/1;
		System.out.println("1 ="+n);
	}
}
