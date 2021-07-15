/*
 * =========================================
 * ||               Vehicle               ||
 * =========================================
 * || [0..1] + name : STRING              ||
 * || [0..1] + horsePower : INTEGER = 100 ||
 * || [0..1] + price : DOUBLE = 1000.0    ||
 * || [0..1] + isUsed : BOOLEAN           ||
 * || [1..1] + owner : Person             ||
 * =========================================
 */

package iml.relationreferenceself;

public class Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Integer horsePower = 100;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Double price = 1000.0;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean isUsed;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Person owner = new Person();

	public Vehicle(Person owner, String name, Integer horsePower, Double price, Boolean isUsed) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.price = price;
		this.isUsed = isUsed;
		this.owner = owner;
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
	 * @return current value of owner
	 */
	public Person getOwner() {
		return this.owner;
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
	 * @param owner Set value of owner
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}

}

