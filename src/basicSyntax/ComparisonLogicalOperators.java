package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		   int a = 10;
		   int b = 5;
		   
		   boolean isGreater = (a > b);
		   
		   System.out.println(isGreater);
		   
		   boolean isSunny = true;
		   boolean isWarm = true;
		   
		   boolean isWeather = isSunny && isWarm;
		   
		   System.out.println(isWeather); 
		   
		   int x = 10;
		   int y = 8;
		   
		   boolean andResult = (x >= 0 && y % 2 == 0);
		   System.out.println(andResult); 
		   
		   int c = 5;
		   int d = 10;
		 
		   boolean hasPermission = !(c == d);
		   
		   System.out.println(hasPermission);
		   }
}