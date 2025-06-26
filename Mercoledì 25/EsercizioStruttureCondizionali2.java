
import java.util.Scanner;

public class EsercizioStruttureCondizionali2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TIPO DI MEZZO
        System.out.println("Scegli il tipo di mezzo (taxy o bus):");
        String mezzo = input.nextLine();

        if (mezzo.equals("taxy")) {

            System.out.println("Hai acquistato l'opzione saltafila?");
            boolean saltafila = input.nextBoolean();

            if (saltafila) {
                System.out.println("Puoi saltare la fila");
            } else {
                System.out.println("Non puoi saltare la fila");
            }

        } else if (mezzo.equals("bus")) {

            System.out.println("Inserisci età: ");
            int eta = input.nextInt();

            System.out.println("Il biglietto è valido?");
            boolean biglietto = input.nextBoolean();

            if (biglietto) {
                System.out.println("Il biglietto è valido");
            } else {
                System.out.println("Il biglietto non è valido");
            }

            System.out.println("Sei accompagnato da un genitore?");
            boolean accompagnamento = input.nextBoolean();

            // DECIDERE SE PUò PASSARE
            if (biglietto && (eta >= 18 || accompagnamento)) {
                System.out.println("Ok, puoi passare");
            } else {
                System.out.println("Non puoi passare");
            }

        } else {
            System.out.println("Risposta non valida");
        }

    }
}
