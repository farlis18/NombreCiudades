import java.util.Scanner;

public class Fase4{

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
		
		char arrayCity1 [] = new char [city1.length()];
		char arrayCity2 [] = new char [city2.length()];
		char arrayCity3 [] = new char [city3.length()];
		char arrayCity4 [] = new char [city4.length()];
		char arrayCity5 [] = new char [city5.length()];
		char arrayCity6 [] = new char [city6.length()];
		
		fillArrayCity(arrayCity1, city1);	
		fillArrayCity(arrayCity2, city2);
		fillArrayCity(arrayCity3, city3);
		fillArrayCity(arrayCity4, city4);
		fillArrayCity(arrayCity5, city5);
		fillArrayCity(arrayCity6, city6);
				
		printInvertedArray(arrayCity1);
		printInvertedArray(arrayCity2);
		printInvertedArray(arrayCity3);
		printInvertedArray(arrayCity4);
		printInvertedArray(arrayCity5);
		printInvertedArray(arrayCity6);
		
	}
	
	public static void fillArrayCity(char auxArray [], String auxCity) {
		for(int i=0;i<auxCity.length();i++) {
			auxArray[i]=auxCity.charAt(i);
		}
	}
	
	public static void printInvertedArray(char city []) {
		char aux [] = new char [city.length];
		for (int i=0; i<city.length;i++) {
			aux[i]=city[city.length-1-i];			
		}
		System.out.println(aux);
	}
	
}
	
	
