package com;

import java.util.Scanner;

public class Solution {
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int  commandSize = sc.nextInt();
		
		int[] arr = new int[arrSize];
		int[][] commands = new int[commandSize][3];
		
		for(int i = 0; i < commandSize; i++){
			for(int x = 0; x < 3; x++){
				commands[i][x] = sc.nextInt();
			}
		}
		
		process(arr,commands);
	}
	
	private static void process(int[] arr, )

}
