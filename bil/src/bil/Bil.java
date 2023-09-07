package bil;

import java.util.List;

public class Bil {
    private String bilmærke;         // Bilmærke som en streng
    private String bilmodel;         // Bilmodel
    private int regÅr;              // Bilens registeringsår
    private double ejerafgift;      // Bilens ejerafgift

    public Bil(String bilmærke, String bilmodel, int regÅr, double ejerafgift) {
        this.bilmærke = bilmærke;
        this.bilmodel = bilmodel;
        this.regÅr = regÅr;
        this.ejerafgift = ejerafgift;
    }

    public String getBilmærke() {
        return bilmærke;
    }

    public String getBilmodel() {
        return bilmodel;
    }

    public int getRegÅr() {
        return regÅr;
    }

    public double getEjerafgift() {
        return ejerafgift;
    }
    @Override
    public String toString() {
        return "Bil{" +
                "bilmærke='" + bilmærke + '\'' +
                ", bilmodeller=" + bilmodel +
                ", registreringsår=" + regÅr +
                '}';
    }
}
