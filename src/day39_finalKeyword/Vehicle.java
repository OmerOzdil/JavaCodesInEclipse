package day39_finalKeyword;

public class Vehicle {
	
	private String name;
	private String size;
	private int currentVelocity;
	private int cuurentDirection;
	
	
	public Vehicle(String name, String size, int currentVelocity, int cuurentDirection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.cuurentDirection = cuurentDirection;
	}
	public void steer(int direction) {
		cuurentDirection+= direction;
		System.out.println("Vehicle/steer.(): Sterring at"+ cuurentDirection+ "degrees.");	
	}
	public void move( int velocity, int direction) {
		currentVelocity=velocity;
		cuurentDirection=direction;
		System.out.println("Vehicle.move(): Moving at "+ currentVelocity+ " in direction "+ cuurentDirection);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCuurentDirection() {
		return cuurentDirection;
	}
	public void setCuurentDirection(int cuurentDirection) {
		this.cuurentDirection = cuurentDirection;
	}
	

}
