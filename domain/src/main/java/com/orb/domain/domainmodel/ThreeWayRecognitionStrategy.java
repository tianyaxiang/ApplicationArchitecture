package com.orb.domain.domainmodel;

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

    }
}
