package basic_data_type;

public class Products {
	
	public static void main(String[] args) {
		
		
		//========================================
		System.out.println("id:          101");
		System.out.println("title:       iphone15");
		System.out.println("price:       1895 euros");
		System.out.println("description: perfect products");
		System.out.println("category:    phone");
		//========================================
		
		System.out.println();
		
		//========================================
		int id =            101;
		String title =       "iphone15 pro.";
		String price =       "1895 euros.";
		String description = "perfect product with best image quality.";
		String category =    "phone.";
		
		System.out.println("id:          "+id);
		System.out.println("title:       "+title);
		System.out.println("price:       "+price);
		System.out.println("description: "+description);
		System.out.println("category:    "+category);
		//============================================
		
		
		System.out.println();
		
		//============================================
		System.out.printf("id:          %d\n", id);
		System.out.printf("title:       %s\n", title);
		System.out.printf("price:       %s\n",price);
		System.out.printf("description: %s\n", description);
		System.out.printf("category:    %s\n", category);
		//============================================
		

	}

}
