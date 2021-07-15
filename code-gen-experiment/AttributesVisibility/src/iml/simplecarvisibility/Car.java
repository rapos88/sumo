/*
 * ==================================
 * ||              Car             ||
 * ==================================
 * || [0..1] + name : STRING       ||
 * || [0..1] # horsePower : STRING ||
 * || [0..1] - price : STRING      ||
 * ==================================
 */

package iml.simplecarvisibility;

public class Car {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	protected String horsePower;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	private String price;

	public Car(String name, String horsePower, String price) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.price = price;
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

		pretty += "horsePower: \"" + this.horsePower + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "price: \"" + this.price + "\"\n";

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
	public String getHorsePower() {
		return this.horsePower;
	}

	/**
	 * @return current value of price
	 */
	public String getPrice() {
		return this.price;
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
	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 * @param price Set value of price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

}

