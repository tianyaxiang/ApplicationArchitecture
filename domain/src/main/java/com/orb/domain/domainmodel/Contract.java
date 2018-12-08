package com.orb.domain.domainmodel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Contract
 * 合同
 *
 * @author tianya
 * @date 2018/12/8
 */
public class Contract {
    private List<RevenueRecognition> revenueRecognitions = new ArrayList();

    /**
     * 确认收入
     *
     * @param asOF
     * @return
     */
    public BigDecimal recognizedRevenue(LocalDate asOF) {
        BigDecimal result = new BigDecimal(0);
        for (RevenueRecognition revenueRecognition:revenueRecognitions){
            if(revenueRecognition.isRecognizableBy(asOF)){
                result.add(revenueRecognition.getAmount());
            }
        }

        return result;
    }
}
