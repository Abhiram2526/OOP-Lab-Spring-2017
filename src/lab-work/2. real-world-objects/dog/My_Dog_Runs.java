/**
* Created by Batakrishna Sahu.
* A java program to use Dog class having state (name, color, breed,
* hungry) and behavior (barking, fetching, wagging tail)
*/


class My_Dog_Runs {
	public static void main(String[] args) {
	
	//Initiating two Dog Creation
	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	
	//Invoking methods on those Dogs
	//Invoking States
	dog1.changeName("Scooby-Doo");
	dog1.changeColor("Brown");
	dog1.changeBreed("Doberman");
	dog1.changeHungry("Always");
	dog1.printStates();
	
	dog2.changeName("Spikes");
	dog2.changeColor("White");
	dog2.changeBreed("German Sheperd");
	dog2.changeHungry("Nope");
	dog2.printStates();
	
	//Invoking Behavior
	dog1.changeBarking("Scooby-Doody-Doooooo!");
	dog1.changeFetch("Stick");
	dog1.changeWagging("Yup");
	dog1.printBehavior();
	
	dog1.changeBarking("My-Names-Jeff!");
	dog1.changeFetch("Ball");
	dog1.changeWagging("Hates It");
	dog1.printBehavior();
	}
}
