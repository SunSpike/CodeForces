package codeForces;

import java.util.Scanner;

public class A_96 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count = 1;
		for ( int i = 0; i < str.length() - 1; i++ ){
			if ( str.charAt(i) == str.charAt(i+1) )
				count++;
			else
				count = 1;
			
			if ( count == 7 ){
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}
}
