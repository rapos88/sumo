/*
 * ===================================
 * ||       CourseStudentInfo       ||
 * ===================================
 * || [0..1] + passed : BOOLEAN     ||
 * || [0..1] + letterGrade : STRING ||
 * || [1..1] + course : Course      ||
 * ===================================
 */

package iml.universityenhanced;

public class CourseStudentInfo {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean passed;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String letterGrade;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Course course = new Course();

	public CourseStudentInfo(Course course, Boolean passed, String letterGrade) {
		super();
		this.passed = passed;
		this.letterGrade = letterGrade;
		this.course = course;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public CourseStudentInfo() { }


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

		pretty += "CourseStudentInfo: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "passed: " + this.passed + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "letterGrade: \"" + this.letterGrade + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "course: [\n";
		final StringBuilder courseString = new StringBuilder();
		if(this.course != null) {
			courseString.append(this.course.prettyPrint(indent+2));
		}
		pretty += courseString.toString();

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
	 * @return current value of passed
	 */
	public Boolean getPassed() {
		return this.passed;
	}

	/**
	 * @return current value of letterGrade
	 */
	public String getLetterGrade() {
		return this.letterGrade;
	}

	/**
	 * @return current value of course
	 */
	public Course getCourse() {
		return this.course;
	}


	// ======================================= Setters

	/**
	 * @param passed Set value of passed
	 */
	public void setPassed(Boolean passed) {
		this.passed = passed;
	}

	/**
	 * @param letterGrade Set value of letterGrade
	 */
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	/**
	 * @param course Set value of course
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

}

