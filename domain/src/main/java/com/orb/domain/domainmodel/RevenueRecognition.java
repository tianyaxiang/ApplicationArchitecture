package com.orb.domain.domainmodel;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * RevenueRecognition
 * 收入确认
 *
 * @author tianya
 * @date 2018/12/8
 */
public class RevenueRecognition {
    private BigDecimal amount;
    private LocalDate date;

    public RevenueRecognition(BigDecimal amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    boolean isRecognizableBy(LocalDate asOf){
        return asOf.isAfter(date)||asOf.equals(date);
    }
}
