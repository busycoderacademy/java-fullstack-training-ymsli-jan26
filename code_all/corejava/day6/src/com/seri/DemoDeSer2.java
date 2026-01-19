package com.seri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSer2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account account=null;
		
		ObjectInputStream oos =
				new ObjectInputStream(new FileInputStream(new File("foo.ser")));
		account =(Account) oos.readObject();
		System.out.println(account);
		System.out.println(account.bankName);
		//System.out.println("Acc object is ser");
	}
}
