package Wiley_core_java;

abstract class Vehicles{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	//abstract Vehicles() {} //Illegal modifier for the constructor in type Vehicles; only public, protected & private are permitted
	
	public Vehicles(String color, int speed, int numWheels) {
		this.color = color;
		this.speed = speed;
		this.numWheels = numWheels;
	}
	
	public abstract void move();
	
}

class Cars extends Vehicles{

	public Cars(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void turn() {
		System.out.println("Turning left or right....");
	}
}

public class CarAbstract {

}
