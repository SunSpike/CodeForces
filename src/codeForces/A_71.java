package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class A_71 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String temp = "";
		int count = sc.nextInt();
		String deleteBlank = sc.nextLine();
		ArrayList<String> tempList = new ArrayList<String>();
		ArrayList<String> resultList = new ArrayList<String>();
		
		for ( int i = 0; i < count; i++ ){
			temp = sc.nextLine();
			tempList.add(temp);
		}
		
		for ( int i = 0; i < count; i++ ){
			//temp is word in tempList.
			temp = tempList.get(i);
			if ( temp.length() > 10 ){	
				temp = "" + temp.charAt(0) + (temp.length()-2) + temp.charAt(temp.length()-1);	
				resultList.add(temp);
			} else {
				resultList.add(temp);
			}
		}
		
		for ( int i = 0; i < count; i++ ){
			System.out.println(resultList.get(i));
		}
	}
}
