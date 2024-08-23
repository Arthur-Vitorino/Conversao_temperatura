package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Celsius: ");
		float C = scanner.nextFloat();
		float F = ((9f * C) + 160f) / 5f;
		System.out.println("A temperatura em Farenheit e: "+F+" Graus");
		
		scanner.close();
	}

}
