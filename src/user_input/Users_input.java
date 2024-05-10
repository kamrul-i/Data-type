package user_input;

import java.util.Scanner;

public class Users_input {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
	        
			
			String title;
			System.out.print("Enter title : ");
			title = input.nextLine();
	        System.out.println("Title : "+title);
	        
	       
			int id;
			System.out.print("Enter your id : ");
			id = input.nextInt();
			System.out.println("id : "+id);
			
			
			double number;
			System.out.print("Enter price : ");
			number = input.nextDouble();
	        System.out.println("price : "+number);
	        
	        
		}

	}

}
