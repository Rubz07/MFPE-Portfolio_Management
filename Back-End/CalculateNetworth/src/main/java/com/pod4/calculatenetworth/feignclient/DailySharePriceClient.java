package com.pod4.calculatenetworth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pod4.calculatenetworth.vo.StockDetailsVO;


//#CLOUD URL=http://ec2-3-109-212-171.ap-south-1.compute.amazonaws.com:8081

@FeignClient(url = "http://localhost:8081", name = "DailySharePrice")
public interface DailySharePriceClient {
	
	@GetMapping(value="/DailySharePrice/{stockName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public StockDetailsVO getStockDetail(@RequestHeader("Authorization") String authorization,@PathVariable String stockName);

}
