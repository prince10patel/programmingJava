package programmingJava;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & breath");
		int length=sc.nextInt();
		int breath=sc.nextInt();
		int area=length*breath;
		int perimeter=2*(length+breath);
		System.out.println("the area of rectangle is"+area);
		System.out.println("the perimeter of rectangle is"+perimeter);
	}
}
