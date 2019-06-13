package codeForces;

import java.util.Scanner;

public class B_158 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp;
		sc.nextLine();
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		int result = 0;
		
		for ( int i = 0; i < n; i++ ){
			temp = sc.nextInt();
			switch(temp){
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			}
		}
		
		//calculating 4
		result = result + count4;

		System.out.println(count1 + " " + count2 + " " + count3 + " " + count4);
		//calculating 1 and 3
		if ( count1 >= count3 ){
			result = result + count3;
			count1 = count1 - count3;
			count3 = count3 - count3;
		} else {
			result = result + count1;
			count3 = count3 - count1;
			count1 = count1 - count1;
		}
		
		//calculating 2
		if ( count2 >= 2 ){
			result = result + (count2/2);
			count2 = count2 % 2;
		}
		
		//calculating 1 and 2
		if ( count1 >= count2 ){
			result = result + count2;
			count1 = count1 - count2;
			count2 = count2 - count2;
		}else{
			result = result + count1;
			count2 = count2 - count1;
			count1 = count1 - count1;
		}
		
		result = result + count1 + count2 + count3;
		
		System.out.println(result);
	}
}
