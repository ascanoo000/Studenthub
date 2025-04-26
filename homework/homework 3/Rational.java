public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("分母不能为零。");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational normalize() {
        int gcd = gcd(numerator,denominator);
        int newNumerator = numerator / gcd;
        int newDenominator = denominator / gcd;

    return new Rational(newNumerator, newDenominator);
}
private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b; 
        b = a % b;
        a = temp;
    }
     return Math.abs(a); 
}

public boolean isWhole() {
    return numerator % denominator == 0; 
}

public boolean isDecimal() {
    return numerator % denominator != 0; 
}

public boolean equals(int numerator, int denominator) {
    Rational other = new Rational(numerator, denominator); 
    return this.normalize().getNumerator() == other.normalize().getNumerator() && 
           this.normalize().getDenominator() == other.normalize().getDenominator();
}

public boolean equals(Rational r) {
    return this.normalize().getNumerator() == r.normalize().getNumerator() &&
           this.normalize().getDenominator() == r.normalize().getDenominator();
}

public static Rational parseRational(char[] char1, char[] char2) {

    int p = Integer.parseInt(new String(char1));
    int q = Integer.parseInt(new String(char2));

    return new Rational(p, q);
}

public static Rational parseRational(String str) {
    String[] parts = str.split("/");

    if (parts.length != 2) {
        throw new IllegalArgumentException("Input string must be in the form 'numerator/denominator'.");
    }

    int p = Integer.parseInt(parts[0].trim());
    int q = Integer.parseInt(parts[1].trim());

    return new Rational(p, q);
}
}