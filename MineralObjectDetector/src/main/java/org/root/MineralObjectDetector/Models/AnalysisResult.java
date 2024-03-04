package org.root.MineralObjectDetector.Models;

public class AnalysisResult {
    private String Material;
    private float Percentual;

    public AnalysisResult(String material, float percentual) {
        Material = material;
        Percentual = percentual;
    }

    public AnalysisResult() {}
    
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