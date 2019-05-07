package codeForces;

import java.util.Scanner;

public class A_236 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String temp = sc.nextLine();
		int[] array = new int[26];
		int count = 0;
		for ( int i = 0; i < temp.length(); i++ ){
			array[temp.charAt(i)-97]++;
		}
		
		for ( int i = 0; i < 26; i++ ){
			if ( array[i] > 0 )
				count++;
		}
		
		if ( count % 2 == 0 )
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}
}
