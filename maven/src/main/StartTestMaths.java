package main;

import interfaces.IMaths;
import mathematics.Maths;

public class StartTestMaths {
	
	public static void main(String[] args) {
		IMaths maths = new Maths();
		System.out.println(maths.multiplication(2,3));
	}
}
