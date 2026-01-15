package com.day4.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BookStore {

	private String bookStoreName;
	
	private List<Book> books;
	
	public BookStore(String bookStoreName) {
		this.bookStoreName=bookStoreName;
		try {
			BufferedReader br=
					new BufferedReader(new FileReader(new File("data.txt")));
			String line;
			Book book;
			while((line=br.readLine())!=null) {
				String tokens[]=line.split(":");
				 book = new Book(
				        Integer.parseInt(tokens[0]),
				        tokens[1],
				        tokens[2],
				        tokens[3],
				        Integer.parseInt(tokens[4])
				);
				 
				 books.add(book);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
	}
	public List<Book> getAllBooks(){
		return books;
	}
}
