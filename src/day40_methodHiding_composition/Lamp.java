package day40_methodHiding_composition;

public class Lamp {
	
	private String style;
	private int battery;
	private int globalRating;
	
	public Lamp(String style, int battery) {
		
		this.style = style;
		this.battery = battery;
	}
	
	public void turnOn() {
		System.out.println("Turn of the lamb");
		
		
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getGlobalRating() {
		return globalRating;
	}

	public void setGlobalRating(int globalRating) {
		this.globalRating = globalRating;
	}
	
	

}
