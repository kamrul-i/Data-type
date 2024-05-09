package user_input;

import java.util.Scanner;

public class Users_input {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int id;
			String title, description, category;
			double price;
			
			System.out.print("Enter title : ");
			title = input.nextLine();

			System.out.print("Enter description : ");
			description = input.nextLine();
			
			System.out.print("Enter category : ");
			category = input.nextLine();
			
			System.out.print("Enter your id : ");
			id = input.nextInt();
			
			System.out.print("Enter price : ");
			price = input.nextDouble();
			
			System.out.println();
			
			//print option-এ আপনি যেভাবে ইচ্ছা print করতে পারেন, তবে উপরে type করার জন্য ID & price কে নিচে type করতে হয়, তা-না হলে যেকোন ২টি একসাথে হয়ে যায়।।
			System.out.println("id          : "+id);
			System.out.println("title       : "+title);
	        System.out.println("price       : "+price);
	        System.out.println("description : "+description);
	        System.out.println("category    : "+category);
		}

	}

}
