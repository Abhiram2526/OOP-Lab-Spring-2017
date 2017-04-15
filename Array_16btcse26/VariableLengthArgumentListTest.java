class VariableLengthArgumentList {
	private int p=1;
	private int temp=0;

        void product(int...values) {
		for(int i : values) {
			p*=i;
			++temp;	
		}
		if(temp==0)
			System.out.println("No Arguments !");
		else
			System.out.println("Product = " + p);
	}
}

public class VariableLengthArgumentListTest {
	public static void main(String[] args) {
		VariableLengthArgumentList v = new VariableLengthArgumentList();
		
		v.product(1,2,3,4,5,6);
	}
}