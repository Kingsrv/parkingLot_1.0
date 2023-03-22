package com.srv.parkingLot.model.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLot extends BaseModel{

    private List<ParkingSpot> parkingSpot;
    private List<Gate> gate;
    private String name;
    private String address;

}
