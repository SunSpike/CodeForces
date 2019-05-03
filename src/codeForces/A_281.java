package codeForces;

import java.util.Scanner;

public class A_281 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String result = sc.nextLine();
		String temp = Character.toString(result.charAt(0)).toUpperCase();
		result = temp + result.substring(1, result.length());
		
		System.out.println(result);
	}
}
