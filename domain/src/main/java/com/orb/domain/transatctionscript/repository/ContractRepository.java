package com.orb.domain.transatctionscript.repository;

import com.orb.domain.transatctionscript.model.Contract;
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
