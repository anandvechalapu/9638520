package com.9638520.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.9638520.service.BandhanBankService;

@RestController
public class BandhanBankController {
	
	@Autowired
	private BandhanBankService bandhanBankService;
	
	@GetMapping("/checkEligibility")
	public boolean checkEligibility(@RequestParam("annualIncome") long annualIncome) {
		return bandhanBankService.checkEligibility(annualIncome);
	}
	
	@PostMapping("/captureConsent")
	public boolean captureConsent(@RequestParam("mobileNumber") long mobileNumber, @RequestParam("OTP") String OTP) {
		return bandhanBankService.captureConsent(mobileNumber, OTP);
	}
	
	@PostMapping("/enterMobileNumber")
	public boolean enterMobileNumber(@RequestParam("mobileNumber") long mobileNumber) {
		return bandhanBankService.enterMobileNumber(mobileNumber);
	}
	
	@PostMapping("/shareCustomerDetails")
	public boolean shareCustomerDetails(@RequestParam("customerId") long customerId) {
		return bandhanBankService.shareCustomerDetails(customerId);
	}
	
	@GetMapping("/checkSpouseEligibility")
	public boolean checkSpouseEligibility(@RequestParam("annualIncome") long annualIncome) {
		return bandhanBankService.checkSpouseEligibility(annualIncome);
	}
	
	@PostMapping("/fetchSpouseData")
	public boolean fetchSpouseData(@RequestParam("customerId") long customerId) {
		return bandhanBankService.fetchSpouseData(customerId);
	}
	
	@PostMapping("/getDataThroughEkycCkyc")
	public boolean getDataThroughEkycCkyc(@RequestParam("customerId") long customerId) {
		return bandhanBankService.getDataThroughEkycCkyc(customerId);
	}
	
	@PostMapping("/pushDataToBalic")
	public boolean pushDataToBalic(@RequestParam("customerId") long customerId) {
		return bandhanBankService.pushDataToBalic(customerId);
	}
	
	@PostMapping("/downloadCoi")
	public boolean downloadCoi(@RequestParam("customerId") long customerId) {
		return bandhanBankService.downloadCoi(customerId);
	}
	
	@PostMapping("/shareCoi")
	public boolean shareCoi(@RequestParam("mobileNumber") long mobileNumber) {
		return bandhanBankService.shareCoi(mobileNumber);
	}
	
	@PostMapping("/receiveFeedFromBalic")
	public boolean receiveFeedFromBalic(@RequestParam("customerId") long customerId) {
		return bandhanBankService.receiveFeedFromBalic(customerId);
	}
	
	

}