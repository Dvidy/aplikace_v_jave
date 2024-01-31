package itnetwork;

import java.util.ArrayList;

/**
 * Databáze
 */
public class Databaze {

    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();

    /**
     * Konstruktor
     */
    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Přidá pojištěného do databáze
     * @param jmeno Jméno pojištěného
     * @param prijmeni Příjmení pojištěného
     * @param telefoniCislo Telefoní číslo pojištěného
     * @param vek věk pojištěného
     */

    public void pridejPojisteneho(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, telefoniCislo, vek));
    }

    /**
     *
     * @param jmeno hledá podle jména
     * @param prijmeni a poté podle příjmení
     * @return Kolekce nalazeného pojištěného
     */
    public ArrayList<Pojistenec> najdiPojisteneho(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezeno = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if ((pojistenec.getJmeno().equals(jmeno)) && (pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezeno.add(pojistenec);
            }
        }
        return nalezeno;
    }

    /**
     * Vypíše všechny uživatele
     * @return Kolekce nalezených pojištěných
     */

    public ArrayList<Pojistenec> vypisPojistenych() {
         ArrayList<Pojistenec> nalezeni = new ArrayList<>();
         for (Pojistenec pojistenec : pojistenci) {
           nalezeni.add(pojistenec);
         }
         return nalezeni;
    }
}
