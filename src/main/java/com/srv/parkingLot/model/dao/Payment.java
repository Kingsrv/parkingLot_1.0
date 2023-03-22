package com.srv.parkingLot.model.dao;

import com.srv.parkingLot.model.dao.enums.PaymentMode;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment extends BaseModel{

    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private int amount;
    private String referenceId;
}
