package programmingJava;

import java.util.Scanner;

public class Stick {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in); 
			System.out.println("enter the length in terms of inches");
			double length=sc.nextDouble();
			double feet=length/12;
			double meter=0.0254*length;
			System.out.println("the length in feet is "+feet);
			System.out.println("the length in meter is "+meter);
		
	}
}
