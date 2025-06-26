
import java.util.Scanner;

public class ProvaCicloFor {

	public static void main(String[] args) {
		
		//TABELLINA
		
		Scanner input = new Scanner(System.in);
		
		//CHIEDO NUMERO ALL'UTENTE
		System.out.println("Inserisci un numero: ");
		int numero = input.nextInt();
		
		//STAMPA TABELLINA
		System.out.println("Tabellina del numero "+numero+":");
		
		//CICLO FOR PER MOLTIPLICARE IL NUMERO PER VALORI DA 1 A 10
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(numero+" x "+i+" = "+numero * i);
		}
		
		input.close();

	}

}