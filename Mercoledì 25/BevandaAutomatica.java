
import java.util.Scanner;

public class BevandaAutomatica {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci età: ");
		int eta = input.nextInt();
		
		System.out.println("Inserisci budget: ");
		int budget = input.nextInt();
		
		if(budget < 3 && eta >= 18) {
			System.out.println("Goditi la tua bevanda gratuita");
		}else {
			System.out.println("Niente bevanda gratuita per te");
		}

	}

}