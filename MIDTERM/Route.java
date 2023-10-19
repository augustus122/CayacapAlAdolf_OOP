import java.util.Scanner;
import java.text.DecimalFormat;

public class Route {
	
	double distance = 0;
	
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat();
	
	public Route() {
		System.out.print("Enter Speed (km/hr): ");
		double speed = scan.nextDouble();scan.nextLine();
		
		System.out.print("\nIs Barili blocked? (y/n) ");
		String isBlocked = scan.nextLine();
		
		if(isBlocked.toLowerCase().equals("y")) {
			
			System.out.print("\nIs Dumanjug blocked? (y/n) ");
			String isBlocked2 = scan.nextLine();
			
			if(isBlocked2.toLowerCase().equals("y")) {
				argaoRoute();
			}
			else if(isBlocked2.toLowerCase().equals("n")) {
				dumanjugRoute();
			}
			
		}
		else if(isBlocked.toLowerCase().equals("n")) {
			
			bariliRoute();
		}
		
		double time = distance/speed;
		int hour = (int)time;
		int minutes = (int)(time*100)%60;
			
	    System.out.println("\nSpeed: " + speed + " km/hr");
	    System.out.println("Total Distance: " + df.format(distance) + "km");
	    System.out.println("Estimated Time of Arrival: " + hour + " hour/s and " + minutes + " minute/s");
	}
	
	public void baseRoute() {
		System.out.println("\n(Emall/South Bus Terminal) Cebu City - Start     : 0km");
		distance += 14.2;
		System.out.println("(Route 1)                  Minglanilla           : " + distance + "km");
		distance += 12.3;
		System.out.println("(Route 2)                  San Fernando          : " + (distance - 14.2) + "km");
		distance += 11.8;
		System.out.println("(Route 3)                  Carcar                : " + df.format(distance-14.2-12.3) + "km");
	}
	
	public void bariliRoute() {
		System.out.println("\n[ BARILI ROUTE ]");
		baseRoute();
		distance += 16.5;
		System.out.println("(Route 4.1)                Barili                : " + df.format(distance-14.2-12.3-11.8) + "km");
		distance += 17.3;
		System.out.println("(Route 4.1.1)              Dumanjug              : " + df.format(distance-14.2-12.3-11.8-16.5)+ "km");
		distance += 9.4;
		System.out.println("(Route 4.1.2)              Alcantara             : " + df.format(distance-14.2-12.3-11.8-16.5-17.3)+ "km" );
        distance += 3.4;
		System.out.println("(END)                      Moalboal              : " + df.format(distance) + "km");
	}
	
	public void dumanjugRoute() {
		System.out.println("\n[ SIBONGA ROUTE THROUGH DUMANJUG ]");
		baseRoute();
		distance += 7.9;
		System.out.println("(Route 4.2)                Sibonga               : " + df.format(distance-14.2-12.3-11.8) + "km");
		distance += 30.0;
		System.out.println("(Route 4.2.1)         	   Dumanjug	         : " + df.format(distance-14.2-12.3-11.8-7.9) + "km");
		distance += 15;
		System.out.println("(Route 4.2.2)              Alcantara             : " + df.format(distance-14.2-12.3-11.8-7.9-30) + "km");
        distance += 2.7;
		System.out.println("(END)                      Moalboal              : " + df.format(distance) + "km");
	}
	
	public void argaoRoute() {
		System.out.println("\n[ SIBONGA ROUTE THROUGH ARGAO ]");
		baseRoute();
		distance += 7.9;
		System.out.println("(Route 4.2)                Sibonga               : " + df.format(distance-14.2-12.3-11.8) + "km");
		distance += 18.1;
		System.out.println("(Route 5)                  Argao                 : " + df.format(distance-14.2-12.3-11.8-7.9) + "km");
		distance += 18.5;
		System.out.println("(Route 5.1)          	   Ronda                 : " + df.format(distance-14.2-12.3-11.8-7.9-18.1) + "km");
		distance += 7.7;
		System.out.println("(Route 5.2)                Alcantara             : " + df.format(distance-14.2-12.3-11.8-7.9-18.1-18.5) + "km");
        distance += 2.7;
		System.out.println("(END)                      Moalboal              : "  + df.format(distance) + "km");
	}
}