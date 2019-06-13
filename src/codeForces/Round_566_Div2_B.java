package codeForces;

import java.util.Scanner;

public class Round_566_Div2_B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int counter = 0;
		boolean flag = true;
		
		sc.nextLine();
		char[][] a = new char[x][y];
		
		for ( int i = 0; i < x; i++ ){
			String temp = sc.nextLine();
			for ( int j = 0; j < y; j++ ){
				a[i][j] = temp.charAt(j);
			}
		}
		
		for ( int i = 1; i < x-1; i++ ){
			for ( int j = 1; j < y-1; j++ ){
				if ( a[i][j] == '*' && a[i-1][j] == '*' && a[i][j-1] == '*' && a[i][j+1] == '*' && a[i+1][j] == '*'){
					a[i][j] = '.';
					for ( int k = i-1; k >= 0; k-- ){
						if ( a[k][j] == '*' )
							a[k][j] = '.';
						else
							break;
					}
					
					for ( int k = j-1; k >= 0; k-- ){
						if ( a[i][k] == '*' )
							a[i][k] = '.';
						else
							break;
					}
					
					for ( int k = j+1; k < y; k++ ){
						if ( a[i][k] == '*' )
							a[i][k] = '.';
						else
							break;
					}
					
					for ( int k = i+1; k < x; k++ ){
						if ( a[k][j] == '*' )
							a[k][j] = '.';
						else
							break;
					}
					counter = 1;
				}
				if ( counter == 1 )
					break;
			}
			if ( counter == 1 )
				break;
		}		
		
		
		for ( int i = 0; i < x; i++ ){
			for ( int j = 0; j < y; j++ ){
				if ( a[i][j] == '*' ){
					System.out.println("NO");
					return;
				}
			}
		}
		
		
		System.out.println("YES");
	}
}
