/*
 * ========================================
 * ||               Degree               ||
 * ========================================
 * || [1..1] + name : STRING             ||
 * || [3..43] + requiredCourses : Course ||
 * ========================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class Degree {

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String name = "";

	/**
	 * @lowerBound 3
	 * @upperBound 43
	 */
	public ArrayList<Course> requiredCourses = new ArrayList<Course> (Arrays.asList(new Course(), new Course(), new Course()));

	public Degree(ArrayList<Course> requiredCourses, String name) {
		super();
		this.name = name;
		this.requiredCourses = requiredCourses;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Degree() { }


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

		pretty += "Degree: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "requiredCourses: [\n";
		final StringBuilder requiredCoursesString = new StringBuilder();
		if(this.requiredCourses != null) {
			this.requiredCourses.forEach((x) -> requiredCoursesString.append(x.prettyPrint(indent+2)));
		}
		pretty += requiredCoursesString.toString();

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
	 * @return current value of requiredCourses
	 */
	public ArrayList<Course> getRequiredCourses() {
		return this.requiredCourses;
	}


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param requiredCourses Set value of requiredCourses
	 */
	public void setRequiredCourses(ArrayList<Course> requiredCourses) {
		this.requiredCourses = requiredCourses;
	}

}

