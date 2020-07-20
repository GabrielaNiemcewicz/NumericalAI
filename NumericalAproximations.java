package wordCross;

import java.util.Scanner;

public class NumericalAproximations {
	
	 NumericalAproximations(){}
	
	public void square_Root(double toBeSquared, int accuracy) {
		double solution = 1;
		double helpVar;
		accuracy= accuracy<4?4:accuracy;
		for(int i=0;i<accuracy;i++)
		{helpVar= toBeSquared/solution;
		solution = (helpVar+solution)/2;}
		
		System.out.println(solution+" while true answer is: "+Math.sqrt(toBeSquared));
		System.out.println("Choose higher accuracy (more loop iterations) for a better solution");
	}
	
	public double get_PI_Metropolis_RandomWalk_Algorithm(int domain) {
		double random_x,random_y;
		int constraint1 =-1; int constraint2 = 1; 
		double bound; 
		double area = (int) Math.pow((constraint2-constraint1),2);
		int inside=0;
		double distance;
		
		for(int i=0; i<domain;i++) {
			random_x= Math.random()*2-1;
			random_y= Math.random()*2-1;
			distance = Math.sqrt(random_x*random_x+random_y*random_y);
			if(distance<1)
			inside++;
		
		}
		
		bound = (double)area*inside/domain;
		return (bound);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose a number to calculate its' square root numerically. It can have numbers after a dot.");
		Scanner sin = new Scanner(System.in);
		double tbs =  sin.nextDouble();
		NumericalAproximations area = new NumericalAproximations();
		area.square_Root(tbs,(int)(1.1*Math.log1p(tbs)));
		
		System.out.println("Let's take  a few observations to approximate PI. How many observations? (>900 recommended)");
		tbs= sin.nextInt();
		double pis = 0; 
		double temp;
		System.out.print("Array of observations: ");
		for(int i=0;i<(int)tbs;i++)
		{temp= area.get_PI_Metropolis_RandomWalk_Algorithm(10000);
		System.out.print(temp+",  ");
		pis+= temp;
		}
		pis/=(int)tbs;
		temp = Math.abs((1 - pis/Math.PI)*100000);
		temp= Math.round(temp);
		temp/=1000;
		System.out.println('\n'+"Observed PI: "+pis+", real pi:"+Math.PI+", error: "+temp+"%");
		
	}

}
