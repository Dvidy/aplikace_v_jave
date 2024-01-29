package itnetwork;

import java.util.ArrayList;

public class Databaze {

    private ArrayList<Pojistenec> pojistenci = new ArrayList<>();

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void pridejPojistence(String jmeno, String prijmeni, String telefoniCislo, int vek) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, telefoniCislo, vek));
    }

    public ArrayList<Pojistenec> najdiPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezeno = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if ((pojistenec.getJmeno().equals(jmeno)) && (pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezeno.add(pojistenec);
            }
        }
        return nalezeno;
    }


    //public void vypisPojistenych() {
      //  for (Pojistenec pojistenec : pojistenci) {
        //    System.out.println(pojistenec.getJmeno() + pojistenec.getPrijmeni() + pojistenec.getTelefoniCislo() + pojistenec.getVek());
       // }
   // }
}
