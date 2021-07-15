/*
 * ==================================
 * ||           Professor          ||
 * ==================================
 * || [0..*] + department : STRING ||
 * ==================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class Professor extends Person {

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<String> department;

	public Professor(String name, String ID, ArrayList<String> department) {
		super(name, ID);
		this.department = department;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Professor() { }


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

		pretty += "Professor: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "ID: \"" + this.ID + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "department: [\"" + String.join("\", \"", this.department) + "\"]" + "\n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters

	/**
	 * @return current value of department
	 */
	public ArrayList<String> getDepartment() {
		return this.department;
	}


	// ======================================= Setters

	/**
	 * @param department Set value of department
	 */
	public void setDepartment(ArrayList<String> department) {
		this.department = department;
	}

}

