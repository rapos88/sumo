package iml.universityenhanced;

import java.util.Arrays;
import java.util.ArrayList;

public class UniversityEnhanced_inst {
	public static void main(String args[]) {

		// Instantiate model objects.
		Department department1 = new Department();
		Degree degree1 = new Degree();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		Student student1 = new Student();
		Professor professor1 = new Professor();
		CourseList courselist1 = new CourseList();
		CourseStudentInfo coursestudentinfo1 = new CourseStudentInfo();
		Student student2 = new Student();
		Student student3 = new Student();
		CourseList courselist2 = new CourseList();
		CourseList courselist3 = new CourseList();
		CourseStudentInfo coursestudentinfo2 = new CourseStudentInfo();
		CourseStudentInfo coursestudentinfo3 = new CourseStudentInfo();


		// Set object attributes.
		department1.setFullName("Computer Science and Software Engineering");
		department1.setDeptCode("CSE");
		department1.setMajors(new ArrayList<Degree>());
		department1.setFaculty(new ArrayList<Professor>());
		department1.setCourses(new ArrayList<Course>());

		degree1.setName("CS");
		degree1.setRequiredCourses(new ArrayList<Course>());

		course1.setCourseNumber(174);
		course1.setTitle("Fundamentals");
		course1.setCreditHours(3);
		course1.setInstructor(new ArrayList<Professor>());
		course1.setStudents(new ArrayList<Student>());

		course2.setCourseNumber(271);
		course2.setTitle("Object-Oriented");
		course2.setCreditHours(3);
		course2.setInstructor(new ArrayList<Professor>());
		course2.setStudents(new ArrayList<Student>());

		course3.setCourseNumber(274);
		course3.setTitle("Data Structures");
		course3.setCreditHours(3);
		course3.setInstructor(new ArrayList<Professor>());
		course3.setStudents(new ArrayList<Student>());

		student1.setName("John");
		student1.setID("doej23");
		student1.setMajor(new ArrayList<String>(Arrays.asList("CS")));

		professor1.setName("Jim");
		professor1.setID("doej12");
		professor1.setDepartment(new ArrayList<String>(Arrays.asList("CSE")));

		courselist1.setCourseInfos(new ArrayList<CourseStudentInfo>());

		coursestudentinfo1.setPassed(true);
		coursestudentinfo1.setLetterGrade("B");

		student2.setName("Jonah");
		student2.setID("doej34");
		student2.setMajor(new ArrayList<String>(Arrays.asList("SE")));

		student3.setName("James");
		student3.setID("doej45");
		student3.setMajor(new ArrayList<String>(Arrays.asList("CS")));

		courselist2.setCourseInfos(new ArrayList<CourseStudentInfo>());


		coursestudentinfo2.setPassed(true);
		coursestudentinfo2.setLetterGrade("B");

		coursestudentinfo3.setPassed(true);
		coursestudentinfo3.setLetterGrade("C");


		// Implement relations between model objects.
		department1.getMajors().add(degree1);
		department1.getFaculty().add(professor1);
		department1.getCourses().add(course1);
		department1.getCourses().add(course2);
		department1.getCourses().add(course3);
		degree1.getRequiredCourses().add(course3);
		degree1.getRequiredCourses().add(course2);
		degree1.getRequiredCourses().add(course1);
		course1.getInstructor().add(professor1);
		course1.getStudents().add(student3);
		course2.getInstructor().add(professor1);
		course2.getStudents().add(student1);
		course3.getInstructor().add(professor1);
		course3.getStudents().add(student2);
		student1.setCourseList(courselist1);
		courselist1.getCourseInfos().add(coursestudentinfo1);
		coursestudentinfo1.setCourse(course1);
		student2.setCourseList(courselist2);
		student3.setCourseList(courselist3);
		courselist2.getCourseInfos().add(coursestudentinfo3);
		courselist2.getCourseInfos().add(coursestudentinfo2);
		coursestudentinfo2.setCourse(course1);
		coursestudentinfo3.setCourse(course2);
		System.out.println(department1);
	}
}