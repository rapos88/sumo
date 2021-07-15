/*
 * =========================================
 * ||               Vehicle               ||
 * =========================================
 * || [0..1] + name : STRING              ||
 * || [0..1] + horsePower : INTEGER = 100 ||
 * || [0..1] + price : DOUBLE = 1000      ||
 * || [0..1] + isUsed : BOOLEAN           ||
 * || [0..1] + touchScreen : TouchScreen  ||
 * || [0..5] + sensors : Sensor           ||
 * || [0..*] + usbPorts : UsbPort         ||
 * || [1..1] + engine : Engine            ||
 * || [1..4] + seats : Seat               ||
 * || [1..*] + axels : Axel               ||
 * || [2..2] + pedals : Pedal             ||
 * || [2..4] + brakePads : BrakePad       ||
 * || [2..*] + windows : Window           ||
 * =========================================
 */

package iml.vehiclecompositionobjects;

import java.util.Arrays;
import java.util.ArrayList;

public class Vehicle {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public String name;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Integer horsePower = 100;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Double price = 1000.0;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Boolean isUsed;

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public TouchScreen touchScreen;

	/**
	 * @lowerBound 0
	 * @upperBound 5
	 */
	public ArrayList<Sensor> sensors;

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<UsbPort> usbPorts;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Engine engine = new Engine();

	/**
	 * @lowerBound 1
	 * @upperBound 4
	 */
	public ArrayList<Seat> seats = new ArrayList<Seat> (Arrays.asList(new Seat()));

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Axel> axels = new ArrayList<Axel> (Arrays.asList(new Axel()));

	/**
	 * @lowerBound 2
	 * @upperBound 2
	 */
	public ArrayList<Pedal> pedals = new ArrayList<Pedal> (Arrays.asList(new Pedal(), new Pedal()));

	/**
	 * @lowerBound 2
	 * @upperBound 4
	 */
	public ArrayList<BrakePad> brakePads = new ArrayList<BrakePad> (Arrays.asList(new BrakePad(), new BrakePad()));

	/**
	 * @lowerBound 2
	 * @upperBound *
	 */
	public ArrayList<Window> windows = new ArrayList<Window> (Arrays.asList(new Window(), new Window()));

	public Vehicle(TouchScreen touchScreen, ArrayList<Sensor> sensors, ArrayList<UsbPort> usbPorts, Engine engine, ArrayList<Seat> seats, ArrayList<Axel> axels, ArrayList<Pedal> pedals, ArrayList<BrakePad> brakePads, ArrayList<Window> windows, String name, Integer horsePower, Double price, Boolean isUsed) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.price = price;
		this.isUsed = isUsed;
		this.touchScreen = touchScreen;
		this.sensors = sensors;
		this.usbPorts = usbPorts;
		this.engine = engine;
		this.seats = seats;
		this.axels = axels;
		this.pedals = pedals;
		this.brakePads = brakePads;
		this.windows = windows;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public Vehicle() { }


	public String toString() {
		return this.prettyPrint(0);
	}

