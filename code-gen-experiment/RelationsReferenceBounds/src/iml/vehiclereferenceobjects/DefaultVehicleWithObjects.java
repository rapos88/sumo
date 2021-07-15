package iml.vehiclereferenceobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class DefaultVehicleWithObjects {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();
		LicensePlate licenseplate1 = new LicensePlate();
		ExhaustPipe exhaustpipe1 = new ExhaustPipe();
		SeatBelt seatbelt1 = new SeatBelt();
		SeatBelt seatbelt2 = new SeatBelt();
		HeadLight headlight1 = new HeadLight();
		HeadLight headlight2 = new HeadLight();
		SeatBelt seatbelt3 = new SeatBelt();
		Wheel wheel1 = new Wheel();
		Wheel wheel2 = new Wheel();
		Wheel wheel3 = new Wheel();
		Wheel wheel4 = new Wheel();
		Speaker speaker1 = new Speaker();
		Speaker speaker2 = new Speaker();
		Cupholder cupholder1 = new Cupholder();
		FloorMat floormat1 = new FloorMat();
		FloorMat floormat2 = new FloorMat();


		// Set object attributes.
		vehicle1.setName("");
		vehicle1.setHorsePower(100);
		vehicle1.setPrice(Double.valueOf(1000));
		vehicle1.setIsUsed(false);
		vehicle1.setExhaustPipes(new ArrayList<ExhaustPipe>());
		vehicle1.setSeatBelts(new ArrayList<SeatBelt>());
		vehicle1.setHeadLights(new ArrayList<HeadLight>());
		vehicle1.setWheels(new ArrayList<Wheel>());
		vehicle1.setSpeakers(new ArrayList<Speaker>());
		vehicle1.setCupHolders(new ArrayList<Cupholder>());
		vehicle1.setFloorMats(new ArrayList<FloorMat>());


















		// Implement relations between model objects.
		vehicle1.setLicensePlate(licenseplate1);
		vehicle1.getExhaustPipes().add(exhaustpipe1);
		vehicle1.getSeatBelts().add(seatbelt1);
		vehicle1.getSeatBelts().add(seatbelt2);
		vehicle1.getHeadLights().add(headlight1);
		vehicle1.getHeadLights().add(headlight2);
		vehicle1.getSeatBelts().add(seatbelt3);
		vehicle1.getWheels().add(wheel3);
		vehicle1.getWheels().add(wheel1);
		vehicle1.getWheels().add(wheel2);
		vehicle1.getWheels().add(wheel4);
		vehicle1.getSpeakers().add(speaker2);
		vehicle1.getSpeakers().add(speaker1);
		vehicle1.getCupHolders().add(cupholder1);
		vehicle1.getFloorMats().add(floormat1);
		vehicle1.getFloorMats().add(floormat2);
		System.out.println(vehicle1);
		System.out.println(licenseplate1);
		System.out.println(exhaustpipe1);
		System.out.println(seatbelt1);
		System.out.println(seatbelt2);
		System.out.println(headlight1);
		System.out.println(headlight2);
		System.out.println(seatbelt3);
		System.out.println(wheel1);
		System.out.println(wheel2);
		System.out.println(wheel3);
		System.out.println(wheel4);
		System.out.println(speaker1);
		System.out.println(speaker2);
		System.out.println(cupholder1);
		System.out.println(floormat1);
		System.out.println(floormat2);
	}
}