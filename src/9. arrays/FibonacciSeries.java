import java.util.Scanner;

class Fibonacci {
	private long a=-1;
	private long b=1;
	private long fnum;

        void fibonacci(int n) {
		for(int i=0;i<n;++i) {
			fnum=a+b;
			a=b;
			b=fnum;
			if( i==(n-1) )
				System.out.println("nth fibonacci number is : " + fnum);	
		}	
	}
	long largestFibonacciNumber() {
		fnum=0;
		a=-1;
		b=1;
		int temp=0;

		while( true ){
			fnum=a+b;
			a=b;
			if(fnum<0)
				break;
			b=fnum;
		}
		return b;	
	}
}

public class FibonacciSeries {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the value of n: ");
		n = sc.nextInt();

		f.fibonacci(n);
		System.out.printf("Largest fibonacci number: " + f.largestFibonacciNumber() );
	}
}