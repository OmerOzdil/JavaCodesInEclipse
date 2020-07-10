package day6_logicalOperators;

public class outsideWeather {

	public static void main(String[] args) {
		String OutsideWeather;
		int Degree;
		OutsideWeather= "Shinny";
		Degree=70;
		boolean con2= (!(OutsideWeather=="Rainy" || Degree==70));
		boolean con3= (!(OutsideWeather=="Rainy" && Degree==70));
		 System.out.println(con2);
		 System.out.println(con3);
		 
		 int b=2;
		 boolean res= ++b ==2 || --b==2 && --b== 2;
		 System.out.println(res);
		 
		 boolean x=true, z=true;
		 int y=20;
		 x= (y!=10)||(z=false);
		 System.out.println(x);
		 
		 System.out.println("****************");
		 
		 double variable=20;
		 double variable2=80;
		 double var3;
		 var3 = (variable+variable2)*25;
		 
		 double res1= var3%40;
		 System.out.println(res1);
		 System.out.println("remaining  is equal to 20 or less - " + (res1<=20) );
		 
		 
		 
		 
		 
		
	}

}
