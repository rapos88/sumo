package iml.simplevehicle;

public class Porsche911 {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();


		// Set object attributes.
		vehicle1.setName("2021 Porsche 911");
		vehicle1.setHorsePower(640);
		vehicle1.setPrice(Double.valueOf(99200));
		vehicle1.setIsUsed(true);


		// Implement relations between model objects.
		System.out.println(vehicle1);
	}
}