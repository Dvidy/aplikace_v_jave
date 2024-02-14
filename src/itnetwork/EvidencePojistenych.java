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
     * Hledá jméno
     * @return Jméno zadané uživatelem
     */
    private String najdiJmeno() {
        System.out.println("Zadejte jméno pojištěného: ");
        return scanner.nextLine();
    }

    /**
     * Hledá příjmení
     * @return Přijmení zadané uživatelem
     */
    private String najdiPrijmeni() {
        System.out.println("Zadejte příjmení pojištěného: ");
        return scanner.nextLine();
    }

    /**
     * Zkontroluje a přidá telefonní číslo pojistného
     * @return Telefonní číslo, pokud bylo zadáno správně
     */
    private String pridejTelefoniCislo() {
        String cislo = null;
        boolean validniCislo = false;

        while (!validniCislo) {
            System.out.println("Zadejte své telefoní číslo: ");
            cislo = scanner.nextLine().trim();

            // Zkontolujeme délku čísla
            if (cislo.length() >= 9 && cislo.length() <= 13) {
                validniCislo = true;
            } else {
                System.out.println("Telefonní číslo musí mít alespoň 9 znaků a nesmí být delší než 13 znaků.");
                System.out.println();
            }
        }
        return cislo;
    }

    /**
     * Naparsuje věk uživatele
     * @return Naparsovaný věk uživatele ze vstupu
     */
    private int naparsujVek() {
        while (true) {
            try {
                System.out.println("Zadejte věk pojistného: ");
                int vek = Integer.parseInt(scanner.nextLine().trim());
                if (vek > 0 && vek <= 130) { // Kontrola, zda věk nepřekračuje 130 let
                    return vek;
                } else {
                    System.out.println("Zadaný věk musí být v rozmezí 0 až 130. Prosím, zadejte věk znovu.");
                    System.out.println();
                }
            } catch (NumberFormatException ex) {
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
        // Zkontoluje a přidá telefoní číslo pojištěného
        String telefoniCislo = String.valueOf(pridejTelefoniCislo());
        // Naparsuje, zkontroluje a přidá věk pojištěného
        int vek = naparsujVek();
        databaze.pridejPojisteneho(jmeno, prijmeni, telefoniCislo, vek);
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
