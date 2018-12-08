package com.orb.domain.transactionscript.repository;

import com.orb.domain.transactionscript.model.Contract;
import org.springframework.stereotype.Repository;

/**
 * ContractRepository
 *
 * @author tianya
 * @date 2018/12/8
 */
@Repository
public class ContractRepository {
    public Contract find(long id) {
        return new Contract();
    }
}
