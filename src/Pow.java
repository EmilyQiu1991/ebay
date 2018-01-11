
public class Pow {

	public static void main(String[] args) {
		Pow p = new Pow();
		p.myPow(34.00515, -3);
	}
	//n could be negative like myPow(34.00515,-3)
	public double myPow(double x, int n ) {
		double res = 1d;
		int m = Math.abs(n);
		for(int i  = 0; i< m;i++) {
			res = res * x;
		}
		 res = n >0 ? res : 1/res;
		return res;
	}
	 public double pow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        //decreasing n by dividing by 2
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }

}
