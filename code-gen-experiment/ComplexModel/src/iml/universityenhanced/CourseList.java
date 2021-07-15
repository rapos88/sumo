/*
 * ==============================================
 * ||                CourseList                ||
 * ==============================================
 * || [0..*] + courseInfos : CourseStudentInfo ||
 * ==============================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class CourseList {

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<CourseStudentInfo> courseInfos;

	public CourseList(ArrayList<CourseStudentInfo> courseInfos) {
		super();
		this.courseInfos = courseInfos;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public CourseList() { }


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

		pretty += "CourseList: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "courseInfos: [\n";
		final StringBuilder courseInfosString = new StringBuilder();
		if(this.courseInfos != null) {
			this.courseInfos.forEach((x) -> courseInfosString.append(x.prettyPrint(indent+2)));
		}
		pretty += courseInfosString.toString();

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
	 * @return current value of courseInfos
	 */
	public ArrayList<CourseStudentInfo>  getCourseInfos() {
		return this.courseInfos;
	}


	// ======================================= Setters

	/**
	 * @param courseInfos Set value of courseInfos
	 */
	public void setCourseInfos(ArrayList<CourseStudentInfo>  courseInfos) {
		this.courseInfos = courseInfos;
	}


	/**
	 * Destructor for CourseList when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.courseInfos = null;
	}

}

