/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   10
 * Übungstitel: Steuerberechnung
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung der Einkommensteuer
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Steuer Stufen mit if entscheiden und dann berechnen.
 *
 * ----------------------------------------------------------
*/


import java.util.Scanner;

public class Steuerberechnung {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Steuerberechnung");

        double einkommen = 0;
        double steuer;
        double steuer1 = (25000 - 11000) * 0.365;
        double steuer2 = (60000 - 25000) * 0.432143;

        System.out.print("Einkommen: ");
        einkommen = scanner.nextDouble();

        if (einkommen <= 11000){
            steuer = 0;
        }

        else if (11000 < einkommen && einkommen <= 25000){
            steuer = steuer1;
        }

        else if (25000 < einkommen && einkommen <= 60000){
            steuer = steuer1 + (einkommen - 25000) * 0.432143;
        }

        else if (einkommen > 60000){
            steuer = steuer1 + steuer2 + (einkommen - 60000) * 0.5;
        }

        else {
            steuer = 0;
        }

        System.out.println("Ihre Steuer beträgt " + steuer);

    }
}
