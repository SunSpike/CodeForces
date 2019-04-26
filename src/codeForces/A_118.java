package codeForces;

import java.util.Scanner;

public class A_118 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String result = "";
		word = word.toLowerCase();
		
		for ( int i = 0; i < word.length(); i++ ){
			if ( word.charAt(i) != 'a' && word.charAt(i) != 'e' &&  word.charAt(i) != 'i' && 
					word.charAt(i) != 'o' && word.charAt(i) != 'u' && word.charAt(i) != 'y' ){
				result = result + "." + word.charAt(i);
			}
		}
		
		System.out.println(result);
	}
}
