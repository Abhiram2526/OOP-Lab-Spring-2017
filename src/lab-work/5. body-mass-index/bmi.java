/**
* Create a BMI calculator that reads the user's weight in kilograms and height in meters,
* then calculates and displays the user's body mass index.
* Link to US Department of Health and Human Services for reference
* http://www.nhlbi.nih.gov/guidelines/obesity/BMI/bmicalc.htm
*/

 import java.util.Scanner;

 public class bmi {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Weight(kgs): ");
 		Float weight = input.nextFloat();
 		System.out.print("Height(mts): ");
 		Float height = input.nextFloat();
 		Float bmi;

 		bmi = weight/(height*height);
 		System.out.println("BMI: " + bmi);

 		if(bmi<18.5)
 			System.out.println("Your BMI represents you are UNDERWEIGHT");
 		else if((bmi>=18.5)&&(bmi<=24.9))
 			System.out.println("Your BMI represents you are NORMAL");
 		else if((bmi>=25)&&(bmi<=29.9))
 			System.out.println("Your BMI represents you are OVERWEIGHT");
 		else if (bmi>=30)
 			System.out.println("Your BMI represents you are OBESE");
 		else
 			System.out.println("Error Please Try Again !");

 	}
 }