package com.enigma.karyawan.exceptions;

import com.enigma.karyawan.constant.ExceptionsConstant;

import javax.persistence.criteria.CriteriaBuilder;

public class PositionUnavailable extends RuntimeException {

    public PositionUnavailable(Integer id){
        super(String.format(ExceptionsConstant.POSITION_UNAVAILABLE, id));
    }

}
