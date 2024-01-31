package itnetwork;

/**
 * Pojištěný
 */
public class Pojistenec {

    /**
     * Jméno pojištěného
     */
    private String jmeno;

    /**
     * Příjmení pojištěného
     */
    private String prijmeni;

    /**
     * Telefoní číslo pojištěného
     */
    private String telefoniCislo;

    /**
     * Věk pojištěného
     */
    private int vek;

    /**
     * Kokstruktor
     * @param jmeno
     * @param prijmeni
     * @param telefoniCislo
     * @param vek
     */
    public Pojistenec(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefoniCislo = telefoniCislo;
        this.vek = vek;
    }

    /**
    Getter a setter pro jmeno
    */
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }


    @Override
    public String toString() {
        return " [Jméno] " + jmeno + "   [Příjmení] " + prijmeni + "   [Telefoní číslo] " + telefoniCislo + "   [Věk] " + vek;
    }
}
