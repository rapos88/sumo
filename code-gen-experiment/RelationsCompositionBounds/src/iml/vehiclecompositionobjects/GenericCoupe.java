package iml.vehiclecompositionobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class GenericCoupe {
	public static void main(String args[]) {

		// Instantiate model objects.
		Vehicle vehicle1 = new Vehicle();
		TouchScreen touchscreen1 = new TouchScreen();
		Engine engine1 = new Engine();
		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		UsbPort usbport1 = new UsbPort();
		Seat seat1 = new Seat();
		Seat seat2 = new Seat();
		Axel axel1 = new Axel();
		Axel axel2 = new Axel();
		BrakePad brakepad1 = new BrakePad();
		BrakePad brakepad2 = new BrakePad();
		BrakePad brakepad3 = new BrakePad();
		BrakePad brakepad4 = new BrakePad();
		Window window1 = new Window();
		Window window2 = new Window();
		Window window3 = new Window();
		Window window4 = new Window();
		Pedal pedal1 = new Pedal();
		Pedal pedal2 = new Pedal();


		// Set object attributes.
		vehicle1.setName("Coupe");
		vehicle1.setHorsePower(450);
		vehicle1.setPrice(Double.valueOf(60000));
		vehicle1.setIsUsed(false);
		vehicle1.setSeats(new ArrayList<Seat>());
		vehicle1.setAxels(new ArrayList<Axel>());
		vehicle1.setPedals(new ArrayList<Pedal>());
		vehicle1.setBrakePads(new ArrayList<BrakePad>());
		vehicle1.setWindows(new ArrayList<Window>());
		vehicle1.setSensors(new ArrayList<Sensor>());
		vehicle1.setUsbPorts(new ArrayList<UsbPort>());





















		// Implement relations between model objects.
		vehicle1.setEngine(engine1);
		vehicle1.getSeats().add(seat2);
		vehicle1.getSeats().add(seat1);
		vehicle1.getAxels().add(axel1);
		vehicle1.getAxels().add(axel2);
		vehicle1.getPedals().add(pedal2);
		vehicle1.getPedals().add(pedal1);
		vehicle1.getBrakePads().add(brakepad1);
		vehicle1.getBrakePads().add(brakepad2);
		vehicle1.getBrakePads().add(brakepad3);
		vehicle1.getBrakePads().add(brakepad4);
		vehicle1.getWindows().add(window1);
		vehicle1.getWindows().add(window2);
		vehicle1.getWindows().add(window3);
		vehicle1.getWindows().add(window4);
		vehicle1.setTouchScreen(touchscreen1);
		vehicle1.getSensors().add(sensor2);
		vehicle1.getSensors().add(sensor1);
		vehicle1.getUsbPorts().add(usbport1);
		System.out.println(vehicle1);
		System.out.println(touchscreen1);
		System.out.println(engine1);
		System.out.println(sensor1);
		System.out.println(sensor2);
		System.out.println(usbport1);
		System.out.println(seat1);
		System.out.println(seat2);
		System.out.println(axel1);
		System.out.println(axel2);
		System.out.println(brakepad1);
		System.out.println(brakepad2);
		System.out.println(brakepad3);
		System.out.println(brakepad4);
		System.out.println(window1);
		System.out.println(window2);
		System.out.println(window3);
		System.out.println(window4);
		System.out.println(pedal1);
		System.out.println(pedal2);
	}
}