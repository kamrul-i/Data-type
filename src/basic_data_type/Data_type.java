package basic_data_type;

public class Data_type {
	public static void main(String[] args) {	
		
		//এখানে variable ধরে একটা একটা করে সাথে সাখে print করে দেখানো হয়েছে।।
		boolean b;
		b = true;
		System.out.println("b = "+b);
       
		char c;
		c = 'a';
		System.out.println("c = "+c);
       
		short s;
		s = 32111;
		System.out.println("s = "+s);
       
 
		//এখানে একসাথে সকল variable ধরে আবার নিচে একসাথে print করে দেখানো হয়েছে।।
		int i = 125;
		float f = 787.878545584f;  //float এর মান যা ধরবেন, তার সাথে f না দিলে হবে না ।।
		double d = 787.73498654;   
             
		System.out.println("i = "+i);
		System.out.printf("f = %.2f", f);
		System.out.printf("\n");
		System.out.printf("d = %.1f", d);
		
		//দশমিকের পরে result বেশি থাকলে, দশমিকের পরে কত ঘর show করবে তা select করে দেওয়া হয়েছে, 
		//তবে তার জন্য "printf" use করতে হবে।।
      
	}

}
