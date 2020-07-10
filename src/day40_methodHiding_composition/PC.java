package day40_methodHiding_composition;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboard;
	
	
	public Case getTheCase() {
		return theCase;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public MotherBoard getMotherBoard() {
		return motherboard;
	}


	public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	
	

}
