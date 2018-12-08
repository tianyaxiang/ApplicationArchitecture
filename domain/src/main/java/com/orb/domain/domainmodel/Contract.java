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
     * 产品
     */
    private Product product;
    /**
     * 收入
     */
    private BigDecimal revenue;
    /**
     * 签署时间
     */
    private LocalDate whenSigned;

    public Product getProduct() {
        return product;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public LocalDate getWhenSigned() {
        return whenSigned;
    }

    public void setWhenSigned(LocalDate whenSigned) {
        this.whenSigned = whenSigned;
    }


    private Long id;

    public Contract(Product product, BigDecimal revenue, LocalDate whenSigned) {
        this.product = product;
        this.revenue = revenue;
        this.whenSigned = whenSigned;
    }

    public void addRevenueRecognition(RevenueRecognition revenueRecognition) {
        revenueRecognitions.add(revenueRecognition);
    }

    /**
     * 确认收入
     * 计算在特定日期前已确定的收入
     *
     * @param asOF
     * @return
     */
    public BigDecimal recognizedRevenue(LocalDate asOF) {
        BigDecimal result = new BigDecimal(0);
        for (RevenueRecognition revenueRecognition : revenueRecognitions) {
            if (revenueRecognition.isRecognizableBy(asOF)) {
                result = result.add(revenueRecognition.getAmount());
            }
        }

        return result;
    }

    /**
     * 计算收入
     */
    public void calculateRecognitions() {
        product.calculateRevenueRecognitions(this);
    }
}
