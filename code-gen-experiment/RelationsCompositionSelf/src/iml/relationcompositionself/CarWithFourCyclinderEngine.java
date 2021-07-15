package iml.relationcompositionself;

import java.util.Arrays;
import java.util.ArrayList;

public class CarWithFourCyclinderEngine {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();
		Part part1 = new Part();
		Part part2 = new Part();
		Part part3 = new Part();
		Part part4 = new Part();
		Part part5 = new Part();


		// Set object attributes.
		vehicle1.setName("car");
		vehicle1.setHorsePower(200);
		vehicle1.setPrice(Double.valueOf(2000.0));
		vehicle1.setIsUsed(true);
		vehicle1.setParts(new ArrayList<Part>());

		part1.setName("engine");
		part1.setSubParts(new ArrayList<Part>());

		part2.setName("cylinder");

		part3.setName("cylinder");

		part4.setName("cylinder");

		part5.setName("cylinder");


		// Implement relations between model objects.
		vehicle1.getParts().add(part1);
		part1.getSubParts().add(part2);
		part1.getSubParts().add(part3);
		part1.getSubParts().add(part4);
		part1.getSubParts().add(part5);
		System.out.println(vehicle1);
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);
	}
}