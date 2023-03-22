package com.srv.parkingLot.model.dao;

import com.srv.parkingLot.model.dao.enums.BillStatus;
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
public class Bill extends BaseModel{

    private Ticket ticket;
    private Date exitTime;
    private Gate gate;
    private Operator operator;
    private Payment payment;
    private BillStatus billStatus;
    private int amount;
}
