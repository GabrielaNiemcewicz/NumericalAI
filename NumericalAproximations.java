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
		System.out.print("Choose higher accuracy (more loop iterations) for a better solution");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose a number to calculate its' square numerically. It can have numbers after a dot.");
		Scanner sin = new Scanner(System.in);
		double tbs =  sin.nextDouble();
		NumericalAproximations area = new NumericalAproximations();
		area.square_Root(tbs,(int)(1.3*Math.log1p(tbs)));
	}

}
