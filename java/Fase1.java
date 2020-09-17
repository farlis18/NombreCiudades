import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
	
		String city1, city2, city3, city4, city5, city6;
		Scanner cities = new Scanner(System.in);
		
		System.out.println("Introduce los nombres de las ciudades: ");
		city1 = cities.nextLine();
		city2 = cities.nextLine();
		city3 = cities.nextLine();
		city4 = cities.nextLine();
		city5 = cities.nextLine();
		city6 = cities.nextLine();
		
		System.out.println ("Ciudades introducidas: " + city1+ ", " + city2+ ", " +city3+ ", " +city4+ ", " +city5+ ", " +city6);
		
		cities.close();
	}

}
