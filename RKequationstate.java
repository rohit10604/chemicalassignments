package assignment1;

public class RKequationstate {
	
	double a ; 
	double  b ; 
	double R ; 
	double Pc ; 
	double Tc ;
	double A ;
	double B ; 
	double c1 ;
	double c2 ; 
	double [] VolumeList = {1, 2 ,3 , 4 , 5 ,6, 7 ,8 ,9, 10};
	
	
	
public RKequationstate(){
	a = 4.612 ;
	b = 0.05821 ;
	R = 0.08314 ; 
	Pc = 50.6 ;
	Tc = 282.5 ;
	A= 0 ;
	B= 0 ;
	
	
}


public double  Pressure(double T , double V ){

	return  (R * T / (V - b )) - (a/(Math.pow(T,0.5) * V * (V + b ) )) ; 
	
}

public void coefficients(double T){
	
	A = (0.424748 * Pc) /(Math.pow(T,0.5) * Tc * Tc);
	B = 0.08664 * Pc / Tc ;
	c1 = A - B - B*B ;
	c2 = -A * B ; 
	
	
}

public double fx(double x){
	return Math.pow(x, 3) - Math.pow(x, 2) + c1 * x + c2 ; 
}

public double fdashx(double x ){
	return 3 * Math.pow(x, 2) - 2 * x  + c1 ;
}



public double PressurebyNewtonRaphson(double T , double V ){
	double Z = 50 ; 
	for(int i = 0 ; i < 15 ; i++){
		Z = Z- fx(Z)/fdashx(Z);
		//System.out.println(xo);
	}
	
	return (Z * R * T)/V  ; 
}

public void BothPressures(int  T){
	for(int j = 0 ; j < VolumeList.length; j++)
	{
	System.out.println(" Pressure by NewtonRaphson " + "at Volume "+ VolumeList[j] + " L " +  " is "+ PressurebyNewtonRaphson(T,VolumeList[j] ) + " bar. ");
	
	System.out.println(" Pressure by Redlich–Kwong equation of state " + "at Volume "+ VolumeList[j] + " L " + " is  " +  Pressure(T,VolumeList[j] ) + " bar.");
	
	System.out.println(" ");
	}
}

public void MeanbyNewtonRaphson(int T){
	double value  = 0 ;
	double mean = 0 ; 
	for(int j = 0 ; j < VolumeList.length; j++)
	{
	value = value  + (PressurebyNewtonRaphson(T,VolumeList[j] ));

	}
	
	mean = value / VolumeList.length ;
	
	System.out.println(" Mean by NewtonRaphson is " + "  " + " at T = " + T + " is "+ mean);
	
}

public void MeanbyRedlichKwong(int T){
	double value  = 0 ;
	double mean = 0 ; 
	for(int j = 0 ; j < VolumeList.length; j++)
	{
	value = value  + (Pressure(T,VolumeList[j] ));

	}
	
	mean = value / VolumeList.length ;
	
	System.out.println("Mean by RedlichKwon is " + "  " + " at T = " + T + " is "+ mean);
	
}






public void MeanSignDifference(int T){
	double value  = 0 ;
	double MSD = 0 ; 
	for(int j = 0 ; j < VolumeList.length; j++)
	{
	value = value  + (PressurebyNewtonRaphson(T,VolumeList[j] ))-(Pressure(T,VolumeList[j] ));

	}
	
	MSD = value / VolumeList.length ; 
			
	System.out.println(" Mean Sign Difference is " + " at  T = " + "  " +  T +"K" +  " is "+ MSD);		
			
	
}

public void RootSquareDeviation(int T){
	double value  = 0 ;
	double RSD = 0 ; 
	for(int j = 0 ; j < VolumeList.length; j++)
	{
	value = value  + Math.pow((PressurebyNewtonRaphson(325,VolumeList[j] ))-(Pressure(325,VolumeList[j] )),2);

	}
	
	RSD = Math.pow(value, 0.5)/ VolumeList.length ; 
			
	System.out.println(" Root Square Deviation is " + " at T = " + " " +  T  +" K"  + " " + "is " + RSD);		
			
	
}









	
	
	

	

}
