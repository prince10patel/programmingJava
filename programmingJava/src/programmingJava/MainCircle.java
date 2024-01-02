package programmingJava;

import java.util.Scanner;

public class MainCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the redias of circle");
		double d=sc.nextDouble();
		double area=3.143*d*d;
		double cir=2*3.143*d;
		System.out.println("area of circle is"+area);
		System.out.println("area of circumference"+cir);
	}
}
