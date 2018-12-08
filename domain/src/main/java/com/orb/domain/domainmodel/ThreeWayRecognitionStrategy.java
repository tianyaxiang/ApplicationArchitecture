package com.orb.domain.domainmodel;

import java.math.BigDecimal;

/**
 * ThreeWayRecognitionStrategy
 *
 * @author tianya
 * @date 2018/12/8
 */
public class ThreeWayRecognitionStrategy implements RecognitionStrategy {
    private int firstRecognitionOffset;
    private int secondRecognitionOffset;

    public ThreeWayRecognitionStrategy(int firstRecognitionOffset, int secondRecognitionOffset) {
        this.firstRecognitionOffset = firstRecognitionOffset;
        this.secondRecognitionOffset = secondRecognitionOffset;
    }

    @Override
    public void calculateRevenueRecognitions(Contract contract) {
        BigDecimal times = new BigDecimal(3);
        BigDecimal everyTimeRevenue = contract.getRevenue().divide(times, 2, BigDecimal.ROUND_HALF_UP);

        contract.addRevenueRecognition(new RevenueRecognition(everyTimeRevenue,contract.getWhenSigned()));
        contract.addRevenueRecognition(new RevenueRecognition(everyTimeRevenue,contract.getWhenSigned().plusDays(firstRecognitionOffset)));
        contract.addRevenueRecognition(new RevenueRecognition(everyTimeRevenue,contract.getWhenSigned().plusDays(secondRecognitionOffset)));
    }
}
