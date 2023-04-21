package com.9638520.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.9638520.repository.BandhanBankRepository;

@Service
public class BandhanBankService {
	
	@Autowired
	private BandhanBankRepository bandhanBankRepository;
	
	public boolean checkEligibility(long annualIncome) {
		return bandhanBankRepository.checkEligibility(annualIncome);
	}
	
	public boolean captureConsent(long mobileNumber, String OTP) {
		return bandhanBankRepository.captureConsent(mobileNumber, OTP);
	}
	
	public boolean enterMobileNumber(long mobileNumber) {
		return bandhanBankRepository.enterMobileNumber(mobileNumber);
	}
	
	public boolean shareCustomerDetails(long customerId) {
		return bandhanBankRepository.shareCustomerDetails(customerId);
	}
	
	public boolean checkSpouseEligibility(long annualIncome) {
		return bandhanBankRepository.checkSpouseEligibility(annualIncome);
	}
	
	public boolean fetchSpouseData(long customerId) {
		return bandhanBankRepository.fetchSpouseData(customerId);
	}
	
	public boolean getDataThroughEkycCkyc(long customerId) {
		return bandhanBankRepository.getDataThroughEkycCkyc(customerId);
	}
	
	public boolean pushDataToBalic(long customerId) {
		return bandhanBankRepository.pushDataToBalic(customerId);
	}
	
	public boolean downloadCoi(long customerId) {
		return bandhanBankRepository.downloadCoi(customerId);
	}
	
	public boolean shareCoi(long mobileNumber) {
		return bandhanBankRepository.shareCoi(mobileNumber);
	}
	
	public boolean receiveFeedFromBalic(long customerId) {
		return bandhanBankRepository.receiveFeedFromBalic(customerId);
	}

}