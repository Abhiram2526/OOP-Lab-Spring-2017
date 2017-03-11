/**
* In the program fields.java, trying to leave the fields
* fields uninitialized and print out their values.Try the same with a
* local variable and see what kind of compiler errors you can produce.
* Becoming familiar with common compiler errors will make it easier to
* recognize bugs in your code. 
**/

 public class RunningfieldsTest_2 {
 	public static void main(String[] args) {
 		fieldsTest_2 obj = new fieldsTest_2();

 		System.out.println("Interger: " + obj.integer + "\nFloating(float): "
			+ obj.floating + "\nfloating(double): " + obj.floatingDouble 
			+ "\nString: " + obj.stringType + "\nByte: " + obj.byteType 
			+ "\nShort: " + obj.shortType + "\nCharacter: " + obj.character 
			+ "\nBoolean: " + obj.b + "\nlong: " + obj.l);
 	}
 }