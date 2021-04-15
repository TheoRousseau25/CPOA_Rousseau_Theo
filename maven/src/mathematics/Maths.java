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
		int result = 0;
		
		if (b<0) {
			
			for (int i = 0; i < b*-1; i++) {
			    result = addition(result, a);
			
		    }
			
			return result *= -1;
		}
		
		
		else {
			for (int i = 0; i < b; i++) {
		
		    result = addition(result, a);
		    }
		}
        
		
		return result;
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

