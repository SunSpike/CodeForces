package codeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Round_570_Div3_G {
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> resultMap = new HashMap<>();
		int result = 0;
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ){
			int count = sc.nextInt();

			for ( int j = 0; j < count; j++ ){
				int temp = sc.nextInt();
				int temp2 = sc.nextInt();
				
				if(map.containsKey(temp)){
					Integer temp3 = map.get(temp);
					map.remove(temp);
					map.put(temp, temp3+1);
				}else{
					map.put(temp, 1);
				}
				
				if ( temp2 == 1 ){
					
				}
			}
			
			for(int value: map.values()){
				for ( int temp = value; temp > 0; temp-- ){
					if(!resultMap.containsKey(temp)){
						resultMap.put(temp, 1);
						result = result + temp;
						break;
					}
				}
			}
			map = new HashMap<>();
			resultMap = new HashMap<>();
			System.out.println(result);
			result = 0;
		}
	}
}
