package assignment1;

import java.lang.Math;

public class Checkvalue {
	
	

	public static void main(String[] args) {
	
		Dividepoly d = new Dividepoly();
		RKequationstate rk = new RKequationstate(); 
		Evaluate e = new Evaluate();
		Determinant1 dt = new Determinant1();
		
		
		
		d.contructDividend();
		d.constructDivisor();
		d.Divide();
		
		
		
		
		e.contructpoly();
		e.evaluate();
		
		System.out.println("  ");
		
		System.out.println("Dividend " + d.Dividendcopy);
		System.out.println("Divisor " + d.Divisor);
		System.out.println("Quotient " + d.Quotient );
		System.out.println("Remainder " + d.Dividend );
		
		System.out.println("  ");
		
		Tanvalue t = new Tanvalue() ;
		System.out.println(" Number of terms in expansion in tan 5pi/9  is  " + t.usingcot());
		
		System.out.println("  ");
		
		
		rk.BothPressures(325);
		rk.BothPressures(450);
		rk.MeanSignDifference(325);
		rk.MeanSignDifference(450);
		rk.RootSquareDeviation(325);
		rk.RootSquareDeviation(450);
		rk.MeanbyNewtonRaphson(325);
		rk.MeanbyNewtonRaphson(450);
		rk.MeanbyRedlichKwong(325);
		rk.MeanbyRedlichKwong(450);	

	}

}
