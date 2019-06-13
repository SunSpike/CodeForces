package codeForces;

import java.util.Scanner;

public class Round_566_Div2_A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println((int)Math.pow(2, n/2));
		else
			System.out.println("0");
	}
}
