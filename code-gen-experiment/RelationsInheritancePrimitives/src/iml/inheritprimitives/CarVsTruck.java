package iml.inheritprimitives;

public class CarVsTruck {
	public static void main(String args[]) {

		// Instantiate model objects.
		Car car1 = new Car();
		Truck truck1 = new Truck();


		// Set object attributes.
		car1.setName("BMW M8 GTE");
		car1.setHorsePower(592);
		car1.setPrice(Double.valueOf(400000));
		car1.setIsUsed(true);
		car1.setIsRacecar(true);

		truck1.setName("Chevrolet Colorado");
		truck1.setHorsePower(308);
		truck1.setPrice(Double.valueOf(31595));
		truck1.setIsUsed(false);
		truck1.setTowingCapacity(Double.valueOf(7700));


		// Implement relations between model objects.
		System.out.println(car1);
		System.out.println(truck1);
	}
}