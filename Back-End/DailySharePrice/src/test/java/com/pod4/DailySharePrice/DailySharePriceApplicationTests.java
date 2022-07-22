package com.pod4.DailySharePrice;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.pod4.DailySharePrice.controller.StockController;
import com.pod4.DailySharePrice.service.StockService;
@SpringBootTest
class DailySharePriceApplicationTests {

	@Autowired
    private StockController stockController;
	   @Autowired
	    private  StockService stockService;
	     @Test
	     void contextLoads() throws Exception {
	            assertThat(stockController).isNotNull();
	            assertThat(stockService).isNotNull();
	      }
}
