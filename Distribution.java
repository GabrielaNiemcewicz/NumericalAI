package wordCross;

public class Distribution {

	Distribution(){}
	
	double normal_value_for(double mean, double std, int x) {
		double fx;
		fx=(1/(std*Math.sqrt(2*Math.PI)))*Math.pow(Math.E,-1*Math.pow((mean-x)/(Math.sqrt(2)*std),2));
		return fx;
	}
	
	/*double up_toconst_of_proportionality(double a, double b,double c,double d) {
		
		
	}*/
	
	double [] normal_Sample(int n,double mean,double std, int sampleSize) {
		double bool=0;
		double Sn=0;
		double [] sample = new double[sampleSize];
		for(int j=0;j<sampleSize;j++) 
		{ Sn=0;
		for(int i=0;i<n;i++)	{
			bool = Math.random();
			bool = (bool>0.5)?1:0;
			Sn+=bool;}
		Sn/=n;
	//	Sn = 2*Math.sqrt(n*(Sn-0.5)); //scaling to standard N(0,1)
		Sn = Math.sqrt(n)*(Sn-(mean+0.5))/(std+0.5); //scaling to any distribution from standard 
		sample[j] = Sn;
		}
		return sample;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Distribution d = new Distribution();
System.out.println(d.normal_value_for(0, 1, 0)+" "+d.normal_Sample(3000, 0, 1, 1)[0]);
double x = Math.random()*20-10;

//for(int i=0;i<10000;i++)
	
	}

}
