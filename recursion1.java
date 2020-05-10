package lab10.cmpt220.marist.edu;

import java.util.Scanner;

public class recursion1 {
	
	public static int result = 0;
	public static void main(String[] args) {
		
		System.out.println("Devin White, Recursion, April 27 2020");
		System.out.println("This program will prompt you to enter a number and it ");
		System.out.println("will add that number with all previous numbers down to 1.");
		System.out.println();
		
		int num;
		//get input for num
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = input.nextInt();
		System.out.print("1 + 2 + ... + " + num +  " = ");
		System.out.print(sum(num));
		
		input.close();
		
		
	}

	public static int sum(int num) {
		if(num > 0) {
			result += num;
			return sum(num - 1);
		}
		return result;
	}

}
