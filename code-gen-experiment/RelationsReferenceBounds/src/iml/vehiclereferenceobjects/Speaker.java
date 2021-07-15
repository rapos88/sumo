/*
 * =============
 * || Speaker ||
 * =============
 * =============
 */

package iml.vehiclereferenceobjects;

public class Speaker {

	// Empty constructor to allow an object to be instantiated with default values.
	public Speaker() { }


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

		pretty += "Speaker: { \n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters


	// ======================================= Setters

}

