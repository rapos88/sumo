/*
 * ==================================
 * ||              Car             ||
 * ==================================
 * || [0..1] + isRacecar : BOOLEAN ||
 * ==================================
 */

package iml.inheritprimitives;

public class Car extends Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean isRacecar;

	public Car(String name, Integer horsePower, Double price, Boolean isUsed, Boolean isRacecar) {
		super(name, horsePower, price, isUsed);
		this.isRacecar = isRacecar;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Car() { }


	public String toString() {
		return this.prettyPrint(0);
	}

	protected String prettyPrint(int indent) {
		String pretty = "";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		if(indent > 10) {
			return pretty + "...\n";
		}

		pretty += "Car: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "horsePower: " + this.horsePower + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "price: " + this.price + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "isUsed: " + this.isUsed + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "isRacecar: " + this.isRacecar + "\n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters

	/**
	 * @return current value of isRacecar
	 */
	public Boolean getIsRacecar() {
		return this.isRacecar;
	}


	// ======================================= Setters

	/**
	 * @param isRacecar Set value of isRacecar
	 */
	public void setIsRacecar(Boolean isRacecar) {
		this.isRacecar = isRacecar;
	}

}

