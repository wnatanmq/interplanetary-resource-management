package org.root.MineralObjectDetector.Models;

import java.io.Serializable;
import java.sql.Timestamp;

import org.root.MineralObjectDetector.Enums.MinerEnum;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class MineralDetectorDto implements Serializable {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String MinerDetectorId;

    @Enumerated()
    @Column()
    private MinerEnum.Status Status;

    @Column()
    @Nonnull()
    private String Model;

    public MineralDetectorDto(
            MinerEnum.Status status, 
            String model, 
            String brand,
            Boolean isOperating, 
            Timestamp aquisitionDate
    ) {
        Status = status;
        Model = model;
        Brand = brand;
        IsOperating = isOperating;
        AquisitionDate = aquisitionDate;
    }

    @Column()
    @Nonnull()
    private String Brand;

    @Column()
    @Nonnull()
    private Boolean IsOperating;

    @Column()
    @Nonnull()
    private Timestamp AquisitionDate;
}
