package com.srv.parkingLot.model.dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ticket extends BaseModel{

    private Date entryTime;
    private Gate gate;
    private Vehicle vehicle;
    private Operator operator;
    private ParkingSpot parkingSpot;
}
