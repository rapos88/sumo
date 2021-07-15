/*
 * =====================================
 * ||              Course             ||
 * =====================================
 * || [1..1] + courseNumber : INTEGER ||
 * || [1..1] + title : STRING         ||
 * || [1..1] + creditHours : INTEGER  ||
 * || [1..2] + instructor : Professor ||
 * || [0..2] + assistants : Student   ||
 * || [1..*] + students : Student     ||
 * =====================================
 */

package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class Course {

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Integer courseNumber = 0;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public String title = "";

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Integer creditHours = 0;

	/**
	 * @lowerBound 1
	 * @upperBound 2
	 */
	public ArrayList<Professor> instructor = new ArrayList<Professor> (Arrays.asList(new Professor()));

	/**
	 * @lowerBound 0
	 * @upperBound 2
	 */
	public ArrayList<Student> assistants;

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Student> students = new ArrayList<Student> (Arrays.asList(new Student()));

	public Course(ArrayList<Professor> instructor, ArrayList<Student> assistants, ArrayList<Student> students, Integer courseNumber, String title, Integer creditHours) {
		super();
		this.courseNumber = courseNumber;
		this.title = title;
		this.creditHours = creditHours;
		this.instructor = instructor;
		this.assistants = assistants;
		this.students = students;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Course() { }


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

		pretty += "Course: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "courseNumber: " + this.courseNumber + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "title: \"" + this.title + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "creditHours: " + this.creditHours + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "instructor: [\n";
		final StringBuilder instructorString = new StringBuilder();
		if(this.instructor != null) {
			this.instructor.forEach((x) -> instructorString.append(x.prettyPrint(indent+2)));
		}
		pretty += instructorString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "assistants: [\n";
		final StringBuilder assistantsString = new StringBuilder();
		if(this.assistants != null) {
			this.assistants.forEach((x) -> assistantsString.append(x.prettyPrint(indent+2)));
		}
		pretty += assistantsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "students: [\n";
		final StringBuilder studentsString = new StringBuilder();
		if(this.students != null) {
			this.students.forEach((x) -> studentsString.append(x.prettyPrint(indent+2)));
		}
		pretty += studentsString.toString();

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
	 * @return current value of courseNumber
	 */
	public Integer getCourseNumber() {
		return this.courseNumber;
	}

	/**
	 * @return current value of title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @return current value of creditHours
	 */
	public Integer getCreditHours() {
		return this.creditHours;
	}

	/**
	 * @return current value of instructor
	 */
	public ArrayList<Professor> getInstructor() {
		return this.instructor;
	}

	/**
	 * @return current value of assistants
	 */
	public ArrayList<Student>  getAssistants() {
		return this.assistants;
	}

	/**
	 * @return current value of students
	 */
	public ArrayList<Student> getStudents() {
		return this.students;
	}


	// ======================================= Setters

	/**
	 * @param courseNumber Set value of courseNumber
	 */
	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}

	/**
	 * @param title Set value of title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param creditHours Set value of creditHours
	 */
	public void setCreditHours(Integer creditHours) {
		this.creditHours = creditHours;
	}

	/**
	 * @param instructor Set value of instructor
	 */
	public void setInstructor(ArrayList<Professor> instructor) {
		this.instructor = instructor;
	}

	/**
	 * @param assistants Set value of assistants
	 */
	public void setAssistants(ArrayList<Student>  assistants) {
		this.assistants = assistants;
	}

	/**
	 * @param students Set value of students
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}

