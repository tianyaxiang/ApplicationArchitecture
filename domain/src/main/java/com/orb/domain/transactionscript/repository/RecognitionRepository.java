package com.orb.domain.transactionscript.repository;

import com.orb.domain.transactionscript.model.RevenueRecognition;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * RecognitonRepository
 *
 * @author tianya
 * @date 2018/12/8
 */
@Repository
public class RecognitionRepository {
    public void insert(long contractId, BigDecimal amount, LocalDate asOf) {
        return;
    }

    public List<RevenueRecognition> findRecognitionsFor(long contractId, LocalDate asOf) {
        return new ArrayList<>();
    }
}
