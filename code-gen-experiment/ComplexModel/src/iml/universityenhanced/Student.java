/*
 * ======================================
 * ||              Student             ||
 * ======================================
 * || [1..*] + major : STRING          ||
 * || [1..1] + courseList : CourseList ||
 * ======================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class Student extends Person {

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<String> major = new ArrayList<String>(Arrays.asList(""));

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public CourseList courseList = new CourseList();

	public Student(String name, String ID, CourseList courseList, ArrayList<String> major) {
		super(name, ID);
		this.major = major;
		this.courseList = courseList;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Student() { }


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

		pretty += "Student: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "ID: \"" + this.ID + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "major: [\"" + String.join("\", \"", this.major) + "\"]" + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "courseList: [\n";
		final StringBuilder courseListString = new StringBuilder();
		if(this.courseList != null) {
			courseListString.append(this.courseList.prettyPrint(indent+2));
		}
		pretty += courseListString.toString();

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
	 * @return current value of major
	 */
	public ArrayList<String> getMajor() {
		return this.major;
	}

	/**
	 * @return current value of courseList
	 */
	public CourseList getCourseList() {
		return this.courseList;
	}


	// ======================================= Setters

	/**
	 * @param major Set value of major
	 */
	public void setMajor(ArrayList<String> major) {
		this.major = major;
	}

	/**
	 * @param courseList Set value of courseList
	 */
	public void setCourseList(CourseList courseList) {
		this.courseList = courseList;
	}


	/**
	 * Destructor for Student when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.courseList = null;
	}

}

