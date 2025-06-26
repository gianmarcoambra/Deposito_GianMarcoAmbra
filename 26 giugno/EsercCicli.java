
import java.util.Scanner;

public class EsercCicli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Validazione numero di voti
        int numeroVoti;
        System.out.print("Quanti voti vuoi inserire? ");
        numeroVoti = scanner.nextInt();
        
        while (numeroVoti <= 0) {
            System.out.print("Inserisci un numero maggiore di 0: ");
            numeroVoti = scanner.nextInt();
        }
        
        int votiValidi = 0;
        double sommaVoti = 0;
        
        // Ciclo per inserire i voti
        for (int i = 0; i < numeroVoti; i++) {
            System.out.print("Inserisci il voto " + (i + 1) + ": ");
            int voto = scanner.nextInt();
            
            // Validazione del voto
            if (voto >= 0 && voto <= 30) {
                votiValidi++;
                
                // Valutazione del voto
                if (voto >= 18 && voto < 24) {
                    System.out.println("Sufficiente");
                } else if (voto >= 24) {
                    System.out.println("Buono o ottimo");
                } else {
                    System.out.println("Insufficente");
                }
            } else {
                System.out.println("Voto non valido");
            }
        }
        
        // Stampa del numero totale di voti validi
        System.out.println("Numero totale di voti validi inseriti: " + votiValidi);
        
     // Calcolo e stampa della media
        if (votiValidi > 0) {
			double media = sommaVoti / votiValidi;
            System.out.printf("Media dei voti validi: %.2f\n", media);
        } else {
            System.out.println("Nessun voto valido inserito, impossibile calcolare la media");
        }
        
        // Calcolo e stampa della media
        if (votiValidi > 0) {
            double media = sommaVoti / votiValidi;
            System.out.printf("Media dei voti validi: ", media);
        } else {
            System.out.println("Nessun voto valido inserito, impossibile calcolare la media");
        }
        
        scanner.close();
    }
}