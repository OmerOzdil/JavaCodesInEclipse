package day15_methods_Parts3;

public class task70 {

	public static void main(String[] args) {
		
		int x=calculateHighScorePosition(700);
		
		displayHighScorePosition("Omer", calculateHighScorePosition(600));
		displayHighScorePosition("Tom", x);
		displayHighScorePosition("Mike", calculateHighScorePosition(1700));
	}
	
	public static void displayHighScorePosition(String name, int position) {
		
		System.out.println(name+" managed to get into position "+ position+ " on the high score table");
		
	}
	public static int calculateHighScorePosition(int playerscore) {
	      
	if(playerscore>=1000) {
		
		return 1;
		
	}else if(playerscore>=500 && playerscore<100) {
		return 2;
		
	}else if (playerscore>=100&& playerscore<500) {
		return 3;
		
	}else {
		return 4;
		
	}
	}	

}
