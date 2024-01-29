package itnetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencePojistenych {

    private Databaze databaze;
    private Scanner scanner = new Scanner(System.in);

    public EvidencePojistenych() {
        databaze = new Databaze();
    }


    private String najdiJmeno() {
        System.out.println("Zadejte jméno pojištěného: ");
        while (true) {
            try {
                return scanner.nextLine();
            } catch (Exception ex) {
                System.out.println("Nesprávně zadané jméno, zadejte prosím znovu.");
            }
        }
    }

    private String najdiPrijmeni() {
        System.out.println("Zadejte příjmení pojištěného: ");
        while (true) {
            try {
                return scanner.nextLine();
            } catch (Exception ex) {
                System.out.println("Nesprávně zadané přijmení, zadejte prosím znovu.");
            }
        }
    }
    /**
     * Přidání pojištěného
     */
    public void pridejPojistence() {
        System.out.println("Zadejte jméno pojistného: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte přijmení pojistného: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte telefoní číslo pojistného: ");
        String telefoniCislo = scanner.nextLine();
        System.out.println("Zadejte věk pojistného: ");
        int vek = Integer.parseInt(scanner.nextLine());
        databaze.pridejPojistence(jmeno, prijmeni, telefoniCislo, vek);

    }

    /**
     * Vyhledani pojištěnce
     */

   public void vyhledejPojistence() {
       String jmeno = najdiJmeno();
       String prijmeni = najdiPrijmeni();
       ArrayList<Pojistenec> pojistenci = databaze.najdiPojistence(jmeno, prijmeni);
       if (pojistenci.size() > 0) {
           System.out.println();
           for (Pojistenec pojistenec : pojistenci) {
               System.out.println(pojistenec);
           }
       } else {
           System.out.println("Nebyly nalezeni žádní pojištěnci.");
       }
   }

    /**
     * Výpis úvodní obrazovky
     */

    public void vypisUvodniObrazovky() {
        System.out.println("---------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("---------------------");
    }

}
