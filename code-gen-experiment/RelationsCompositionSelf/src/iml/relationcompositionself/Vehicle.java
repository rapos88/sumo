/*
 * =========================================
 * ||               Vehicle               ||
 * =========================================
 * || [0..1] + name : STRING = "car"      ||
 * || [0..1] + horsePower : INTEGER = 200 ||
 * || [0..1] + price : DOUBLE = 2000.0    ||
 * || [0..1] + isUsed : BOOLEAN = TRUE    ||
 * || [1..*] + parts : Part               ||
 * =========================================
 */

package iml.relationcompositionself;

import java.util.Arrays;
import java.util.ArrayList;

public class Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name = "car";

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Integer horsePower = 200;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Double price = 2000.0;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean isUsed = true;

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Part> parts = new ArrayList<Part> (Arrays.asList(new Part()));

	public Vehicle(ArrayList<Part> parts, String name, Integer horsePower, Double price, Boolean isUsed) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.price = price;
		this.isUsed = isUsed;
		this.parts = parts;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Vehicle() { }


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

		pretty += "Vehicle: { \n";

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

		pretty += "parts: [\n";
		final StringBuilder partsString = new StringBuilder();
		if(this.parts != null) {
			this.parts.forEach((x) -> partsString.append(x.prettyPrint(indent+2)));
		}
		pretty += partsString.toString();

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
	 * @return current value of name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return current value of horsePower
	 */
	public Integer getHorsePower() {
		return this.horsePower;
	}

	/**
	 * @return current value of price
	 */
	public Double getPrice() {
		return this.price;
	}

	/**
	 * @return current value of isUsed
	 */
	public Boolean getIsUsed() {
		return this.isUsed;
	}

	/**
	 * @return current value of parts
	 */
	public ArrayList<Part> getParts() {
		return this.parts;
	}


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param horsePower Set value of horsePower
	 */
	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 * @param price Set value of price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @param isUsed Set value of isUsed
	 */
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

	/**
	 * @param parts Set value of parts
	 */
	public void setParts(ArrayList<Part> parts) {
		this.parts = parts;
	}


	/**
	 * Destructor for Vehicle when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.parts = null;
	}

}

