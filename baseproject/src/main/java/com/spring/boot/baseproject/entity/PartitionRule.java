package com.spring.boot.baseproject.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "partition_rule")
public class PartitionRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activity_code")
    private String activityCode;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "effect_minutes")
    private Long effectMinutes;

    @Column(name = "member_join_times")
    private Integer memberJoinTimes;

    @Column(name = "member_number")
    private Integer memberNumber;

    @Column(name = "owner_join_times")
    private Integer ownerJoinTimes;

    @Column(name = "partition_type")
    private String partitionType;

    @Column(name = "support_member_types")
    private String supportMemberTypes;

    @Column(name = "support_owner_types")
    private String supportOwnerTypes;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return effect_minutes
     */
    public Long getEffectMinutes() {
        return effectMinutes;
    }

    /**
     * @param effectMinutes
     */
    public void setEffectMinutes(Long effectMinutes) {
        this.effectMinutes = effectMinutes;
    }

    /**
     * @return member_join_times
     */
    public Integer getMemberJoinTimes() {
        return memberJoinTimes;
    }

    /**
     * @param memberJoinTimes
     */
    public void setMemberJoinTimes(Integer memberJoinTimes) {
        this.memberJoinTimes = memberJoinTimes;
    }

    /**
     * @return member_number
     */
    public Integer getMemberNumber() {
        return memberNumber;
    }

    /**
     * @param memberNumber
     */
    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    /**
     * @return owner_join_times
     */
    public Integer getOwnerJoinTimes() {
        return ownerJoinTimes;
    }

    /**
     * @param ownerJoinTimes
     */
    public void setOwnerJoinTimes(Integer ownerJoinTimes) {
        this.ownerJoinTimes = ownerJoinTimes;
    }

    /**
     * @return partition_type
     */
    public String getPartitionType() {
        return partitionType;
    }

    /**
     * @param partitionType
     */
    public void setPartitionType(String partitionType) {
        this.partitionType = partitionType;
    }

    /**
     * @return support_member_types
     */
    public String getSupportMemberTypes() {
        return supportMemberTypes;
    }

    /**
     * @param supportMemberTypes
     */
    public void setSupportMemberTypes(String supportMemberTypes) {
        this.supportMemberTypes = supportMemberTypes;
    }

    /**
     * @return support_owner_types
     */
    public String getSupportOwnerTypes() {
        return supportOwnerTypes;
    }

    /**
     * @param supportOwnerTypes
     */
    public void setSupportOwnerTypes(String supportOwnerTypes) {
        this.supportOwnerTypes = supportOwnerTypes;
    }

    /**
     * @return total_amount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
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
}