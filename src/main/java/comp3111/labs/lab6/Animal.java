package comp3111.labs.lab6;

import java.util.Vector;

public class Animal {
	private double weight;
	private boolean alive;
	public Animal() {
		weight = 5;
		alive = true;
		//mlkmlkm
		//nkjnjknjnknkn
	}
	
	//gtrtr
	public double getWeight() { return weight;}
	public boolean isAlive() { return alive; }
	public void eat() { 
		if (!alive) return; 
		weight *= 1.05; 
		if (weight > 100) {
			System.out.println("it dies becoz of overweight.");
			alive = false;
		}
	}
	public void poo() {
		if (!alive) return;
		weight -= 1; 
		if (weight < 0) {
			System.out.println("it dies becoz of underweight.");
			alive = false;
		}
	}

}
