package com.psl;

class BookBO
{
	public Book createBook(String details) {
		
		//Fill your code here
				String [] info = details.split(",");
				String code = info[0];
				String title = info[2];
				
				String author = info[3];
				double price = Double.parseDouble(info[4]);
				String category = info[5];
				
				Book b1= new Book();
				
				b1.code= code;
				b1.title = title;
				b1.author = author;
				b1.price = price;
				b1.category = category;
				
				
				System.out.println(b1);
				return b1;
				
		
				
	}
	
	public void generateBill(Book b) {
		//Fill your code here
	
		System.out.println("Bill:");
		System.out.println("Title:" + b.title);
		System.out.println("Code:" + b.code);
		System.out.println("Author:"+ b.author);
		System.out.println("Category:"+ b.category);
		System.out.println("price:"+ b.price);
		
		
	}
	
	public void generateBill(Book b, int rentalDays) {
		//Fill your code here
		System.out.println("Bill:");
		System.out.println("Title:" + b.title);
		System.out.println("Code:" + b.code);
		System.out.println("Author:"+ b.author);
		System.out.println("Category:"+ b.category);
		//System.out.println("price:"+ b.price);
		
		double rental_amount = (b.price *2/100)*rentalDays;
		System.out.println("price:"+ rental_amount);
		
		
		
	}
}
