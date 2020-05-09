package com.cts.onlinedonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.onlinedonation.entity.Donation;

@Repository
public interface DonationRepository  extends JpaRepository<Donation ,Integer> {
	
  

	

}
