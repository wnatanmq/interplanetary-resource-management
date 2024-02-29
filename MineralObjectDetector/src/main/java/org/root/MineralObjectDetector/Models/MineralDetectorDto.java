package org.root.MineralObjectDetector.Models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class MineralDetectorDto implements Serializable  {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
