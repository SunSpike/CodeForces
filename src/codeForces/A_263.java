package codeForces;

import java.util.Scanner;

public class A_263 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[5][5];
		int result = 0;
		
		for ( int i = 0; i < 5; i++ ){
			for ( int j = 0; j < 5; j++ ){
				array[i][j] = sc.nextInt();
				if(array[i][j] == 1)
					result = Math.abs(i - 2) + Math.abs(j - 2);
			}
			sc.nextLine();
		}
		
		System.out.println(result);
	}
}
