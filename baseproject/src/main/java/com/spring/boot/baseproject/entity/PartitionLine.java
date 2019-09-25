package com.spring.boot.baseproject.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "partition_line")
public class PartitionLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activity_code")
    private String activityCode;

    private Double amount;

    @Column(name = "coupon_code")
    private String couponCode;

    @Column(name = "create_time")
    private Date createTime;

    private String member;

    @Column(name = "owner_abo")
    private String ownerAbo;

    @Column(name = "partition_id")
    private Long partitionId;

    @Column(name = "update_time")
    private Date updateTime;

    private String coupon;

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
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return coupon_code
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * @param couponCode
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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
     * @return member
     */
    public String getMember() {
        return member;
    }

    /**
     * @param member
     */
    public void setMember(String member) {
        this.member = member;
    }

    /**
     * @return owner_abo
     */
    public String getOwnerAbo() {
        return ownerAbo;
    }

    /**
     * @param ownerAbo
     */
    public void setOwnerAbo(String ownerAbo) {
        this.ownerAbo = ownerAbo;
    }

    /**
     * @return partition_id
     */
    public Long getPartitionId() {
        return partitionId;
    }

    /**
     * @param partitionId
     */
    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
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
     * @return coupon
     */
    public String getCoupon() {
        return coupon;
    }

    /**
     * @param coupon
     */
    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
}