package com.orb.domain.transactionscript.service;

import com.orb.domain.transactionscript.model.Contract;
import com.orb.domain.transactionscript.model.RevenueRecognition;
import com.orb.domain.transactionscript.repository.ContractRepository;
import com.orb.domain.transactionscript.repository.RecognitionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * RecognitionService
 * 计算逻辑
 *
 * @author tianya
 * @date 2018/12/8
 */
@Service
public class RecognitionService {
    @Resource
    ContractRepository contractRepository;
    @Resource
    RecognitionRepository recognitionRepository;

    /**
     * 查询某合同在指定日期前已经确认的收入额
     *
     * @param contractId
     * @param asOf
     * @return
     */
    public BigDecimal recognizedRevenue(long contractId, LocalDate asOf) {
        List<RevenueRecognition> revenueRecognitions = recognitionRepository.findRecognitionsFor(contractId, asOf);
        BigDecimal result = new BigDecimal(0);
        for (RevenueRecognition revenueRecognition : revenueRecognitions) {
            result = result.add(revenueRecognition.getAmount());
        }

        return result;
    }

    /**
     * 计算合同的收入确认
     *
     * @param contractId
     */
    public void calculateRevenueRecognitions(long contractId) {
        Contract contract = contractRepository.find(contractId);
        if (contract.getType().equals("S")) {
            BigDecimal times = new BigDecimal(3);
            BigDecimal everyTimeRevenue = contract.getRevenue().divide(times, 2, BigDecimal.ROUND_HALF_UP);
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned());
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned().plusDays(60));
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned().plusDays(90));
        } else if (contract.getType().equals("W")) {
            recognitionRepository.insert(contractId, contract.getRevenue(), contract.getDateSigned());
        } else if (contract.getType().equals("D")) {
            BigDecimal times = new BigDecimal(3);
            BigDecimal everyTimeRevenue = contract.getRevenue().divide(times, 2, BigDecimal.ROUND_HALF_UP);
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned());
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned().plusDays(30));
            recognitionRepository.insert(contractId, everyTimeRevenue, contract.getDateSigned().plusDays(60));
        }
    }
}
