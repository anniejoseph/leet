package Leet;

import java.util.Scanner;

public class HammingDistance {


	public static void hammingDist(int a, int b) {
		int hamming = 0;
		while(a != 0 || b != 0) {
			if(a%2 != b%2)
				hamming++;
			a=a/2;
			b=b/2;
		}
		System.out.println("The Hamming Distance is: "+hamming);
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of first number: ");
		int a= sc.nextInt();
		System.out.println("Enter the value of second number: ");
		int b= sc.nextInt();
		hammingDist(a, b);
	}
}
