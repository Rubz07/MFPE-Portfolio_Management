package com.pod4.calculatenetworth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

//#CLOUD URL=http://ec2-3-109-212-171.ap-south-1.compute.amazonaws.com:8080

@FeignClient(url = "http://localhost:8080", name = "Authorization-Service")
public interface AuthorizationClient {
	
	@GetMapping("/getid")
	public int getUserId(@RequestHeader("Authorization") String authorization);

}