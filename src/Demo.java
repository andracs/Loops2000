/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2020
 */

public class Demo {

    public static void main(String[] args) {

        /* Der er 3 slags loops: for, while, do-while */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int opvaskeMax = 10;
        int tallerknerIMaskinen = 10;

        while (tallerknerIMaskinen < opvaskeMax) {
            String opvasketabs = "Ja";
            System.out.print("Nu er der " + tallerknerIMaskinen
                    + " tallerkner i maskinen. ");
            tallerknerIMaskinen++;
            System.out.println("Jeg har lagt endnu en tallerken i maskinen. ");
        }

        // System.out.println(opvasketabs); // Virker ikke pga. variable scope
        System.out.println("******* Der er " + tallerknerIMaskinen + " tallerkner i maskinen.");








































    }
}
