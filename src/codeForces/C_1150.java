package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class C_1150 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int count1 = 0;
		int count2 = 0;
		int counting = 0;
		
		int number = 0;
		
		int[] result = new int[n];
		
		for ( int i = 0; i < n; i++ ){
			int temp = sc.nextInt();
			
			if ( temp == 2 )
				count2++;
			else
				count1++;
		}
		
		for ( int i = 0; i < n; i++ ){
			if ( count1 > 0 && getPrime(number + 1) ){
				number = number + 1;
				count1--;
				result[i] = 1;
			} else if ( count2 > 0 && getPrime(number + 2) ){
				number = number + 2;
				count2--;
				result[i] = 2;
			} else if ( count1 == 0 ){
				result[i] = 2;
				count2--;
			} else if ( count2 == 0 ){
				result[i] = 1;
				count1--;
			} else if ( !getPrime(number + 1) && !getPrime(number + 2) && count2 > 0 && count2 >= (count1 / 2) ){
				number = number + 2;
				count2--;
				result[i] = 2;
			} else {
				number = number + 1;
				count1--;
				result[i] = 1;
			}
		}
		
		for ( int i = 0; i < result.length; i++ ){
			if ( i == result.length - 1 )
				System.out.print(result[i]);
			else
				System.out.print(result[i] + " ");
		}
	}
	
	public static boolean getPrime(int num){
		if (num == 1)
			return false;
		
        boolean isPrime = false;

		for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
		
        if (isPrime) {
        	return false;
        } else {
            return true;
        }
    }
}
