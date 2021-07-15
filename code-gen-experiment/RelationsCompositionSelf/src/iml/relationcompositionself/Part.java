/*
 * ==============================
 * ||           Part           ||
 * ==============================
 * || [0..1] + name : STRING   ||
 * || [0..*] + subParts : Part ||
 * ==============================
 */

package iml.relationcompositionself;

import java.util.Arrays;
import java.util.ArrayList;

public class Part {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name;

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<Part> subParts;

	public Part(ArrayList<Part> subParts, String name) {
		super();
		this.name = name;
		this.subParts = subParts;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Part() { }


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

		pretty += "Part: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "subParts: [\n";
		final StringBuilder subPartsString = new StringBuilder();
		if(this.subParts != null) {
			this.subParts.forEach((x) -> subPartsString.append(x.prettyPrint(indent+2)));
		}
		pretty += subPartsString.toString();

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
	 * @return current value of subParts
	 */
	public ArrayList<Part>  getSubParts() {
		return this.subParts;
	}


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param subParts Set value of subParts
	 */
	public void setSubParts(ArrayList<Part>  subParts) {
		this.subParts = subParts;
	}


	/**
	 * Destructor for Part when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.subParts = null;
	}

}

