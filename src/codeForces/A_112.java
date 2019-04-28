package codeForces;

import java.util.Scanner;

public class A_112 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		first = first.toLowerCase();
		second = second.toLowerCase();
		
		if ( first.compareTo(second) == 0 )
			System.out.println("0");
		else if ( first.compareTo(second) < 0 )
			System.out.println("-1");
		else if ( first.compareTo(second) > 0 )
			System.out.println("1");
	}
}
