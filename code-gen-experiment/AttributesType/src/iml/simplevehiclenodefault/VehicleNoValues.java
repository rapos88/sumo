package iml.simplevehiclenodefault;

public class VehicleNoValues {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();


		// Set object attributes.
		vehicle1.setName("");
		vehicle1.setHorsePower(0);
		vehicle1.setPrice(Double.valueOf(0.0));
		vehicle1.setIsUsed(false);


		// Implement relations between model objects.
		System.out.println(vehicle1);
	}
}