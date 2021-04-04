package animalproject;



public class Animal implements Comparable {
	
	int weight;
	String name;
	
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public void eat(int ammount) {
		weight = weight + ammount;
	}
	public Animal(int _weight, String _name) {
		weight = _weight;
		name = _name;
	}
	
	public String toString() {
		return name + " " + weight;
	}
	
	public int compareTo(Object object) {
		Animal animal = (Animal) object;
		return this.weight - animal.getWeight();
	}
}
