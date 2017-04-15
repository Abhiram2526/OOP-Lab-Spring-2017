import java.util.Scanner;

class DuplicateElimination {

	private int[] arr = new int[5];
	private int temp=0;		

	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter five elements of the 1D array: ");
		for(int i=0;i<5;++i)
			arr[i] = sc.nextInt();
	}
	
	private void process() {
		for(int i=0;i<5;++i) {
			if( arr[i]<10 || arr[i]>100 ) {
				System.out.println("The entered elements should be between 10 and 100 !");
				System.exit(0);
			}
			for(int j=0;j<5;++j)
				if( arr[j] == arr[i] )
					++temp;
		}

	}

	void output() {
		process();
		
		if(temp>5)
			System.out.println("The 1D array contains duplicate(s) !");
		else {
			System.out.print("Entered 1D array is : ");
			for(int i=0;i<5;++i)
				System.out.print(arr[i] + "  ");
		}
	}
}

public class DuplicateEliminationTest {
	public static void main(String[] args) {
		DuplicateElimination de = new DuplicateElimination();
		
		de.input();
		de.output();
	}
}