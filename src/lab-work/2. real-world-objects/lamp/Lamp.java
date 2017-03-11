/**
* Created by Batakrishna Sahu.
* Desktop Lamp class have only two possible states (on and off) and two possible behaviors (turn on, turn off)
*/


class Lamp {
	String state = "on";
	String behavior = "turn on";
	
	
  void changeState(String newState) {
	state = newState;
  }		
  
  void changeBehavior(String newBehavior) {
	behavior = newBehavior;
  }
  
  void printState() {
  	System.out.println("State:" + state);
  }
  
  void printBehavior() {
  	System.out.println("Behavior:" + behavior);
  }
 
 }
