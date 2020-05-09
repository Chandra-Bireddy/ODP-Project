package com.cts.onlinedonation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.onlinedonation.entity.Donation;
import com.cts.onlinedonation.entity.Request;
import com.cts.onlinedonation.repository.DonationRepository;

@Service
public class DonationService {
	
	@Autowired
	public DonationRepository donationRepository;
	
	@Autowired
	private RequestProxy rp;
	

	  public Donation saveproduct(Donation product) {
		  Donation savedUser=  donationRepository.save(product);
	      return savedUser;
	  }


	public Optional<Donation> getdonationById(int donationId) {
		
		return donationRepository.findById(donationId);
	}



//	public Optional<Donation> getdonationByuserIdanddnationId(int donationId, int userId) {
//	
//		return donationRepository.find(donationId,userId);
//	}


	public Optional<Request> getrequestById(int requestId) {
		return rp.getById(requestId);
	
	}
	
	  
}
