public class Bruch {
    private final int numerator; // Zähler
    private final int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return (double) numerator/denominator;
    }

    public String print() {
        return String.format("\"%d / %d\"", numerator, denominator);
    }

    private static Bruch multiplyFractures(Bruch b1, Bruch b2) {
        int multipliedNumerator = b1.numerator * b2.numerator;
        int multipliedDenominator = b1.denominator * b2.denominator;

        return new Bruch(multipliedNumerator, multipliedDenominator);
    }

    public Bruch multiplicate(Bruch b2) {
        return multiplyFractures(this, b2);
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        return null;
    }
}
