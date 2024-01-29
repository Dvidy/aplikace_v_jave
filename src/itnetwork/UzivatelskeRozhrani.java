package itnetwork;

import java.util.Scanner;

public class UzivatelskeRozhrani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvidencePojistenych evidencePojistenych = new EvidencePojistenych();
        Databaze databaze = new Databaze();
        String volba = "";
        //Hlavní cyklus
        while (!volba.equals("4")) {
            evidencePojistenych.vypisUvodniObrazovky();
            System.out.println();
            System.out.println("Vyberte si akci: ");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěného");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    evidencePojistenych.pridejPojistence();
                    break;
                case "2":
                    break;
                case "3":
                    evidencePojistenych.vyhledejPojistence();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
                }
            }
        }
    }

