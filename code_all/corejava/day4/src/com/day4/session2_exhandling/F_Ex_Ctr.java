package com.day4.session2_exhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class XEx extends Exception {
}

class YEx extends XEx {
}

class X {
	X() throws IOException {
		System.out.println("ctr class X");
	}
}

class Y extends X {
	Y() throws Exception{
		System.out.println("ctr class Y");
	}
}

public class F_Ex_Ctr {
	public static void main(String[] args) {

		
	}
}
