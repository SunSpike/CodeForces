package codeForces;

import java.util.Scanner;

public class A_266 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		sc.nextLine();
		String temp = sc.nextLine();
		
		int result = 0;
		
		for ( int i = 0; i < count-1; i++ ){
			if ( temp.charAt(i) == temp.charAt(i+1) )
				result++;
		}
		
		System.out.println(result);
	}
}
