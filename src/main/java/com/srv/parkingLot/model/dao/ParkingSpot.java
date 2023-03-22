package com.srv.parkingLot.model.dao;

import com.srv.parkingLot.model.dao.enums.ParkingSpotStatus;
import com.srv.parkingLot.model.dao.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot extends BaseModel{

    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType supportedVehicle;
    private int spotNumber;

}
