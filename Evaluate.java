package assignment1;

import java.util.LinkedList;
import java.lang.Math;

public class Evaluate {
	
	LinkedList<Float> Polynomial;
	
	public Evaluate(){
		Polynomial = new LinkedList<Float>(); 

}
	
	public void contructpoly(){
		for(int i = 0 ; i < 11 ; i++ ){
			Polynomial.add((float) (i+1));
			
		}
	}
	
	
	double doublevalue = 0 ;
	float floatvalue = 0 ;
	
	public void evaluate(){
		double [ ] inputlist = {Math.pow(Math.E,0),Math.pow(Math.E,-2),Math.pow(Math.E,-4),Math.pow(Math.E,-6),Math.pow(Math.E,-8),Math.pow(Math.E,-10)};
		
		
		for(int k = 0 ; k <inputlist.length ; k++){
		
			double input = inputlist[k];
			
			//System.out.println(Math.pow(Math.E,-2));
		for(int i = 0 ; i < Polynomial.size() ; i++){
			
			double v =  Polynomial.get(i) *   Math.pow(input,i);
			float f =  Polynomial.get(i) *  (float) Math.pow(input,i);
			doublevalue = doublevalue + v ;
			floatvalue = floatvalue + f ;
			
			
		}
		
		
		System.out.println("Single Precision " + floatvalue );
		floatvalue = 0 ;
		
		System.out.println("Double Precision " + doublevalue );
		doublevalue = 0 ;
		
		
		
	}
		
		
		
		  
		
		
		
		
		
		
		}
	
	
	





}
