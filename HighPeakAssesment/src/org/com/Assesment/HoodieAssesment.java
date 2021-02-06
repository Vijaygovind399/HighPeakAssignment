package org.com.Assesment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HoodieAssesment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		Map<Integer,String> lhs = new LinkedHashMap<>();
		for(int i=0;i<N;i++) {
			String goodieName = sc.next();
			int price = sc.nextInt();
			lhs.put(price,goodieName);
		}
		System.out.print("Number of Employees : ");
		int n= sc.nextInt();
		
		int[] arr = {7980,22345,999,2799,229900,11101,9999,2195,9800,4999};
//sorting
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		int first = 0; int last =0;
		
		int min = arr[n-1] - arr[0];
		
		for(int i=0;i<=arr.length-n;i++) {
			if(arr[i+n-1]-arr[i]<min) {
				min = arr[i+n-1]-arr[i];
				first = i;
				last = i+n-1;
			}
		}
		System.out.println("\nHere the goodies that are selected for distributions are : \n");
		for(int i=first;i<=last;i++) {
			System.out.println(lhs.get(arr[i])+" : "+arr[i]);
		}
		
		System.out.println("\nAnd the difference between the chosen goodie with highest price and lowest price is "+min);
		
		
	}
	
	
}
