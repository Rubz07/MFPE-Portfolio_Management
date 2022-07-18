package com.pod4.calculatenetworth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pod4.calculatenetworth.vo.MutualFundVO;



@FeignClient(url = "http://localhost:8082", name = "dailyMutualFundNav")
public interface DailyMutualFundNAVClient {

	@GetMapping(value = "/DailyMutualFundNAV/{mutualFundName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MutualFundVO getMutualFundDetails(@RequestHeader("Authorization") String authorization,
			@PathVariable String mutualFundName);
}
