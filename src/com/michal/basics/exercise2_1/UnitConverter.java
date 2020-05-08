package com.michal.basics.exercise2_1;

public class UnitConverter {

    private static Conversion[] conversions = {
            new Conversion("$", "ZŁ", 4.1),
            new Conversion("MILES", "KM", 1.6)
    };

    public static Double convert(String resultUnit, Double value) {
        for (Conversion conversion : conversions) {
            if (conversion.getTargetUnit().equalsIgnoreCase(resultUnit)) {
                return value * conversion.getRate();
            }
        }
        System.out.println("Conversion not found");
        return 0.;
    }
}
