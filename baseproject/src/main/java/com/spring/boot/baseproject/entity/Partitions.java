package com.spring.boot.baseproject.entity;

import javax.persistence.*;

public class Partitions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activity_code")
    private String activityCode;

    @Column(name = "need_members")
    private Integer needMembers;

    @Column(name = "order_code")
    private String orderCode;

    private String owner;

    @Column(name = "rule_id")
    private Long ruleId;

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
     * @return activity_code
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * @param activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /**
     * @return need_members
     */
    public Integer getNeedMembers() {
        return needMembers;
    }

    /**
     * @param needMembers
     */
    public void setNeedMembers(Integer needMembers) {
        this.needMembers = needMembers;
    }

    /**
     * @return order_code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * @param orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
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
}