/**
* Created by Batakrishna Sahu.
* Dog Class having state (name, color, breed, hungry) and behavior 
* (barking, fetching, wagging tail)
*/


class Dog {
	
	String name = "Fluffy" ;
	String color = "Black" ;
	String breed = "Doberman" ;
	String hungry = "Always" ;
	String barking;
	String fetching;
	String wagging_tail;
	
   void changeName(String newName) {
   	name = newName;
   }
   
   void changeColor(String newColor) {
   	color = newColor;
   }
   
   void changeBreed(String newBreed) {
   	breed = newBreed;
   }
   
   void changeHungry(String newState) {
   	hungry = newState;
   }
   
   void printStates() {
   	System.out.println("Name:" +
   	name + "\tColor:" + color + 
   	"\tBreed:" + breed 
   	+ "\tHungry:" + hungry);
   }
   
  void changeBarking(String newBark) {
  	barking = newBark;
  }
	
  void changeFetch(String newfetch) {
  	fetching = newfetch;
  }
	
  void changeWagging(String newWaggingTail) {
  	wagging_tail = newWaggingTail;
  }
      
  void printBehavior() {
  	System.out.println("Barking:" + 
  	barking + "\tFetching:" +
  	fetching + "\tWagging-Tail:" +
  	wagging_tail);
  }	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
