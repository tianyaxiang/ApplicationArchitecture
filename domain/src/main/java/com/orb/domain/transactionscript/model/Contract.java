package com.orb.domain.transactionscript.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Contract
 * 合同
 *
 * @author tianya
 * @date 2018/12/8
 */
@Data
public class Contract {
    private Long id;
    private Long productId;
    private String type;
    private LocalDate dateSigned;
    private BigDecimal revenue;
}
