
import java.util.Scanner;

public class EsercizioStruttureCondizionali {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Chiedo l'età
		System.out.println("Inserisci età: ");
		int eta = input.nextInt();
		
		//Chiedo validità biglietto
		System.out.println("Il biglietto è valido?");
		boolean biglietto = input.nextBoolean();
		
		if(true) {
			System.out.println("Il biglietto è valido");
		}else {
			System.out.println("Il biglietto non è valido");
		}
		
		System.out.println();
		
		System.out.println("Sei accompagnato da un genitore?");
		boolean accompagnamento = input.nextBoolean();
		
		if(true) {
			System.out.println("Ok, puoi passare");
		}else {
			System.out.println("Non puoi passare");
		}
		
		System.out.println();
		
		//OPZIONE SALTAFILA
		
		System.out.println("Hai acquistato l'opzione saltafila?");
		boolean saltafila = input.nextBoolean();
		
		if(true) {
			System.out.println("Puoi saltare la fila");
		}else {
			System.out.println("Non puoi saltare la fila");
		}
		

	}

}
