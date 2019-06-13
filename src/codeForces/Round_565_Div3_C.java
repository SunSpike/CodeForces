package codeForces;

import java.util.Scanner;

public class Round_565_Div3_C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] numberArray = new int[6];
		int count4 = 0;
		int count8 = 0;
		int count15 = 0;
		int count16 = 0;
		int count23 = 0;
		int count42 = 0;
		int not = 0;
		
		for ( int i = 0; i < n; i++ ){
			int temp = sc.nextInt();
			array[i] = temp;
		}
		
		for ( int i = 0; i < n; i++ ){
			if ( array[i] == 4 ){
				count4++;
				numberArray[0]++;
			}
			else if ( array[i] == 8 && count8 < count4){
				count8++;
				numberArray[1]++;
			}
			else if ( array[i] == 15 && count15 < count4 && count15 < count8 ){
				count15++;
				numberArray[2]++;
			}
			else if ( array[i] == 16 && count16 < count4 && count16 < count8 && count16 < count15 ){
				numberArray[3]++;
				count16++;
			}
			else if ( array[i] == 23 && count23 < count4 && count23 < count8 && count23 < count15 && count23 < count16){
				numberArray[4]++;
				count23++;
			}
			else if ( array[i] == 42 && count42 < count4 && count42 < count8 && count42 < count15 && count42 < count16 && count42 < count23)
			{
				numberArray[5]++;
				count42++;
			}else{
				not++;
			}
		}
		
		if ( count4 >= 1 && count8 >= 1 && count15 >= 1 && count16 >= 1 && count23 >= 1 && count42 >= 1 ){
			int count = 0;
			int min = Integer.MAX_VALUE;
			
			for ( int i = 0; i < 6; i++ ){
				if ( numberArray[i] < min )
					min = numberArray[i];
			}
			for ( int i = 0; i < 6; i++ ){
				if ( numberArray[i] >= min )
					not = not + numberArray[i] - min;
			}

			for ( int i = 0; i <= not; i++ ){
				if ( (n - (min * 6) - i) % 6 == 0 ){
					System.out.println(n - (min * 6));
					return;
				}
			}
		}
		System.out.println(n);
	}
}
