package com.day3.session2;

import java.util.UUID;

public class B_NotToWrite {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			String s = UUID.randomUUID().toString().intern();
			if (++i % 100_000 == 0) {
				System.out.println(i);
			}
		}
	}
}
