package Mypack;

import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		//System.out.println("Give me input");
		//String name = scanner.nextLine();
		//System.out.println("Name:"+name);
		
		System.out.println("Give me 1st no. as input: ");
		float firstNo = scanner.nextFloat();
		System.out.print("Number:"+firstNo);
		
		System.out.println("Give me 1st no. as input: ");
		float secondNo = scanner.nextFloat();
		System.out.print("Number:"+secondNo);
		
		
		float c = scanner.nextFloat();
		System.out.print("Number:"+c);
	}
	

}
