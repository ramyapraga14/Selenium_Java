package com.maveric.JavaAssignment;

import java.util.Scanner;

public class Pgm8_BinaryTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int n = input.nextInt();
		int row,col;
		for (row = 1; row <= n; row++)  
        { 
            for (col = 1; col <= row; col++)  
            { 
                if (((row + col) % 2) == 0)  
                    System.out.print("1"); 
                else
                    System.out.print("0"); 
                      
                System.out.print("\t"); 
            } 
              
            System.out.print("\n"); 
        } 

	}

}
