package org.root.MineralObjectDetector.entity;

public class MineralDetector {

    private String MinerDetectorId;
    private String Status;
    private int LastTimestampChanges;

    public String getMinerDetectorId() {
        return MinerDetectorId;
    }

    public void setMinerDetectorId(String minerDetectorId) {
        MinerDetectorId = minerDetectorId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getLastTimestampChanges() {
        return LastTimestampChanges;
    }

    public void setLastTimestampChanges(int lastTimestampChanges) {
        LastTimestampChanges = lastTimestampChanges;
    }
}
