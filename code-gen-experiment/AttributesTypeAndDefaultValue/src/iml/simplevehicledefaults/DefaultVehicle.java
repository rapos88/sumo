package iml.simplevehicledefaults;

public class DefaultVehicle {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();


		// Set object attributes.
		vehicle1.setName("vehicle");
		vehicle1.setHorsePower(100);
		vehicle1.setPrice(Double.valueOf(1000));
		vehicle1.setIsUsed(true);


		// Implement relations between model objects.
		System.out.println(vehicle1);
	}
}