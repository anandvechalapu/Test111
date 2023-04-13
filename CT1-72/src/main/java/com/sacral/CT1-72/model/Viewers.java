package com.sacral.CT1_72.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Viewers {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String invoices;
    private String deliveryNotes;
    private String creditNotes;
    private String creditProcessed;
    private String goodsSupplied;
    private String newspaperRecall;
    private String magazineRecall;
    private String salesPoint;
    private String inmRebateCredit;
    private String accountNumber;
    private Date date;
    private String interactionType;
    private String lastTwoYearReport;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getInvoices() {
        return invoices;
    }
 
    public void setInvoices(String invoices) {
        this.invoices = invoices;
    }
 
    public String getDeliveryNotes() {
        return deliveryNotes;
    }
 
    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }
 
    public String getCreditNotes() {
        return creditNotes;
    }
 
    public void setCreditNotes(String creditNotes) {
        this.creditNotes = creditNotes;
    }
 
    public String getCreditProcessed() {
        return creditProcessed;
    }
 
    public void setCreditProcessed(String creditProcessed) {
        this.creditProcessed = creditProcessed;
    }
 
    public String getGoodsSupplied() {
        return goodsSupplied;
    }
 
    public void setGoodsSupplied(String goodsSupplied) {
        this.goodsSupplied = goodsSupplied;
    }
 
    public String getNewspaperRecall() {
        return newspaperRecall;
    }
 
    public void setNewspaperRecall(String newspaperRecall) {
        this.newspaperRecall = newspaperRecall;
    }
 
    public String getMagazineRecall() {
        return magazineRecall;
    }
 
    public void setMagazineRecall(String magazineRecall) {
        this.magazineRecall = magazineRecall;
    }
 
    public String getSalesPoint() {
        return salesPoint;
    }
 
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }
 
    public String getInmRebateCredit() {
        return inmRebateCredit;
    }
 
    public void setInmRebateCredit(String inmRebateCredit) {
        this.inmRebateCredit = inmRebateCredit;
    }
 
    public String getAccountNumber() {
        return accountNumber;
    }
 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
 
    public String getInteractionType() {
        return interactionType;
    }
 
    public void setInteractionType(String interactionType) {
        this.interactionType = interactionType;
    }
 
    public String getLastTwoYearReport() {
        return lastTwoYearReport;
    }
 
    public void setLastTwoYearReport(String lastTwoYearReport) {
        this.lastTwoYearReport = lastTwoYearReport;
    }
 
}