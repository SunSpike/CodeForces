package codeForces;

import java.util.Scanner;

public class A_round {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] array = new int[1000];
		
		int count = 0;
		int result = 0;
		int flag = 0;
		
		for ( int i = 0; i < n; i++ ){
			array[i] = 1;
		}
		
		for ( int i = 0; i < m; i++ ){
			if ( array[count] != 0 )
				array[count] = 0;
			else{
				i--;
				count++;
				continue;
			}
			count = count + 2;
			if ( count > n-1 )
				count = count - n;
		}
		
		for ( int i = 0; i < n; i++ ){
			if ( array[i] == 1 && flag == 0 ){
				result++;
				flag = 1;
			} else if ( flag == 1 && array[i] == 0 ){
				flag = 0;
			}
		}
		
		System.out.println(result);
	}
}
