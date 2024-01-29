package itnetwork;

public class Pojistenec {

    private String jmeno;
    private String prijmeni;
    private String telefoniCislo;
    private int vek;

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

    /**
    Getter a setter pro prijmeni
    */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
    Getter a setter pro telefoni cislo
     */
    public String getTelefoniCislo() {
        return telefoniCislo;
    }

    public void setTelefoniCislo(String telefoniCislo) {
        this.telefoniCislo = telefoniCislo;
    }

    /**
     * Geter a setter pro vek
     * @return
     */
    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return " [Jméno] " + jmeno + "   [Příjmení] " + prijmeni + "   [Telefoní číslo] " + telefoniCislo + "   [Věk] " + vek;
    }
}
