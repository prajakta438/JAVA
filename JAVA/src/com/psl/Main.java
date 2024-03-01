package com.psl;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book details(code,title,author,price,category)");
		 String code = sc.next();
		 String title = sc.next();
		 String author = sc.next();
		 double price = sc.nextDouble();
		 String category = sc.next();
		 
		 
		 String details = code+","+title+","+author+","+price+","+category;
		 
		 Book b = new Book(code,title,author,price,category);
		 
		
		 BookBO bo = new BookBO();
		 bo.createBook(details);
		 System.out.println("Menu"+"\n"+"1.Buy book\n"+"2.Rent book");
		 int ch = sc.nextInt();
		
		 if(ch==1) {
			 
			 bo.generateBill(b);
			 
		 }
		 else if (ch==2) {
			 System.out.println("Enter the rental days");
			 int days= sc.nextInt();
			 bo.generateBill(b,days );
			 
		 }
		 
		
	}
}
