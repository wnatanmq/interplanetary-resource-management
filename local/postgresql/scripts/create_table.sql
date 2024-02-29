-- Connection in irm database
\c interplanetary_resource_management_database;

-- Table creation for miners registry
CREATE TABLE irm_troot_miners_detector (
    miner_detector_id SERIAL PRIMARY KEY,
    status INT NOT NULL,
    model VARCHAR(100) NOT NULL,
    brand VARCHAR(100) NOT NULL,
    is_operating BOOLEAN NOT NULL,
    acquisition_date DATE NOT NULL
);