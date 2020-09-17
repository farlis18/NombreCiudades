import java.util.Arrays;
import java.util.Scanner;


public class Fase2 {

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
		
		cities.close();
		
		String arrayCities [] = new String [6];
		
		arrayCities[0]= city1;
		arrayCities[1]= city2;
		arrayCities[2]= city3;
		arrayCities[3]= city4;
		arrayCities[4]= city5;
		arrayCities[5]= city6;
		
	
		Arrays.sort(arrayCities);
		
		System.out.println ("Ciudades ordenadas por ordem alfabetica: ");
		for( String elem: arrayCities) {
			System.out.print(elem + " ");
		}
		
	}

}
