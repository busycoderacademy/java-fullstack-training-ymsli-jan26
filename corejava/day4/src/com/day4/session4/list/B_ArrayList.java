package com.day4.session4.list;

import java.util.*;

public class B_ArrayList {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(3, "Java: The Complete Reference", "Herbert Schildt", 55.00));
		books.add(new Book(4, "Head First Java", "Kathy Sierra", 42.75));
		books.add(new Book(5, "Spring in Action", "Craig Walls", 42.75));
		
		books.add(new Book(1, "Effective Java", "Joshua Bloch", 45.99));
		books.add(new Book(2, "Clean Code", "Robert C. Martin", 39.50));
		
		
		System.out.println("-------before sorting-----------");
		printMe(books);
		//The method sort(List<T>) in the type Collections is 
		//not applicable for the arguments (List<Book>)
		
		Collections.sort(books);
		System.out.println("----------sorted as per id-----------");
		printMe(books);
		Collections.sort(books, new BookSorterAsPerPriceThenAsPerAutherName());
		printMe(books);
	
	}

	private static void printMe(List<Book> books) {
		Iterator<Book> it=books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
