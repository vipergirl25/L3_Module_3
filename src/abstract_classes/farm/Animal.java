package abstract_classes.farm;

public abstract class Animal {
	abstract void makeNoise();
	void eat() {
		
	}
	
}
class Pig extends Animal{
	public void makeNoise() {
		System.out.println("oink");
	}
}
class Cow extends Animal{
	public void makeNoise() {
		System.out.println("moo");
	}
}
class Cat extends Animal {
public void makeNoise() {
		System.out.println("meow");
	}
}
class Dog extends Animal{
public void makeNoise() {
		System.out.println("woof");
	}
}