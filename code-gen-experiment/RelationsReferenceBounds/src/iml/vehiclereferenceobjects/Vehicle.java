/*
 * ==========================================
 * ||                Vehicle               ||
 * ==========================================
 * || [0..1] + name : STRING               ||
 * || [0..1] + horsePower : INTEGER = 100  ||
 * || [0..1] + price : DOUBLE = 1000       ||
 * || [0..1] + isUsed : BOOLEAN            ||
 * || [0..1] + owner : Owner               ||
 * || [1..1] + licensePlate : LicensePlate ||
 * || [0..2] + cupHolders : Cupholder      ||
 * || [0..*] + floorMats : FloorMat        ||
 * || [1..4] + exhaustPipes : ExhaustPipe  ||
 * || [1..*] + seatBelts : SeatBelt        ||
 * || [2..4] + wheels : Wheel              ||
 * || [2..*] + speakers : Speaker          ||
 * || [2..2] + headLights : HeadLight      ||
 * ==========================================
 */

package iml.vehiclereferenceobjects;

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
	public Owner owner;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public LicensePlate licensePlate = new LicensePlate();

	/**
	 * @lowerBound 0
	 * @upperBound 2
	 */
	public ArrayList<Cupholder> cupHolders;

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<FloorMat> floorMats;

	/**
	 * @lowerBound 1
	 * @upperBound 4
	 */
	public ArrayList<ExhaustPipe> exhaustPipes = new ArrayList<ExhaustPipe> (Arrays.asList(new ExhaustPipe()));

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<SeatBelt> seatBelts = new ArrayList<SeatBelt> (Arrays.asList(new SeatBelt()));

	/**
	 * @lowerBound 2
	 * @upperBound 4
	 */
	public ArrayList<Wheel> wheels = new ArrayList<Wheel> (Arrays.asList(new Wheel(), new Wheel()));

	/**
	 * @lowerBound 2
	 * @upperBound *
	 */
	public ArrayList<Speaker> speakers = new ArrayList<Speaker> (Arrays.asList(new Speaker(), new Speaker()));

	/**
	 * @lowerBound 2
	 * @upperBound 2
	 */
	public ArrayList<HeadLight> headLights = new ArrayList<HeadLight> (Arrays.asList(new HeadLight(), new HeadLight()));

	public Vehicle(Owner owner, LicensePlate licensePlate, ArrayList<Cupholder> cupHolders, ArrayList<FloorMat> floorMats, ArrayList<ExhaustPipe> exhaustPipes, ArrayList<SeatBelt> seatBelts, ArrayList<Wheel> wheels, ArrayList<Speaker> speakers, ArrayList<HeadLight> headLights, String name, Integer horsePower, Double price, Boolean isUsed) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.price = price;
		this.isUsed = isUsed;
		this.owner = owner;
		this.licensePlate = licensePlate;
		this.cupHolders = cupHolders;
		this.floorMats = floorMats;
		this.exhaustPipes = exhaustPipes;
		this.seatBelts = seatBelts;
		this.wheels = wheels;
		this.speakers = speakers;
		this.headLights = headLights;
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

		pretty += "owner: [\n";
		final StringBuilder ownerString = new StringBuilder();
		if(this.owner != null) {
			ownerString.append(this.owner.prettyPrint(indent+2));
		}
		pretty += ownerString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "licensePlate: [\n";
		final StringBuilder licensePlateString = new StringBuilder();
		if(this.licensePlate != null) {
			licensePlateString.append(this.licensePlate.prettyPrint(indent+2));
		}
		pretty += licensePlateString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "cupHolders: [\n";
		final StringBuilder cupHoldersString = new StringBuilder();
		if(this.cupHolders != null) {
			this.cupHolders.forEach((x) -> cupHoldersString.append(x.prettyPrint(indent+2)));
		}
		pretty += cupHoldersString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "floorMats: [\n";
		final StringBuilder floorMatsString = new StringBuilder();
		if(this.floorMats != null) {
			this.floorMats.forEach((x) -> floorMatsString.append(x.prettyPrint(indent+2)));
		}
		pretty += floorMatsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "exhaustPipes: [\n";
		final StringBuilder exhaustPipesString = new StringBuilder();
		if(this.exhaustPipes != null) {
			this.exhaustPipes.forEach((x) -> exhaustPipesString.append(x.prettyPrint(indent+2)));
		}
		pretty += exhaustPipesString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "seatBelts: [\n";
		final StringBuilder seatBeltsString = new StringBuilder();
		if(this.seatBelts != null) {
			this.seatBelts.forEach((x) -> seatBeltsString.append(x.prettyPrint(indent+2)));
		}
		pretty += seatBeltsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "wheels: [\n";
		final StringBuilder wheelsString = new StringBuilder();
		if(this.wheels != null) {
			this.wheels.forEach((x) -> wheelsString.append(x.prettyPrint(indent+2)));
		}
		pretty += wheelsString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "speakers: [\n";
		final StringBuilder speakersString = new StringBuilder();
		if(this.speakers != null) {
			this.speakers.forEach((x) -> speakersString.append(x.prettyPrint(indent+2)));
		}
		pretty += speakersString.toString();

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "]\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "headLights: [\n";
		final StringBuilder headLightsString = new StringBuilder();
		if(this.headLights != null) {
			this.headLights.forEach((x) -> headLightsString.append(x.prettyPrint(indent+2)));
		}
		pretty += headLightsString.toString();

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
	 * @return current value of owner
	 */
	public Owner getOwner() {
		return this.owner;
	}

	/**
	 * @return current value of licensePlate
	 */
	public LicensePlate getLicensePlate() {
		return this.licensePlate;
	}

	/**
	 * @return current value of cupHolders
	 */
	public ArrayList<Cupholder>  getCupHolders() {
		return this.cupHolders;
	}

	/**
	 * @return current value of floorMats
	 */
	public ArrayList<FloorMat>  getFloorMats() {
		return this.floorMats;
	}

	/**
	 * @return current value of exhaustPipes
	 */
	public ArrayList<ExhaustPipe> getExhaustPipes() {
		return this.exhaustPipes;
	}

	/**
	 * @return current value of seatBelts
	 */
	public ArrayList<SeatBelt> getSeatBelts() {
		return this.seatBelts;
	}

	/**
	 * @return current value of wheels
	 */
	public ArrayList<Wheel> getWheels() {
		return this.wheels;
	}

	/**
	 * @return current value of speakers
	 */
	public ArrayList<Speaker> getSpeakers() {
		return this.speakers;
	}

	/**
	 * @return current value of headLights
	 */
	public ArrayList<HeadLight> getHeadLights() {
		return this.headLights;
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
	 * @param owner Set value of owner
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * @param licensePlate Set value of licensePlate
	 */
	public void setLicensePlate(LicensePlate licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @param cupHolders Set value of cupHolders
	 */
	public void setCupHolders(ArrayList<Cupholder>  cupHolders) {
		this.cupHolders = cupHolders;
	}

	/**
	 * @param floorMats Set value of floorMats
	 */
	public void setFloorMats(ArrayList<FloorMat>  floorMats) {
		this.floorMats = floorMats;
	}

	/**
	 * @param exhaustPipes Set value of exhaustPipes
	 */
	public void setExhaustPipes(ArrayList<ExhaustPipe> exhaustPipes) {
		this.exhaustPipes = exhaustPipes;
	}

	/**
	 * @param seatBelts Set value of seatBelts
	 */
	public void setSeatBelts(ArrayList<SeatBelt> seatBelts) {
		this.seatBelts = seatBelts;
	}

	/**
	 * @param wheels Set value of wheels
	 */
	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}

	/**
	 * @param speakers Set value of speakers
	 */
	public void setSpeakers(ArrayList<Speaker> speakers) {
		this.speakers = speakers;
	}

	/**
	 * @param headLights Set value of headLights
	 */
	public void setHeadLights(ArrayList<HeadLight> headLights) {
		this.headLights = headLights;
	}

}

