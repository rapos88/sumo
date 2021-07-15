package iml.inheritobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class CarVsTruckWithObjects {
	public static void main(String args[]) {

		// Instantiate model objects.
		Car car1 = new Car();
		Truck truck1 = new Truck();
		Part part1 = new Part();
		Part part2 = new Part();
		Part part3 = new Part();
		Part part4 = new Part();
		Part part5 = new Part();
		Part part6 = new Part();
		Part part7 = new Part();
		Part part8 = new Part();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();


		// Set object attributes.
		car1.setName("TwoCylinderCar");
		car1.setHorsePower(150);
		car1.setPrice(Double.valueOf(10000));
		car1.setIsUsed(true);
		car1.setIsRacecar(false);
		car1.setParts(new ArrayList<Part>());

		truck1.setName("FourCylinderTruck");
		truck1.setHorsePower(300);
		truck1.setPrice(Double.valueOf(15000));
		truck1.setIsUsed(false);
		truck1.setTowingCapacity(Double.valueOf(1000));
		truck1.setParts(new ArrayList<Part>());

		part1.setName("engine");
		part1.setSubParts(new ArrayList<Part>());

		part2.setName("engine");
		part2.setSubParts(new ArrayList<Part>());

		part3.setName("cylinder");

		part4.setName("cylinder");

		part5.setName("cylinder");

		part6.setName("cylinder");

		part7.setName("cylinder");

		part8.setName("cylinder");

		person1.setName("John");
		person1.setChildren(new ArrayList<Person>());

		person2.setName("Jane");
		person2.setChildren(new ArrayList<Person>());

		person3.setName("son");

		person4.setName("son");

		person5.setName("daughter");


		// Implement relations between model objects.
		car1.getParts().add(part1);
		car1.setOwner(person1);
		truck1.getParts().add(part2);
		truck1.setOwner(person2);
		part1.getSubParts().add(part3);
		part1.getSubParts().add(part4);
		part2.getSubParts().add(part5);
		part2.getSubParts().add(part6);
		part2.getSubParts().add(part7);
		part2.getSubParts().add(part8);
		person1.getChildren().add(person3);
		person2.getChildren().add(person4);
		person2.getChildren().add(person5);
		System.out.println(car1);
		System.out.println(truck1);
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);
		System.out.println(part6);
		System.out.println(part7);
		System.out.println(part8);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
	}
}