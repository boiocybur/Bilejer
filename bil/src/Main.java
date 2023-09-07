import bil.Bil;
import ejer.Ejer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret en liste af bilmodeller for ejeren
        List<String> bilModeller = Arrays.asList("Model X", "Model S", "Model 3");

        // Opret en instans af Bil med korrekte oplysninger
        List<Integer> registreringsår = Arrays.asList(2015, 2020, 2023); // Et eksempel på flere registreringsår
        Ejer ejer = new Ejer("Jog Jogson", 38, 2000, 5);

        // Opret et array af Bil-objekter
        Bil[] biler = new Bil[5];
        biler[0] = new Bil("Tesla", "Model 3", 2015, 1000.0);
        biler[1] = new Bil("Tesla", "Model S", 2020, 1200.0);
        biler[2] = new Bil("Tesla", "Model X", 2023, 1500.0);
        biler[3] = new Bil("Bugatti", "Chiron", 2019, 5000.0);
        biler[4] = new Bil("Ford", "Focus", 2005, 800.0);

        // Udskriv ejeroplysninger
        System.out.println(ejer.toString());

        // Udskriv information om hver bil
        for (Bil bil : biler) {
            if (bil != null) {
                System.out.println(bil.toString());
            }
        }
        // Find og udskriv den ældste bil
        Bil ældsteBil = ejer.findÆldste();
        if (ældsteBil != null) {
            System.out.println("Den ældste bil: " + ældsteBil.toString());
        } else {
            System.out.println("Ingen biler fundet.");
        }

        // Beregn og udskriv den samlede ejerafgift
        System.out.println("Total ejerafgift: " + ejer.totalEjerAfgift());
        System.out.println("Den ældste bil: " + ejer.findÆldste());
    }
}
