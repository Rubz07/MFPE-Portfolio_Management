package com.pod4.calculatenetworth.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pod4.calculatenetworth.controller.NetworthController;
import com.pod4.calculatenetworth.feignclient.AuthorizationClient;
import com.pod4.calculatenetworth.model.MutualFund;
import com.pod4.calculatenetworth.model.PortfolioDetails;
import com.pod4.calculatenetworth.model.StockDetail;
import com.pod4.calculatenetworth.service.MutualFundService;
import com.pod4.calculatenetworth.service.PortfolioDetailService;
import com.pod4.calculatenetworth.service.StockDetailService;

@WebMvcTest(NetworthController.class)
class NetworthControllerTest {
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	@MockBean
	private PortfolioDetailService portfolioDetailService;
	@MockBean
	private AuthorizationClient authorizationClient;
	@MockBean
	private StockDetailService stockDetailService;
	@MockBean
	private MutualFundService mutualFundfolioDetailService;


	MutualFund mutualFund = new MutualFund(21, "CPE", 10);
	StockDetail stockDetail = new StockDetail(10, "CTS", 10);


	@Test
	void testViewAsset() throws Exception {
		
		List<MutualFund> mfList = new ArrayList<>();
		mfList.add(mutualFund);
		List<StockDetail> sdList = new ArrayList<>();
		sdList.add(stockDetail);
		PortfolioDetails portfolioDetails = new PortfolioDetails(101, sdList, mfList);

		Map<String, String> map = new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAll(map);

		Mockito.when(portfolioDetailService.findByPfid(portfolioDetails.getPortfolioid())).thenReturn(portfolioDetails);

		mockMvc.perform(MockMvcRequestBuilders.get("/calculateNetworth/viewAsset").headers(httpHeaders)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

	@Test
	void testCalculateNetworth() throws Exception {
		List<MutualFund> mfList = new ArrayList<>();
		mfList.add(mutualFund);
		List<StockDetail> sdList = new ArrayList<>();
		sdList.add(stockDetail);

		Map<String, String> map = new HashMap<>();
		map.put("Authorization", "token");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAll(map);

		mockMvc.perform(MockMvcRequestBuilders.get("/calculateNetworth/").headers(httpHeaders)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}

}