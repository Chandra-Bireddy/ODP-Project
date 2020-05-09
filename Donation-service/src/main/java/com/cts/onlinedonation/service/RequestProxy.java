package com.cts.onlinedonation.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.onlinedonation.entity.Request;

@FeignClient(name = "request-service")
public interface RequestProxy {
	
	@GetMapping("request/{requestId}")
	public Optional<Request> getById( @PathVariable int requestId);

}
