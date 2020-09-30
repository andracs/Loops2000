/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2020
 */

public class Main {

    static Dør hoveddør = new Dør();
    static Dør bagdør  = new Dør();
    static Dør bryggersDør  = new Dør();

    public static void main(String[] args) {
        ankomme();
    }

    static void ankomme() {
        hoveddør.låsOp();
        hoveddør.åbn();
        bagdør.låsOp();
    }

}
