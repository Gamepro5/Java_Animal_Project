package animalproject;

import java.util.Arrays;

public class Main {
	
	public static void printArray(Animal[] _array) {
		for (int i=0;i<_array.length;i++) {
			System.out.println(_array[i].toString());
		}
	}
	
	public static void main(String[] args) {
		Animal[] animals = { new Horse(2000, "Hulk"),
		new Wombat(),
		new Wombat(1600, "Bessie"),
		new Cow(1700, "Moohead"),
		new Wombat(),
		new Wildebeest(1900, "Cowculus") };
		//printArray(animals);
		for (Animal a : animals) {
		a.eat(200);
		}
		Arrays.sort(animals);
		printArray(animals);
		}
}
