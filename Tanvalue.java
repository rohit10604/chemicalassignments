package assignment1;

import java.lang.Math;


public class Tanvalue {
	
	double p ;
	double p1;
	double p2;
	double p3;
	double p4;
	double p5;
	
	
	
	
	
	
	
	
	
	
	
public Tanvalue(){
	
	p =  (Math.PI)/6;
	double r = (Math.tan(p));
	
	double s = r * 0.0001;
	double p1 = 0.0 ;
	double p2 = (1.0/3)  * Math.pow(p, 3) ;
	double p3 = (2.0/(15)) * Math.pow(p, 5);
	double p4 = (17.0/(315)) * Math.pow(p, 7);
	double p5 = (62.0/(2835)) * Math.pow(p, 9) ;
	double p6 = (1382.0/(155925)) * Math.pow(p, 11) ;
	double p7 = (21844.0/(6081075)) * Math.pow(p, 13) ;
	
	
	
	double [ ]  gt = { p1 , p2 , p3 , p4 , p5 , p6 , p7};
	
	
	
	double q = r-s ;

	
	
	for(int i = 0 ; i < gt.length ; i++){
		if(p>q){
		
		System.out.println("Number of terms in tan pi/6 is  " + i);
			break;
			}
		else{
			 p = p+gt[i];
		}
	}
	//System.out.println(p);
	
}
public int factorial(int n){
	int value = 1 ;
	for(int i = 1 ; i <= n ; i++){
		
		value = value * i ;
		
	}
	
	return value ;
}




public double sinxexpansion(double x , int k ){
	double v = 0 ;
	for(int i = 0 ; i < 10 ; i++){
	double value = (Math.pow(-1, i) * Math.pow(x, 2 * i +1))/(factorial(2*i +1 )) ;
	v = v + value ;
	}
	return v ;
	
	
}



public double cosxexpansion(double x , int k ){
	double v = 0 ;
	for(int i = 0 ; i < k; i++){
	double value = (Math.pow(-1, i) * Math.pow(x, 2 * i))/(factorial(2*i )) ;
	v = v + value ;
	}
	return v ;
	
	
}

public double gen(int k ){
	
	
	return (Math.PI * -36)/(Math.pow(Math.PI,2 ) - 324 * k * k * Math.pow(Math.PI,2 ) );
}

public int usingcot(){
	//tan 5pi/7 = -cot pi/18)
	// So we are using cot here (cot expansion is trivial)
	int Ans = 0 ;
	double v = (-18/Math.PI) ;
	
	double ee = Math.tan(5 * Math.PI / 9 );
	
	
	double eee = ee * 9999 / 10000 ;
	
	
	for(int k = 1 ; k < 100000000 ; k++)
	{
	
		
	v = v + gen(k);
	
	if(v > eee )
		Ans = k ;
	
	
	}
	 return Ans ;
	
}




}


	


