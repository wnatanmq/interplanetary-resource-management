package org.root.MineralObjectDetector.Models;

import java.util.List;

public class MineralAnalysis {
    
    private String MinerDetectorId;
    private float XCoordinate;
    private float yCoordinate;
    private int OffSetDeeper;
    private List<AnalysisResult> ListAnalysisResult;

    public String getMinerDetectorId() {
        return MinerDetectorId;
    }

    public void setMinerDetectorId(String minerDetectorId) {
        MinerDetectorId = minerDetectorId;
    }

    public float getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(float xCoordinate) {
        XCoordinate = xCoordinate;
    }

    public float getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getOffSetDeeper() {
        return OffSetDeeper;
    }

    public void setOffSetDeeper(int offSetDeeper) {
        OffSetDeeper = offSetDeeper;
    }

    public List<AnalysisResult> getListAnalysisResult() {
        return ListAnalysisResult;
    }

    public void setListAnalysisResult(List<AnalysisResult> listAnalysisResult) {
        ListAnalysisResult = listAnalysisResult;
    }
}
