class SumOfDoubleValues {
	private static double sum=0;

        void sum(double value) {
		sum+=value;
	}
	void output() {
		System.out.println("Sum of the double values = " + sum);
	}
}

public class SumOfDoubleValuesTest {
	public static void main(String[] args) {
		SumOfDoubleValues dv = new SumOfDoubleValues();
		int n = args.length;
		
		for(int i=0;i<n;++i)
			dv.sum(Double.parseDouble(args[i]));
		dv.output();
	}
}