package main;
import java.util.*;
public class Converter {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		boolean quit = false;
		while(quit != true) {
			System.out.println("Hello please type in a number and hit enter to select!");
			
			System.out.println("(1) Volume Conversions");
			System.out.println("(2) Distance Conversions");
			
			System.out.println("(4) Quit\n");
			//System.out.println("");
			Scanner scan = new Scanner(System.in);
			int selection1 = scan.nextInt();
			switch(selection1) {
				case 1:
					//1 is teaspoons to tablespoons
					System.out.println("(1) To convert Teaspoons to Tablespoons");
					//2 is cups to teaspoons
					System.out.println("(2) To convert Cups to Teaspoons");
					System.out.println("(4) Quit\n");
					selection1 = scan.nextInt();
					switch(selection1) {
						case 1:
							//teaspoon to tablespoons
							teaspoonToTablespoon();
							break;
						case 2:
							//something 2
							cupToTeaspoon();
							break;
						case 4:
							System.out.println("Quitting!");
							System.exit(0);
					}
					break;
				case 2:
					//1 is feet to meters
					System.out.println("(1) To convert Feet to Meters");
					//2 is US gallons to imperial Gallons
					System.out.println("(2) To convert US Gallons to Imperial Gallons");
					//3 is miles to kilometers
					System.out.println("(3) To convert Miles to Kilometers");
					//4 is quit
					System.out.println("(4) Quit\n");
					selection1 = scan.nextInt();
					switch(selection1) {
					case 1:
						//feet to meters
						feetToMeters();
						break;
					case 2:
						//us gallons to imperial gallons
						usgToIg();
						break;
					case 3:
						//something 3
						milesToKilometers();
						break;
					case 4:
						System.out.println("Quitting!");
						System.exit(0);
					}
					break;
				case 4:
					System.out.println("Quitting!");
					System.exit(0);
			}
		}
	}
	public static void cupToTeaspoon() {
		Scanner cttScan = new Scanner(System.in);
		System.out.println("How many Cups?");
		int cups = cttScan.nextInt();
		int temp = cups * 48;
		System.out.println(cups + " cups is equal to: " + temp + " teaspoons");
		//cttScan.close();
		//return temp;
	}
	public static void milesToKilometers() {
		Scanner mtkScan = new Scanner(System.in);
		System.out.println("How many Miles?");
		double miles = mtkScan.nextDouble();
		double temp = 1.609344 * miles;
		System.out.println(miles + " Miles is equal to: " + temp + " Kilometers");
		//mtkScan.close();
	}
	public static void usgToIg() {
		Scanner gScan = new Scanner(System.in);
		System.out.println("How many US Gallons?");
		double usGal = gScan.nextDouble();
		double temp = usGal/1.2009499204287;
		System.out.println(usGal + " US gallon is equal to: " + temp + " Imperial gallon");
		//gScan.close();
	}
	public static void feetToMeters() {
		Scanner fScan = new Scanner(System.in);
		System.out.println("How many feet?");
		double feet = fScan.nextDouble();
		double temp = feet/3;
		System.out.println(feet + " Feet is equal to: " + temp + " meters");
	}
	public static void teaspoonToTablespoon() {
		Scanner tScan = new Scanner(System.in);
		System.out.println("How many teaspoons?");
		int teaspoon = tScan.nextInt();
		int temp = teaspoon/3;
		System.out.println(teaspoon + " teaspoons is equal to: " + temp + " Tablespoons.");
	}
}
