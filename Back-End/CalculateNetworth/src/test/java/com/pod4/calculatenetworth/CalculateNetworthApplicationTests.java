package com.pod4.calculatenetworth;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pod4.calculatenetworth.controller.NetworthController;
import com.pod4.calculatenetworth.service.MutualFundService;
import com.pod4.calculatenetworth.service.PortfolioDetailService;
import com.pod4.calculatenetworth.service.StockDetailService;


@SpringBootTest
class CalculateNetworthApplicationTests {

	@Autowired
    private NetworthController networthController;
    @Autowired
    private  MutualFundService mutualFundService;
    @Autowired
    private  PortfolioDetailService portfolioService;
    @Autowired
    private  StockDetailService stockDetailService;
     @Test
     void contextLoads() throws Exception {
            assertThat(networthController).isNotNull();
            assertThat(mutualFundService).isNotNull();
            assertThat(portfolioService).isNotNull();
            assertThat(stockDetailService).isNotNull();
      }
	

}
