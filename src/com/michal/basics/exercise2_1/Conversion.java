package com.michal.basics.exercise2_1;

public class Conversion {

    private String sourceUnit;
    private String targetUnit;
    private Double rate;

    public Conversion(String sourceUnit, String targetUnit, Double rate) {
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
        this.rate = rate;
    }

    public String getSourceUnit() {
        return sourceUnit;
    }

    public String getTargetUnit() {
        return targetUnit;
    }

    public Double getRate() {
        return rate;
    }
}
