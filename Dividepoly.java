package assignment1;

import java.util.*;

public class Dividepoly {

LinkedList<Float> Dividend;
LinkedList<Float> Divisor;
LinkedList<Float> Quotient;
LinkedList<Float> Dividendcopy;



public Dividepoly(){
	Dividend = new LinkedList<Float>(); 
	Divisor = new LinkedList<Float>();
	Quotient = new LinkedList<Float>();
	Dividendcopy = new LinkedList<Float>();

}

public void contructDividend(){
	for(int i = 0 ; i < 11 ; i++ ){
		Dividend.addFirst((float) (i+1));
		Dividendcopy.addFirst((float) (i+1));
	}
}

public void constructDivisor(){
	Divisor = new LinkedList<Float>();
	for(int i = 0 ; i < 3; i++ ){
		
		Divisor.addFirst((float) (i+1));
	}
}

public void scalarMultiply(double a){
	
	for(int k = 0 ;  k < Divisor.size() ; k++){
		
	double p = (a * Divisor.get(k).floatValue()) ;
	Divisor.remove(Divisor.get(k));
	Divisor.add(k, (float) p);
	}
	
}

public void subtract(){
	for(int i = 0 ; i < Divisor.size() ; i++){
		float w = Dividend.get(i)- Divisor.get(i);
		Dividend.remove(Dividend.get(i));
		Dividend.add(i,w);
		
	}
	
	Dividend.remove(0);
}




public void Divide(){
	for(int k = 0 ; k < 9 ; k++){
	float q = Dividend.get(0)/Divisor.get(0);
	Quotient.add(q);
	this.scalarMultiply(q);
	this.subtract();
	this.constructDivisor();
	
	
	}
	
	
}









}