/*
 * ============================
 * ||         Namable        ||
 * ============================
 * || [0..1] + name : STRING ||
 * ============================
 */

package iml.inheritobjects;

public abstract class Namable {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name;

	public Namable(String name) {
		super();
		this.name = name;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Namable() { }


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

		pretty += "Namable: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

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


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

