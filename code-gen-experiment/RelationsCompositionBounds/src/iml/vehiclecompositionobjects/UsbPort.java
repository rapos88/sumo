/*
 * =============
 * || UsbPort ||
 * =============
 * =============
 */

package iml.vehiclecompositionobjects;

public class UsbPort {

	// Empty constructor to allow an object to be instantiated with default values.
	public UsbPort() { }


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

		pretty += "UsbPort: { \n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters


	// ======================================= Setters

}

