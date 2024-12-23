package coreJavaBrushUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList nameOfArray=new ArrayList();
		nameOfArray.add(1);
		nameOfArray.add("Abc");
		nameOfArray.add('a');
		nameOfArray.add(1.00);
		
		for(int i=0; i<nameOfArray.size(); i++) {
			System.out.println(nameOfArray.get(i));
		}
		
		//The warning is because we have not specified any dataType
		
		ArrayList<Object> objArray=new ArrayList<Object>();
		objArray.add(1);
		objArray.add("Abc");
		objArray.add('a');
		objArray.add(1.00);
				
		for(int i=0; i<objArray.size(); i++) {
			System.out.println(objArray.get(i));
		}
		
		//To restrict dataType the dataType need to be specified while declaring the ArrayList
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.equals(objArray)); //Returns if the declared List's contentss is same or not as the arrayList

		System.out.println("-------------------------------");
		System.out.println(objArray.add(false)); //returns true as the item is added to the ArrayList
		
		System.out.println("-------------------------------");
		
				objArray.addAll(nameOfArray); // Adds another collection to the ArrayList
		for(int i=0; i<objArray.size(); i++) {
			System.out.println(objArray.get(i));
		}
		
		System.out.println("-------------------------------");
		
		
		objArray.addAll(1, nameOfArray); // Adds another collection to the ArrayList at specified location
		for(int i=0; i<objArray.size(); i++) {
			System.out.println(objArray.get(i));
		}
		
		System.out.println("-------------------------------");
		
		objArray.clear(); //Removes all elements from the list
		for(int i=0; i<objArray.size(); i++) {
			System.out.println(objArray.get(i));
		}
		System.out.println("-------------------------------");
		
		System.out.println(nameOfArray.clone()); //Returns a copy of the arrayList
		
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.contains("A")); //Returns if the declared object is present or not in the array


		System.out.println("--------------------- ----------");
		System.out.println(nameOfArray.containsAll(objArray)); //Returns if the declared object List is present or not in the array

		System.out.println("-------------------------------");
		System.out.println(nameOfArray.get(0)); //Returns content of the specified index
		
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.hashCode()); //Returns hashcode of the arrayList
		
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.indexOf(1)); //Returns index of the declared object inside the arrayList
		
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.isEmpty()); //Returns if empty or not
		
		System.out.println("-------------------------------");
		System.out.println(nameOfArray.lastIndexOf(1)); //Returns the last index when the specified object occurred in the list
		
		System.out.println("-------------------------------");
		nameOfArray.remove(1); //Removes object of the specified index
		for(int i=0; i<nameOfArray.size(); i++) {
			System.out.println(nameOfArray.get(i));
		}
		System.out.println("-------------------------------");
		nameOfArray.remove(1.0); //Removes specified object
		for(int i=0; i<nameOfArray.size(); i++) {
			System.out.println(nameOfArray.get(i));
		}
		
		System.out.println("-------------------------------");
		nameOfArray.set(0, 'X'); //Replace object of the specified index with mentioned object
		for(int i=0; i<nameOfArray.size(); i++) {
			System.out.println(nameOfArray.get(i));
		}
		
		System.out.println("-------------------------------");
		int[] ArrayA = {1,2,3,4,4,4,4,3,9};
		List<int[]> convertedArray = Arrays.asList(ArrayA); //Array to List
		for(int i:ArrayA) {
			System.out.println(i);
		}
		System.out.println(convertedArray.lastIndexOf(3)); //for int dataType it doen't work
		
	}

}
