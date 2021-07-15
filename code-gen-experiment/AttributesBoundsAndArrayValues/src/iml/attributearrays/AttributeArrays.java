/*
 * ============================================
 * ||             AttributeArrays            ||
 * ============================================
 * || [0..1] + SingleOptional : INTEGER      ||
 * || [0..2] + MultipleOptional : INTEGER    ||
 * || [0..*] + UnboundedOptional : INTEGER   ||
 * || [1..1] + SingleRequired : INTEGER      ||
 * || [1..2] + AtLeastOneBounded : INTEGER   ||
 * || [1..*] + AtLeastOneUnbounded : INTEGER ||
 * || [2..2] + Exactly2 : INTEGER            ||
 * || [2..3] + AtLeast2Bounded : INTEGER     ||
 * || [2..*] + AtLeast2Unbounded : INTEGER   ||
 * ============================================
 */

package iml.attributearrays;

import java.util.Arrays;
import java.util.ArrayList;

public class AttributeArrays {

	/**
	 * @lowerBound 0
	 * @upperBound 1
	 */
	public Integer SingleOptional;

	/**
	 * @lowerBound 0
	 * @upperBound 2
	 */
	public ArrayList<Integer> MultipleOptional;

	/**
	 * @lowerBound 0
	 * @upperBound *
	 */
	public ArrayList<Integer> UnboundedOptional;

	/**
	 * @lowerBound 1
	 * @upperBound 1
	 */
	public Integer SingleRequired = 0;

	/**
	 * @lowerBound 1
	 * @upperBound 2
	 */
	public ArrayList<Integer> AtLeastOneBounded = new ArrayList<Integer>(Arrays.asList(0));

	/**
	 * @lowerBound 1
	 * @upperBound *
	 */
	public ArrayList<Integer> AtLeastOneUnbounded = new ArrayList<Integer>(Arrays.asList(0));

	/**
	 * @lowerBound 2
	 * @upperBound 2
	 */
	public ArrayList<Integer> Exactly2 = new ArrayList<Integer>(Arrays.asList(0,0));

	/**
	 * @lowerBound 2
	 * @upperBound 3
	 */
	public ArrayList<Integer> AtLeast2Bounded = new ArrayList<Integer>(Arrays.asList(0,0));

	/**
	 * @lowerBound 2
	 * @upperBound *
	 */
	public ArrayList<Integer> AtLeast2Unbounded = new ArrayList<Integer>(Arrays.asList(0,0));

	public AttributeArrays(Integer SingleOptional, ArrayList<Integer> MultipleOptional, ArrayList<Integer> UnboundedOptional, Integer SingleRequired, ArrayList<Integer> AtLeastOneBounded, ArrayList<Integer> AtLeastOneUnbounded, ArrayList<Integer> Exactly2, ArrayList<Integer> AtLeast2Bounded, ArrayList<Integer> AtLeast2Unbounded) {
		super();
		this.SingleOptional = SingleOptional;
		this.MultipleOptional = MultipleOptional;
		this.UnboundedOptional = UnboundedOptional;
		this.SingleRequired = SingleRequired;
		this.AtLeastOneBounded = AtLeastOneBounded;
		this.AtLeastOneUnbounded = AtLeastOneUnbounded;
		this.Exactly2 = Exactly2;
		this.AtLeast2Bounded = AtLeast2Bounded;
		this.AtLeast2Unbounded = AtLeast2Unbounded;
	}

	// Empty constructor to allow an object to be instantiated with default values.
	public AttributeArrays() { }


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

		pretty += "AttributeArrays: { \n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "SingleOptional: " + this.SingleOptional + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "MultipleOptional: " + this.MultipleOptional + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "UnboundedOptional: " + this.UnboundedOptional + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "SingleRequired: " + this.SingleRequired + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "AtLeastOneBounded: " + this.AtLeastOneBounded + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "AtLeastOneUnbounded: " + this.AtLeastOneUnbounded + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "Exactly2: " + this.Exactly2 + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "AtLeast2Bounded: " + this.AtLeast2Bounded + "\n";

