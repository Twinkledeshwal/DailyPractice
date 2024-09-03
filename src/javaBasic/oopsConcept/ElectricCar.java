package javaBasic.oopsConcept;

//inheritance

public class ElectricCar extends Car implements Vechile {
//overriding
public void printName() {
		System.out.println("override method   "+super.getname() );
	}
	
	//overloading
public void printName(String naam) {
	System.out.println("overload method "+naam);
}
	
	
	
	
	
}
