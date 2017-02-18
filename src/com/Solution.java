package com;

import java.util.Scanner;

public class Solution {
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int  commandSize = sc.nextInt();
		
		long[] arr = new long[arrSize];
		int[][] commands = new int[commandSize][3];
		
		for(int i = 0; i < commandSize; i++){
			for(int x = 0; x < 3; x++){
				commands[i][x] = sc.nextInt();
			}
		}
		
		processCommands(arr,commands);
	}
	
	private static void processCommands(long[] arr, int[][] commands){
		for(int i = 0; i < commands.length; i++){
			int a = commands[i][0];
			int b = commands[i][1];
			int additive = commands[i][2];
			
			for(int x = a - 1; x < b; x++){
				arr[x] += additive;
			}
		}
		
		findMax(arr);
	}
	
	private static void findMax(long[] arr){
		long max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