		for(int i = 0; i < indent+1; i++)
			pretty += "\t";

		pretty += "AtLeast2Unbounded: " + this.AtLeast2Unbounded + "\n";

		for(int i = 0; i < indent; i++)
			pretty += "\t";

		pretty += "}\n";
		return pretty;
	}


	// ======================================= Getters

	/**
	 * @return current value of SingleOptional
	 */
	public Integer getSingleOptional() {
		return this.SingleOptional;
	}

	/**
	 * @return current value of MultipleOptional
	 */
	public ArrayList<Integer> getMultipleOptional() {
		return this.MultipleOptional;
	}

	/**
	 * @return current value of UnboundedOptional
	 */
	public ArrayList<Integer> getUnboundedOptional() {
		return this.UnboundedOptional;
	}

	/**
	 * @return current value of SingleRequired
	 */
	public Integer getSingleRequired() {
		return this.SingleRequired;
	}

	/**
	 * @return current value of AtLeastOneBounded
	 */
	public ArrayList<Integer> getAtLeastOneBounded() {
		return this.AtLeastOneBounded;
	}

	/**
	 * @return current value of AtLeastOneUnbounded
	 */
	public ArrayList<Integer> getAtLeastOneUnbounded() {
		return this.AtLeastOneUnbounded;
	}

	/**
	 * @return current value of Exactly2
	 */
	public ArrayList<Integer> getExactly2() {
		return this.Exactly2;
	}

	/**
	 * @return current value of AtLeast2Bounded
	 */
	public ArrayList<Integer> getAtLeast2Bounded() {
		return this.AtLeast2Bounded;
	}

	/**
	 * @return current value of AtLeast2Unbounded
	 */
	public ArrayList<Integer> getAtLeast2Unbounded() {
		return this.AtLeast2Unbounded;
	}


	// ======================================= Setters

	/**
	 * @param SingleOptional Set value of SingleOptional
	 */
	public void setSingleOptional(Integer SingleOptional) {
		this.SingleOptional = SingleOptional;
	}

	/**
	 * @param MultipleOptional Set value of MultipleOptional
	 */
	public void setMultipleOptional(ArrayList<Integer> MultipleOptional) {
		this.MultipleOptional = MultipleOptional;
	}

	/**
	 * @param UnboundedOptional Set value of UnboundedOptional
	 */
	public void setUnboundedOptional(ArrayList<Integer> UnboundedOptional) {
		this.UnboundedOptional = UnboundedOptional;
	}

	/**
	 * @param SingleRequired Set value of SingleRequired
	 */
	public void setSingleRequired(Integer SingleRequired) {
		this.SingleRequired = SingleRequired;
	}

	/**
	 * @param AtLeastOneBounded Set value of AtLeastOneBounded
	 */
	public void setAtLeastOneBounded(ArrayList<Integer> AtLeastOneBounded) {
		this.AtLeastOneBounded = AtLeastOneBounded;
	}

	/**
	 * @param AtLeastOneUnbounded Set value of AtLeastOneUnbounded
	 */
	public void setAtLeastOneUnbounded(ArrayList<Integer> AtLeastOneUnbounded) {
		this.AtLeastOneUnbounded = AtLeastOneUnbounded;
	}

	/**
	 * @param Exactly2 Set value of Exactly2
	 */
	public void setExactly2(ArrayList<Integer> Exactly2) {
		this.Exactly2 = Exactly2;
	}

	/**
	 * @param AtLeast2Bounded Set value of AtLeast2Bounded
	 */
	public void setAtLeast2Bounded(ArrayList<Integer> AtLeast2Bounded) {
		this.AtLeast2Bounded = AtLeast2Bounded;
	}

	/**
	 * @param AtLeast2Unbounded Set value of AtLeast2Unbounded
	 */
	public void setAtLeast2Unbounded(ArrayList<Integer> AtLeast2Unbounded) {
		this.AtLeast2Unbounded = AtLeast2Unbounded;
	}

}

