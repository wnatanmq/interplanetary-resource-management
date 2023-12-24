package org.root.MineralObjectDetector.entity;

public class AnalysisResult {
    private String Material;
    private float Percentual;

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public float getPercentual() {
        return Percentual;
    }

    public void setPercentual(float percentual) {
        Percentual = percentual;
    }
}