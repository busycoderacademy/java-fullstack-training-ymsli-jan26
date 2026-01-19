package com.seri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSer {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Account account=new Account();
		account.id=77;
		account.balance=5600.00;
		account.bankName="pnb";
		
		ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
		oos.writeObject(account);
		System.out.println("Acc object is ser");
	}
}
