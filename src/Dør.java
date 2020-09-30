/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2020
 */

public class Dør {

    boolean låst;
    boolean lukket;

    public Dør(boolean låst, boolean lukket) {
        this.låst = låst;
        this.lukket = lukket;
    }

    public Dør() {
    }

    void lås() {
        // TODO koble elektronik på
        this.låst = true;
    }

    void låsOp() {

        this.låst = false;

    }

    void åbn() {
        lukket = false;
        // Fejl --> lukket = !lukket;
    }

    void luk() {
        lukket = true;
    }
}
