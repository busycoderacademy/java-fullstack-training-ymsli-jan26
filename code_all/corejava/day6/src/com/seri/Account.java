package com.seri;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 1453341831602348990L;
	int id;
	double balance;
	int tax;
	static String bankName="SBI";
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	
}
