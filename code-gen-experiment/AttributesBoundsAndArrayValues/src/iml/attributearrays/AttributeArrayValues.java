package iml.attributearrays;

import java.util.Arrays;
import java.util.ArrayList;

public class AttributeArrayValues {
	public static void main(String args[]) {

		// Instantiate model objects.
		AttributeArrays attributearrays1 = new AttributeArrays();


		// Set object attributes.
		attributearrays1.setSingleOptional(0);
		attributearrays1.setMultipleOptional(new ArrayList<Integer>(Arrays.asList(1,2)));
		attributearrays1.setUnboundedOptional(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		attributearrays1.setSingleRequired(1);
		attributearrays1.setAtLeastOneBounded(new ArrayList<Integer>(Arrays.asList(1)));
		attributearrays1.setAtLeastOneUnbounded(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		attributearrays1.setExactly2(new ArrayList<Integer>(Arrays.asList(1,2)));
		attributearrays1.setAtLeast2Bounded(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		attributearrays1.setAtLeast2Unbounded(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));


		// Implement relations between model objects.
		System.out.println(attributearrays1);
	}
}