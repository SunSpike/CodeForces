package codeForces;

import java.util.Scanner;

public class Round_565_Div3_B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = 0;
		int count = 0;
		int count1 = 0;
		
		for ( int i = 0; i < n; i++ ){
			int n2 = sc.nextInt();
			int[] array = new int[n2];
			
			for ( int j = 0; j < n2; j++ ){
				array[j] = sc.nextInt();
			}
			
			for ( int j = 0; j < n2; j++ ){
				if ( array[j] % 3 != 0 )
					array[j] = array[j] % 3;
			}
			
			for ( int j = 0; j < n2; j++ ){
				for ( int k = j+1; k < n2; k++ ){
					if ( array[j] % 3 != 0 && array[k] % 3 != 0 && (array[j] + array[k]) % 3 == 0){
						array[j] = array[j] + array[k];
						array[k] = 0;
						j = 0;
					}
				}
			}
			
			for ( int j = 0; j <n2; j++ ){
				if ( array[j] == 1)
					count1++;
			}

			for ( int j = 0; j < n2; j++ ){
				if ( array[j] % 3 == 0 && array[j] != 0)
					count++;
			}
			
			System.out.println(count + (count1 / 3));
			count = 0;
			count1 = 0;
		}
	}
}
