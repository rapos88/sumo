/*
 * ==================================
 * ||              Car             ||
 * ==================================
 * || [0..1] + isRacecar : BOOLEAN ||
 * ==================================
 */

package iml.inheritobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class Car extends Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean isRacecar;

	public Car(ArrayList<Part> parts, Person owner, String name, Integer horsePower, Double price, Boolean isUsed, Boolean isRacecar) {
		super(parts, owner, name, horsePower, price, isUsed);
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

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "parts: [\n";
		final StringBuilder partsString = new StringBuilder();
		if(this.parts != null) {
			this.parts.forEach((x) -> partsString.append(x.prettyPrint(indent+2)));
		}
		pretty += partsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "owner: [\n";
		final StringBuilder ownerString = new StringBuilder();
		if(this.owner != null) {
			ownerString.append(this.owner.prettyPrint(indent+2));
		}
		pretty += ownerString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

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

