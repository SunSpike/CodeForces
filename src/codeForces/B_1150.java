package codeForces;

import java.util.Scanner;

public class B_1150 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String removeBlank = sc.nextLine();
		
		int [][] array = new int[n][n];
		
		for ( int i = 0; i < n; i++ ){
			String temp = sc.nextLine();
			
			for ( int j = 0; j < n; j++ ){
				if ( temp.charAt(j) == '#' )
					array[i][j] = 1;
				else
					array[i][j] = 0;
			}
		}
		
		for ( int i = 1; i < n-1; i++ ){
			for ( int j = 1; j < n-1; j++ ){
				if ( array[i][j] == 0   && array[i-1][j] == 0 && array[i][j-1] == 0
				  && array[i][j+1] == 0 && array[i+1][j] == 0)
				{
					array[i][j]++;
					array[i-1][j]++;
					array[i][j-1]++;
					array[i][j+1]++;
					array[i+1][j]++;
				}
			}
		}
		
		for ( int i = 0; i < n; i++ ){
			for ( int j = 0; j < n; j++ ){
				if ( array[i][j] != 1 ){
					System.out.println("NO");
					return;
				}
			}
		}
		
		System.out.println("YES");
	}
}
