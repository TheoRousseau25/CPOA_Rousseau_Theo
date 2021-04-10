package mathematics;

import exceptions.MathsExceptions;
import  interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {

		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		
		for (int i = 0; i<b; i++) {
		    a+=a;
		}
		
		return a;
	}
	

	@Override
	public double division(int a, int b) throws MathsExceptions {
	   if (b==0) {
		   throw new MathsExceptions("Division par zero impossible");
	   }
		
		try {
		    return a/b;
	    } catch (Exception e) {
	    	throw new MathsExceptions("Division par zero impossible");
	    }
}
	}
