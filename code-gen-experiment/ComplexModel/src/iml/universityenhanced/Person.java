/*
 * ============================
 * ||         Person         ||
 * ============================
 * || [1..1] + name : STRING ||
 * || [1..1] + ID : STRING   ||
 * ============================
 */

package iml.universityenhanced;

public abstract class Person {

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String name = "";

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String ID = "";

	public Person(String name, String ID) {
		super();
		this.name = name;
		this.ID = ID;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Person() { }


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

		pretty += "Person: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "ID: \"" + this.ID + "\"\n";

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
	 * @return current value of ID
	 */
	public String getID() {
		return this.ID;
	}


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param ID Set value of ID
	 */
	public void setID(String ID) {
		this.ID = ID;
	}

}

