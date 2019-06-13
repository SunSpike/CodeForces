package codeForces;

import java.util.Scanner;

public class Round_565_Div3_A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		for ( int i = 0; i < n; i++ ){
			long temp = sc.nextLong();
			int count = 0;
			while(temp != 1){
				if ( temp % 2 == 0 || temp % 3 == 0 || temp % 5 == 0 ){
					if ( temp % 2 == 0 ){
						temp = temp / 2;
						count++;
					}else if ( temp % 3 == 0 ){
						temp = temp*2 / 3;
						count++;
					}else if ( temp % 5 == 0 ){
						temp = temp*4 / 5;
						count++;
					}
				}else{
					count = -1;
					break;
				}
			}
			
			System.out.println(count);
			count = 0;
		}
	}
}
	