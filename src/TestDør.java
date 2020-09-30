/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2020
 */

public class TestDør {

    static Dør dør = new Dør(true, true);

    public static void main(String[] args) {

        // Case 1 - Tester om døren er låst
        if (dør.låst == true) {
            System.out.println("Døren er låst.");
        }

        // Case 2 - Tester om døren er ulåst
        if (dør.låst == false) {
            System.out.println("Døren er ulåst.");
        }

        // Case 3 - Tester om døren er lukket
        if (dør.lukket == true) {
            System.out.println("Døren er lukket.");
        }

        // Case 4 - Tester om døren er åbent
        if (dør.lukket == false) {
            System.out.println("Døren er åbent.");
        }

        // Case 5 - Tester åbn() metoden
        dør.lukket = true;
        dør.åbn();
        if (dør.lukket == false) {
            System.out.println("Åbn() metoden fungerer efter hensigten!");
        } else {
            System.out.println("Åbn() metoden fungerer ikke efter hensigten!");

        }

        // Case 6 - Tester luk() metoden
        dør.lukket = false;
        dør.luk();
        if (dør.lukket == true) {
            System.out.println("Luk() metoden fungerer efter hensigten!");
        } else {
            System.out.println("Luk() metoden fungerer ikke efter hensigten!");

        }

        // Case 7 - Tester lås() metoden
        dør.låst = false;
        dør.lås();
        if (dør.låst == true) {
            System.out.println("Lås() metoden fungerer efter hensigten!");
        } else {
            System.out.println("Lås() metoden fungerer ikke efter hensigten!");

        }

        // Case 8 - Tester låsOp() metoden
        dør.låst = true;
        dør.låsOp();
        if (dør.låst == false) {
            System.out.println("LåsOp() metoden fungerer efter hensigten!");
        } else {
            System.out.println("LåsOp() metoden fungerer ikke efter hensigten!");

        }


    }


}
