package com;

import java.util.Scanner;

public class Solution {
	
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arrSize = sc.nextInt();
	    int commandSize = sc.nextInt();
	    //difference array
	    int[] arr = new int[arrSize + 11];
	    for(int i = 0; i < commandSize; i++) {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int sum = sc.nextInt();
	        arr[a - 1] += sum;
	        arr[b] -= sum;
	    }
	        
	    long max = Long.MIN_VALUE;
	    long sum = 0;
	        
	    for(int i = 0; i < arrSize; ++i) {
	        sum += arr[i];
	        if(sum > max){
	        	max = sum;
	        }
	    }
	        
	    System.out.println(max);
	    sc.close();
	}
}
