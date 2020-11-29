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
public class RecognitionServiceImpl implements RecognitionService {
    ContractRepository contractRepository = new ContractRepository();
}
