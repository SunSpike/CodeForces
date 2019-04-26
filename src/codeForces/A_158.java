package codeForces;

import java.util.Scanner;

public class A_158 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int temp = 0;
		int standard = 0;
		int count = 0;
		int[] array = new int[50];
		
		for ( int i = 0; i < n; i++ ){
			temp = sc.nextInt();
			array[i] = temp;
		}
		
		standard = array[k-1];
		
		for ( int i = 0; i < n; i++ ){
			if ( array[i] >= standard && array[i] != 0)
				count++;
		}
		
		System.out.println(count);
	}
}
