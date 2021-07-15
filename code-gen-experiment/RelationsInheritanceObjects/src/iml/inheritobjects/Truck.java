/*
 * ======================================
 * ||               Truck              ||
 * ======================================
 * || [0..1] + towingCapacity : DOUBLE ||
 * ======================================
 */

package iml.inheritobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class Truck extends Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Double towingCapacity;

	public Truck(ArrayList<Part> parts, Person owner, String name, Integer horsePower, Double price, Boolean isUsed, Double towingCapacity) {
		super(parts, owner, name, horsePower, price, isUsed);
		this.towingCapacity = towingCapacity;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Truck() { }


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

		pretty += "Truck: { \n";

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

		pretty += "towingCapacity: " + this.towingCapacity + "\n";

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
	 * @return current value of towingCapacity
	 */
	public Double getTowingCapacity() {
		return this.towingCapacity;
	}


	// ======================================= Setters

	/**
	 * @param towingCapacity Set value of towingCapacity
	 */
	public void setTowingCapacity(Double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

}

