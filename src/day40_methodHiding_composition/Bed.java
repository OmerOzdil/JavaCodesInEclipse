package day40_methodHiding_composition;

public class Bed {
	
	private String Style;
	private String pillow;
	private int weight;
	private int sheets;
	private int quilts;
	
	
	
	
	public Bed(String style, String pillow, int weight, int sheets, int quilts) {
		Style = style;
		this.pillow = pillow;
		this.weight = weight;
		this.sheets = sheets;
		this.quilts = quilts;
	}


	public void make() {
		
		System.out.println("Your bed is ready");
	}


	public String getStyle() {
		return Style;
	}


	public String getPillow() {
		return pillow;
	}


	public int getWeight() {
		return weight;
	}


	public int getSheets() {
		return sheets;
	}


	public int getQuilts() {
		return quilts;
	}
	
	

}
