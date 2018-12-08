package com.orb.domain.domainmodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * ProductTest
 *
 * @author tianya
 * @date 2018/12/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    private static final String FORMAT_PRINT = "合同产品名称：%s ；合同签署时间：%s ；合同总金额：%s ；确认收入时间：%s ；已确认的收入:%s ";

    @Test
    public void test() {
        Product word = Product.newWordProcessor("Think Word");
        Product calc = Product.newSpreadsheet("Think Calc");
        Product db = Product.newDatabase("Think DB");
        LocalDate whenSigned = LocalDate.now();
        Contract wordContract = new Contract(word, new BigDecimal(100), whenSigned);
        Contract calcContract = new Contract(calc, new BigDecimal(120), whenSigned);
        Contract dbContract = new Contract(db, new BigDecimal(3000), whenSigned);
        calcContract.calculateRecognitions();
        dbContract.calculateRecognitions();
        wordContract.calculateRecognitions();
        System.out.println(String.format(FORMAT_PRINT,
                wordContract.getProduct().getName(),
                wordContract.getWhenSigned(),
                wordContract.getRevenue(),
                LocalDate.now(),
                wordContract.recognizedRevenue(LocalDate.now()).toString()));
        System.out.println(String.format(FORMAT_PRINT,
                calcContract.getProduct().getName(),
                calcContract.getWhenSigned(),
                calcContract.getRevenue(),
                LocalDate.now(),
                calcContract.recognizedRevenue(LocalDate.now()).toString()));
        System.out.println(String.format(FORMAT_PRINT,
                dbContract.getProduct().getName(),
                dbContract.getWhenSigned(),
                dbContract.getRevenue(),
                LocalDate.now(),
                dbContract.recognizedRevenue(LocalDate.now()).toString()));
    }

}