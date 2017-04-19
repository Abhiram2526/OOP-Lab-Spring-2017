/**
* Created by Batakrishna Sahu.
* A program to invoke Desktop Lamp class which have only two possible states (on and off) 
* and two possible behaviors (turn on, turn off)
*/


class Lamp_Burns {
	public static void main(String[] args) {
	
	//Initializing New Objects
	Lamp lamp1 = new Lamp();
	Lamp lamp2 = new Lamp();
	
	
	//Invoking methods on those Lamps
	//Lamp 1 
	lamp1.changeState("on");
	lamp1.changeBehavior("turn on");
	lamp1.printState();
	lamp1.printBehavior();
	
	
	//Lamp 2
	lamp2.changeState("off");
	lamp2.changeBehavior("turn off");
	lamp2.printState();
	lamp2.printBehavior();
	}
}
