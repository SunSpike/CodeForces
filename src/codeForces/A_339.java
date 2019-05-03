package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A_339 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		
		int[] array = new int[temp.length()/2 + 1];
		
		String result = "";
		
		for ( int i = 0; i < temp.length(); i++ ){
			if ( temp.charAt(i) != '+' )
				array[i/2] = Integer.parseInt(temp.charAt(i)+"");
		}
		
		Arrays.sort(array);
		
		for ( int i = 0; i < array.length; i++ ){
			if ( i != array.length - 1)
				result = result + array[i] + "+";
			else
				result = result + array[i];
		}
		
		System.out.println(result);
	}
}
