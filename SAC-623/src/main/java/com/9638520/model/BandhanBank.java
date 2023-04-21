package com.9638520.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BandhanBank {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;
    
    private Long mobileNumber;
    private Long annualIncome;
    private String OTP;
    private Long spouseId;
    private String CRIF;
    private String DOB;
    private Long premium;
    
    public BandhanBank() {}
    
    public Long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    
    public Long getMobileNumber() {
        return mobileNumber;
    }
    
    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public Long getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(Long annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public String getOTP() {
        return OTP;
    }
    
    public void setOTP(String OTP) {
        this.OTP = OTP;
    }
    
    public Long getSpouseId() {
        return spouseId;
    }
    
    public void setSpouseId(Long spouseId) {
        this.spouseId = spouseId;
    }
    
    public String getCRIF() {
        return CRIF;
    }
    
    public void setCRIF(String CRIF) {
        this.CRIF = CRIF;
    }
    
    public String getDOB() {
        return DOB;
    }
    
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public Long getPremium() {
        return premium;
    }
    
    public void setPremium(Long premium) {
        this.premium = premium;
    }
}