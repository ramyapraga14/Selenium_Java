package com.maveric.JavaAssignment;

import java.util.Scanner;

public class Pgm7_ArrayInputMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array limit:");
		int n = input.nextInt();
		float Temp[] = new float[n];
		System.out.println("Enter the Temparatures for previous"+n+" days: ");
		for(int i=0;i<n;i++)
		{
			Temp[i]= input.nextFloat();
		}
		float max = Temp[0];
		for (int j=0;j<Temp.length;j++)
		{
			if(Temp[j]>max)
			{
				max=Temp[j];
			}
		}
		System.out.println("\nThe Maximum Temparature is : "+ max);
		float min =Temp[0];
		for (int k=0;k<Temp.length;k++)
		{
			if(Temp[k]<max)
			{
				max=Temp[k];
			}
		}
		System.out.println("\nThe Minimum Temparature is : "+ min);
		/*for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(Temp[i]>Temp[j]);
				float max = Temp[i];
			}
			System.out.println(Temp[i]);
		}*/

	}

}
