package model;

public class Bmi {

    private static final double POUND_TO_KG = 0.45359237;

    private final double value;

    public Bmi(double height, String heightUnit, double weight, String weightUnit) {
        double meter = heightUnit.equals("cm") ? height / 100 : height;
        double kg = weightUnit.equals("lb") ? weight * POUND_TO_KG : weight;
        this.value = kg / (meter * meter);
    }

    public double getValue() {
        return value;
    }

    public String getCategory() {
        if (value < 18.5) {
            return "Berat badan kurang";
        } else if (value < 25) {
            return "Berat badan normal";
        } else if (value < 30) {
            return "Berat badan berlebih";
        }
        return "Obesitas";
    }
}
