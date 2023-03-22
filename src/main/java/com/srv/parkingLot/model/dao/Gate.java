package com.srv.parkingLot.model.dao;

import com.srv.parkingLot.model.dao.enums.GateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gate extends BaseModel{

    private GateType gateType;

    private Operator operator;

}
