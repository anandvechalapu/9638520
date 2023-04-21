package com.9638520.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandhanBankRepository extends JpaRepository<BandhanBank, Long> {
    
    // Method to check if the customer is eligible for the insurance policy based on their annual income.
    boolean checkEligibility(long annualIncome);
    
    // Method to capture the customer's consent for insurance, declaration of good health, and authority to debit the premium from their savings account using OTP received on their mobile number.
    boolean captureConsent(long mobileNumber, String OTP);
    
    // Method to enter the customer's mobile number into the mobile application/TAB to initiate the insurance process.
    boolean enterMobileNumber(long mobileNumber);
    
    // Method to share the customer's personal/demographic details, family income details, and CRIF score with BALIC by Bandhan Bank through an API.
    boolean shareCustomerDetails(long customerId);
    
    // Method to check if the customer is eligible for the insurance policy based on their annual income.
    boolean checkSpouseEligibility(long annualIncome);
    
    // Method to fetch the spouse's data, including verified DOB and CRIF, from the bank system. 
    boolean fetchSpouseData(long customerId);
    
    // Method to get the data through Ekyc/Ckyc.
    boolean getDataThroughEkycCkyc(long customerId);
    
    // Method to push the data to BALIC for issuance, and the premium should be debited using the direct debit API.
    boolean pushDataToBalic(long customerId);
    
    // Method to download the COI using the COI download API provided by BALIC.
    boolean downloadCoi(long customerId);
    
    // Method to share the COI on the customer's mobile number through SMS and email.
    boolean shareCoi(long mobileNumber);
    
    // Method to receive a reverse feed from BALIC through Tableau.
    boolean receiveFeedFromBalic(long customerId);
}