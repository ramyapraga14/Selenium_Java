package com.maveric.JavaAssignment;

import java.util.Scanner;

public class Pgm5_SumOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Upper limit:");
		int Limit = input.nextInt();
		for (int i=1;i<=Limit;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of ODD number within given Limit: "+ sum);
		
	}

}
