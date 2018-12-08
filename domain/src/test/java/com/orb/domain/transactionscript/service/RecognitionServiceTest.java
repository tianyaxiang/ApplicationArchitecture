package com.orb.domain.transactionscript.service;

import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * RecognitionServiceTest
 *
 * @author tianya
 * @date 2018/12/8
 */
public class RecognitionServiceTest {
    @Resource
    RecognitionService recognitionService;

    @Test
    public void recognizedRevenue() {
        long contractId = 0;

        BigDecimal revenue = recognitionService.recognizedRevenue(contractId, LocalDate.now());
    }

    @Test
    public void calculateRevenueRecognitions() {
        long contractId = 0;

        recognitionService.calculateRevenueRecognitions(contractId);
    }
}