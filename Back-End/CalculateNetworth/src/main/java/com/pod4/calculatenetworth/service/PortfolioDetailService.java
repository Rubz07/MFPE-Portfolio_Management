package com.pod4.calculatenetworth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.calculatenetworth.feignclient.DailyMutualFundNAVClient;
import com.pod4.calculatenetworth.feignclient.DailySharePriceClient;
import com.pod4.calculatenetworth.model.MutualFund;
import com.pod4.calculatenetworth.model.PortfolioDetails;
import com.pod4.calculatenetworth.model.StockDetail;
import com.pod4.calculatenetworth.repository.PortfolioDetailsRepository;
import com.pod4.calculatenetworth.vo.MutualFundVO;
import com.pod4.calculatenetworth.vo.StockDetailsVO;

@Service
public class PortfolioDetailService {

	@Autowired
	private PortfolioDetailsRepository portfolioDetailsRepository;
	
	@Autowired
	private DailySharePriceClient sharePriceClient;
	
	@Autowired
	private DailyMutualFundNAVClient mutualFundClient;

	public List<PortfolioDetails> getAll() {
		return portfolioDetailsRepository.findAll();
	}

	public PortfolioDetails findByPfid(int id) {
		PortfolioDetails pfDetail = portfolioDetailsRepository.findByPortfolioid(id);
		if (pfDetail == null) {
			return null;
		}
		return pfDetail;
	}

	public double getcalculateNetworth(int id,String authorization) {
		double totalNetworth=0.0;
		PortfolioDetails pfDetail = findByPfid(id);
		List<StockDetail> stockDetail = pfDetail.getStockDetailList();
		List<MutualFund> mutualFund = pfDetail.getMutualFundList();
		for (StockDetail stock : stockDetail) {
			StockDetailsVO stockDetailsVO=sharePriceClient.getStockDetail(authorization,stock.getStockName());
			totalNetworth += stockDetailsVO.getStockValue() * stock.getStockCount();
		}
		for (MutualFund mfund : mutualFund) {
			MutualFundVO mutualFundVO=mutualFundClient.getMutualFundDetails(authorization,mfund.getMutualFundName());
			totalNetworth += mutualFundVO.getMutualFundValue() * mfund.getMutualFundUnits();
		}

		return totalNetworth;
	}

}
