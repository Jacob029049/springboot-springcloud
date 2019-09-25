package com.spring.boot.baseproject.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "coupon_rule")
public class CouponRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "rule_id")
    private Long ruleId;

    @Column(name = "update_time")
    private Date updateTime;

    private String coupons;

    @Column(name = "special_member_amounts")
    private String specialMemberAmounts;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return rule_id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return coupons
     */
    public String getCoupons() {
        return coupons;
    }

    /**
     * @param coupons
     */
    public void setCoupons(String coupons) {
        this.coupons = coupons;
    }

    /**
     * @return special_member_amounts
     */
    public String getSpecialMemberAmounts() {
        return specialMemberAmounts;
    }

    /**
     * @param specialMemberAmounts
     */
    public void setSpecialMemberAmounts(String specialMemberAmounts) {
        this.specialMemberAmounts = specialMemberAmounts;
    }
}