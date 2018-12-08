package com.orb.domain.transactionscript.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * RevenueRecognition
 * 收入确认
 *
 * @author tianya
 * @date 2018/12/8
 */
@Data
public class RevenueRecognition {
    private Integer contractId;
    private BigDecimal amount;
    private LocalDate recognizedOn;
}
