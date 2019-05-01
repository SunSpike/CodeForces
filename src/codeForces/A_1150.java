package codeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_1150 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int temp;
		
		int buyMin;
		int sellMax;
		
		String removeBlank = sc.nextLine();
		
		ArrayList<Integer> buyList = new ArrayList<Integer>();
		ArrayList<Integer> sellList = new ArrayList<Integer>();
		
		
		for ( int i = 0; i < n; i++ ){
			temp = sc.nextInt();
			buyList.add(temp);
		}
		
		removeBlank = sc.nextLine();
		
		for ( int i = 0; i < m; i++ ){
			temp = sc.nextInt();
			sellList.add(temp);
		}
		
		buyMin = buyList.get(0);
		sellMax = sellList.get(0);
		
		for ( int i = 0; i < buyList.size(); i++ ){
			if ( buyMin > buyList.get(i) )
				buyMin = buyList.get(i);
		}
		
		for ( int i = 0; i < sellList.size(); i++ ){
			if ( sellMax < sellList.get(i) )
				sellMax = sellList.get(i);
		}
		
		if ( buyMin >= sellMax){
			System.out.println(r);
			return;
		}

		else
			r = r - (buyMin * (r / buyMin)) + (sellMax * (r / buyMin));
		
		System.out.println(r);
	}
}
