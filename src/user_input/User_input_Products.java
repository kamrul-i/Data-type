package user_input;

import java.util.Scanner;

public class User_input_Products {
	public static void main(String[] args) {
		
		
		//কিস্তিতে কোন কিছু কেনার মতো ।। দোকানি দাম নির্দিষ্ট করে দিল, তারপর আমরা কিস্তি দিলাম।।
		try (Scanner input = new Scanner(System.in)) {
			int phonePrice = 1800;
			int num, result;
			
			System.out.print("Number of installments : ");
			num = input.nextInt();
			
			result = phonePrice / num;
			System.out.print("Monthly installments Amount : " +result+ " euros.");
		}
		
	}

}
