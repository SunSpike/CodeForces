package codeForces;

import java.util.Scanner;

public class A_231 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int	result = 0;
		int temp = 0;
		int count = 0;
		
		for ( int i = 0; i < n; i++ ){
			for ( int j = 0; j < 3; j++ ){
				temp = sc.nextInt();
				if ( temp == 1 )
					count++;
			}
			if ( count >= 2 )
				result++;
			
			count = 0;
		}
		
		System.out.println(result);
	}
}
