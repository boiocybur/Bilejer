package ejer;
import bil.Bil;

import java.util.Arrays;
import java.util.List;

public class Ejer {
    private String navn;             // Ejerens navn
    private int alder;               // Ejerens alder
    private double ejerAfgift;       // Bilens ejerafgift
    private int antal;               // Antal biler ejeren har
    private List<Bil> biler;         // Liste over ejerens biler
    private int maxÅr;

    public Ejer(String navn, int alder, double ejerAfgift, int antal, List<Bil> biler) {
        this.navn = navn;
        this.alder = alder;
        this.ejerAfgift = ejerAfgift;
        this.antal = antal;
    }

    @Override
    public String toString() {
        return "Ejer{" +
                "navn='" + navn + '\'' +
                ", alder=" + alder +
                ", antal=" + antal +
                ", ejerafgift=" + ejerAfgift +
                '}';
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public double getEjerAfgift() {
        return ejerAfgift;
    }

    public int getAntal() {
        return antal;
    }

    public List<Bil> getBiler() {
        return biler;
    }

    public double totalEjerAfgift() {
        double totalAfgift = 0;

        for (Bil bil : biler) {
            if (bil != null) {
                totalAfgift += bil.getEjerafgift();
            }
        }

        return totalAfgift;
    }
    public Bil findÆldste(){
        Bil ældsteBil = null;
        int maxÅr = 5000;
        for(Bil bil : biler){
            if(bil.getRegÅr() < maxÅr) {
                ældsteBil = bil;
                maxÅr = bil.getRegÅr();
            }
        }
        return ældsteBil;
    }
}
