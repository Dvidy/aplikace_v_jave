package itnetwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * EvidencePojištěných
 */
public class EvidencePojistenych {

    /**
     * Databáze
     */
    private Databaze databaze;

    /**
     * Scanner
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Konstruktor
     */
    public EvidencePojistenych() {
        databaze = new Databaze();
    }

    /**
     * @return Jméno zadané uživatelem
     */
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

    /**
     * @return Přijmení zadané uživatelem
     */
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
     * Naparsuje věk uživatele
     * @return Naparsovaný věk uživatele ze vstupu
     */
    private int naparsujVek() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception ex) {
                System.out.println();
                System.out.println("Nesprávně zadaný věk! Prosím, zadejte znovu.");
            }
        }
    }

    /**
     * Přidání pojištěného do databáze
     */
    public void pridejPojisteneho() {
        System.out.println("Zadejte jméno pojistného: ");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte přijmení pojistného: ");
        String prijmeni = scanner.nextLine().trim();
        System.out.println("Zadejte telefoní číslo pojistného: ");
        String telefoniCislo = scanner.nextLine().trim();
        System.out.println("Zadejte věk pojistného: ");
        int vek = naparsujVek();
        databaze.pridejPojisteneho(jmeno, prijmeni, telefoniCislo, vek);
        System.out.println();
        System.out.println("Data byla úspěšně uložena. Pokračujte libovolnou klávesou...");
        System.out.println();

    }

    /**
     * Vyhledá pojištěného
     */
   public void vyhledejPojisteneho() {
       // Zadání jména a příjmení uživatelem
       String jmeno = najdiJmeno();
       String prijmeni = najdiPrijmeni();
       // Vyhledá konkrétního pojištěného
       ArrayList<Pojistenec> pojistenci = databaze.najdiPojisteneho(jmeno, prijmeni);
       // Vypsání konkrétního pojištěného
       if (pojistenci.size() > 0) {
           System.out.println();
           for (Pojistenec pojistenec : pojistenci) {
               System.out.println(pojistenec);
               System.out.println();
               System.out.println("Pokračujte libovolnou klávesou...");
               System.out.println();
           }
       } else {
           System.out.println();
           System.out.println("Nebyly nalezeni žádní pojištěnci.");
       }
   }

    /**
     * Vypíše všchny uživatele, co jsou v databázi
     */
   public void vypisVsechnyPojistenych() {
       ArrayList<Pojistenec> pojistenci = databaze.vypisPojistenych();
       for (int i = 0; i < pojistenci.size(); i++) {
           System.out.println(pojistenci.get(i));
       }
           System.out.println();
           System.out.println("Pokračujte libovolnou klávesou...");
           System.out.println();
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
