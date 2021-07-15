package iml.relationreferenceself;

import java.util.Arrays;
import java.util.ArrayList;

public class CarWithOwnerAndChildren {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();


		// Set object attributes.
		vehicle1.setName("van");
		vehicle1.setHorsePower(250);
		vehicle1.setPrice(Double.valueOf(32512.55));
		vehicle1.setIsUsed(true);

		person1.setName("Mom");
		person1.setChildren(new ArrayList<Person>());

		person2.setName("son");

		person3.setName("daughter");


		// Implement relations between model objects.
		vehicle1.setOwner(person1);
		person1.getChildren().add(person2);
		person1.getChildren().add(person3);
		System.out.println(vehicle1);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
}