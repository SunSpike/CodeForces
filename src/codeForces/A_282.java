package codeForces;

import java.util.Scanner;

public class A_282 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String removeBlank = sc.nextLine();
		int result = 0;
		
		for ( int i = 0; i < count; i++ ){
			String temp = sc.nextLine();
			if ( temp.charAt(0) == '+' || temp.charAt(2) == '+' )
				result++;
			else
				result--;
		}
		
		System.out.println(result);
	}
}
