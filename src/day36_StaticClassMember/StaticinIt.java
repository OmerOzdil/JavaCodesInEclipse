package day36_StaticClassMember;

public class StaticinIt {

	static final int NUMS_SECONDS_PER_HOURS;
	
	static {
		
		System.out.println("static init");
		int numberSecondPerMinutes=60;
		int numberMinutesPerHours=60;
		NUMS_SECONDS_PER_HOURS= numberMinutesPerHours*numberSecondPerMinutes;
		
	}
}
