/*
 * ================================
 * ||           Person           ||
 * ================================
 * || [0..*] + children : Person ||
 * ================================
 */

package iml.inheritobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class Person extends Namable {

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<Person> children;

	public Person(ArrayList<Person> children, String name) {
		super(name);
		this.children = children;
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

		pretty += "children: [\n";
		final StringBuilder childrenString = new StringBuilder();
		if(this.children != null) {
			this.children.forEach((x) -> childrenString.append(x.prettyPrint(indent+2)));
		}
		pretty += childrenString.toString();

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
	 * @return current value of children
	 */
	public ArrayList<Person>  getChildren() {
		return this.children;
	}


	// ======================================= Setters

	/**
	 * @param children Set value of children
	 */
	public void setChildren(ArrayList<Person>  children) {
		this.children = children;
	}

}

