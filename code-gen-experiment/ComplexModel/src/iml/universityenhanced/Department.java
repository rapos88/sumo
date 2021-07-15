/*
 * ==================================
 * ||          Department          ||
 * ==================================
 * || [1..1] + fullName : STRING   ||
 * || [1..1] + deptCode : STRING   ||
 * || [1..*] + faculty : Professor ||
 * || [1..*] + courses : Course    ||
 * || [1..*] + majors : Degree     ||
 * ==================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class Department {

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String fullName = "";

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String deptCode = "";

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Professor> faculty = new ArrayList<Professor> (Arrays.asList(new Professor()));

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Course> courses = new ArrayList<Course> (Arrays.asList(new Course()));

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Degree> majors = new ArrayList<Degree> (Arrays.asList(new Degree()));

	public Department(ArrayList<Professor> faculty, ArrayList<Course> courses, ArrayList<Degree> majors, String fullName, String deptCode) {
		super();
		this.fullName = fullName;
		this.deptCode = deptCode;
		this.faculty = faculty;
		this.courses = courses;
		this.majors = majors;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Department() { }


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

		pretty += "Department: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "fullName: \"" + this.fullName + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "deptCode: \"" + this.deptCode + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "faculty: [\n";
		final StringBuilder facultyString = new StringBuilder();
		if(this.faculty != null) {
			this.faculty.forEach((x) -> facultyString.append(x.prettyPrint(indent+2)));
		}
		pretty += facultyString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "courses: [\n";
		final StringBuilder coursesString = new StringBuilder();
		if(this.courses != null) {
			this.courses.forEach((x) -> coursesString.append(x.prettyPrint(indent+2)));
		}
		pretty += coursesString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "majors: [\n";
		final StringBuilder majorsString = new StringBuilder();
		if(this.majors != null) {
			this.majors.forEach((x) -> majorsString.append(x.prettyPrint(indent+2)));
		}
		pretty += majorsString.toString();

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
	 * @return current value of fullName
	 */
	public String getFullName() {
		return this.fullName;
	}

	/**
	 * @return current value of deptCode
	 */
	public String getDeptCode() {
		return this.deptCode;
	}

	/**
	 * @return current value of faculty
	 */
	public ArrayList<Professor> getFaculty() {
		return this.faculty;
	}

	/**
	 * @return current value of courses
	 */
	public ArrayList<Course> getCourses() {
		return this.courses;
	}

	/**
	 * @return current value of majors
	 */
	public ArrayList<Degree> getMajors() {
		return this.majors;
	}


	// ======================================= Setters

	/**
	 * @param fullName Set value of fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param deptCode Set value of deptCode
	 */
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	/**
	 * @param faculty Set value of faculty
	 */
	public void setFaculty(ArrayList<Professor> faculty) {
		this.faculty = faculty;
	}

	/**
	 * @param courses Set value of courses
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * @param majors Set value of majors
	 */
	public void setMajors(ArrayList<Degree> majors) {
		this.majors = majors;
	}


	/**
	 * Destructor for Department when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.courses = null;
		this.majors = null;
	}

}

