package com.maveric.JavaAssignment;

import java.util.Scanner;

public class Pgm6_LastSamplesNminusM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N,M;
				
		System.out.println("Enter the M value: ");
		M = input.nextInt();
		System.out.println("Enter the N value: ");
		N = input.nextInt();
		if (M>N)
		{
			System.out.println("The output series is: ");
			for(int i=M;i>M-N;i--)
			{
				System.out.println(i-1);
				
			}
		}
		
	}

}