	protected String prettyPrint(int indent) {
		String pretty = "";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		if(indent > 10) {
			return pretty + "...\n";
		}

		pretty += "Vehicle: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "name: \"" + this.name + "\"\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "horsePower: " + this.horsePower + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "price: " + this.price + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "isUsed: " + this.isUsed + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "touchScreen: [\n";
		final StringBuilder touchScreenString = new StringBuilder();
		if(this.touchScreen != null) {
			touchScreenString.append(this.touchScreen.prettyPrint(indent+2));
		}
		pretty += touchScreenString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "sensors: [\n";
		final StringBuilder sensorsString = new StringBuilder();
		if(this.sensors != null) {
			this.sensors.forEach((x) -> sensorsString.append(x.prettyPrint(indent+2)));
		}
		pretty += sensorsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "usbPorts: [\n";
		final StringBuilder usbPortsString = new StringBuilder();
		if(this.usbPorts != null) {
			this.usbPorts.forEach((x) -> usbPortsString.append(x.prettyPrint(indent+2)));
		}
		pretty += usbPortsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "engine: [\n";
		final StringBuilder engineString = new StringBuilder();
		if(this.engine != null) {
			engineString.append(this.engine.prettyPrint(indent+2));
		}
		pretty += engineString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "seats: [\n";
		final StringBuilder seatsString = new StringBuilder();
		if(this.seats != null) {
			this.seats.forEach((x) -> seatsString.append(x.prettyPrint(indent+2)));
		}
		pretty += seatsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "axels: [\n";
		final StringBuilder axelsString = new StringBuilder();
		if(this.axels != null) {
			this.axels.forEach((x) -> axelsString.append(x.prettyPrint(indent+2)));
		}
		pretty += axelsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "pedals: [\n";
		final StringBuilder pedalsString = new StringBuilder();
		if(this.pedals != null) {
			this.pedals.forEach((x) -> pedalsString.append(x.prettyPrint(indent+2)));
		}
		pretty += pedalsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "brakePads: [\n";
		final StringBuilder brakePadsString = new StringBuilder();
		if(this.brakePads != null) {
			this.brakePads.forEach((x) -> brakePadsString.append(x.prettyPrint(indent+2)));
		}
		pretty += brakePadsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "windows: [\n";
		final StringBuilder windowsString = new StringBuilder();
		if(this.windows != null) {
			this.windows.forEach((x) -> windowsString.append(x.prettyPrint(indent+2)));
		}
		pretty += windowsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters

	/**
	 * @return current value of name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return current value of horsePower
	 */
	public Integer getHorsePower() {
		return this.horsePower;
	}

	/**
	 * @return current value of price
	 */
	public Double getPrice() {
		return this.price;
	}

	/**
	 * @return current value of isUsed
	 */
	public Boolean getIsUsed() {
		return this.isUsed;
	}

	/**
	 * @return current value of touchScreen
	 */
	public TouchScreen getTouchScreen() {
		return this.touchScreen;
	}

	/**
	 * @return current value of sensors
	 */
	public ArrayList<Sensor>  getSensors() {
		return this.sensors;
	}

	/**
	 * @return current value of usbPorts
	 */
	public ArrayList<UsbPort>  getUsbPorts() {
		return this.usbPorts;
	}

	/**
	 * @return current value of engine
	 */
	public Engine getEngine() {
		return this.engine;
	}

	/**
	 * @return current value of seats
	 */
	public ArrayList<Seat> getSeats() {
		return this.seats;
	}

	/**
	 * @return current value of axels
	 */
	public ArrayList<Axel> getAxels() {
		return this.axels;
	}

	/**
	 * @return current value of pedals
	 */
	public ArrayList<Pedal> getPedals() {
		return this.pedals;
	}

	/**
	 * @return current value of brakePads
	 */
	public ArrayList<BrakePad> getBrakePads() {
		return this.brakePads;
	}

	/**
	 * @return current value of windows
	 */
	public ArrayList<Window> getWindows() {
		return this.windows;
	}


	// ======================================= Setters

	/**
	 * @param name Set value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param horsePower Set value of horsePower
	 */
	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}

	/**
	 * @param price Set value of price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @param isUsed Set value of isUsed
	 */
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}

	/**
	 * @param touchScreen Set value of touchScreen
	 */
	public void setTouchScreen(TouchScreen touchScreen) {
		this.touchScreen = touchScreen;
	}

	/**
	 * @param sensors Set value of sensors
	 */
	public void setSensors(ArrayList<Sensor>  sensors) {
		this.sensors = sensors;
	}

	/**
	 * @param usbPorts Set value of usbPorts
	 */
	public void setUsbPorts(ArrayList<UsbPort>  usbPorts) {
		this.usbPorts = usbPorts;
	}

	/**
	 * @param engine Set value of engine
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @param seats Set value of seats
	 */
	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	/**
	 * @param axels Set value of axels
	 */
	public void setAxels(ArrayList<Axel> axels) {
		this.axels = axels;
	}

	/**
	 * @param pedals Set value of pedals
	 */
	public void setPedals(ArrayList<Pedal> pedals) {
		this.pedals = pedals;
	}

	/**
	 * @param brakePads Set value of brakePads
	 */
	public void setBrakePads(ArrayList<BrakePad> brakePads) {
		this.brakePads = brakePads;
	}

	/**
	 * @param windows Set value of windows
	 */
	public void setWindows(ArrayList<Window> windows) {
		this.windows = windows;
	}


	/**
	 * Destructor for Vehicle when composition relations are present.
	 * 
	 * Composition relations are unique from reference relations because the object(s) in a composition
	 * relation cannot exist without the object that owns the relation. Therefore, when the object with
	 * a composition relation is destroyed, the object created by the composition relation must be destroyed as well.
	 */
	protected void finalize() throws Throwable {
		this.touchScreen = null;
		this.sensors = null;
		this.usbPorts = null;
		this.engine = null;
		this.seats = null;
		this.axels = null;
		this.pedals = null;
		this.brakePads = null;
		this.windows = null;
	}

}

