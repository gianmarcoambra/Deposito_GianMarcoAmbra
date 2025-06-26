
import java.util.Scanner;

public class GaraSportiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiesta dati
        System.out.print("Inserisci la tua età: ");
        int eta = input.nextInt();

        System.out.print("Inserisci il tuo miglior tempo sui 100 metri (in secondi): ");
        double tempo100m = input.nextDouble();

        System.out.print("Inserisci il tuo peso (in kg): ");
        double peso = input.nextDouble();

        System.out.print("Inserisci la tua altezza (in metri): ");
        double altezza = input.nextDouble();

        // Calcolo BMI
        double bmi = peso / Math.pow(altezza, 2);

        // Controllo condizioni
        boolean etaValida = eta >= 18 && eta <= 40;
        boolean tempoValido = tempo100m < 12;
        boolean bmiValido = bmi < 25;

        if (etaValida && tempoValido && bmiValido) {
            System.out.println("Ammesso alla gara");
        } else {
            System.out.println("Non ammesso alla gara");
        }
    }
}
