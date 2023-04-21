package com.lictechnical.test1.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topupda_entity")
public class TopupdaEntity implements Serializable {
   
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="topup_id")
    private long topupId;

    @Column(name="topup_status")
    private String topupStatus;

    @Column(name="amount_status")
    private String amountStatus;

    @Column(name="modified_on")
    private Timestamp modifiedOn;

    public long getTopupId() {
        return topupId;
    }

    public void setTopupId(long topupId) {
        this.topupId = topupId;
    }

    public String getTopupStatus() {
        return topupStatus;
    }

    public void setTopupStatus(String topupStatus) {
        this.topupStatus = topupStatus;
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}

package com.lictechnical.test1.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topupda_temp_entity")
public class TopupdaTempEntity implements Serializable {
   
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="topup_id")
    private long topupId;

    @Column(name="topup_status")
    private String topupStatus;

    @Column(name="amount_status")
    private String amountStatus;

    @Column(name="modified_on")
    private Timestamp modifiedOn;

    public long getTopupId() {
        return topupId;
    }

    public void setTopupId(long topupId) {
        this.topupId = topupId;
    }

    public String getTopupStatus() {
        return topupStatus;
    }

    public void setTopupStatus(String topupStatus) {
        this.topupStatus = topupStatus;
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}