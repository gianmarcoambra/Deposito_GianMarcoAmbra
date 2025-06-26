import java.util.Scanner;

public class ProvaCicli {

	public static void main(String[] args) {
		
		//inizializzazione variabile di controllo
		int i = 1;
		
		while(i <= 5) {
			
			i++; //incremento della variabile di controllo
			System.out.println(i);
			
		}

        Scanner input = new Scanner(System.in);

		int x;

		do {
			System.out.println("Inserisci un numero (0 per uscire): ");

			x = input.nextInt();
		}while(x != 0);

		System.out.println("Hai inserito 0. Programma terminato");

	}

}