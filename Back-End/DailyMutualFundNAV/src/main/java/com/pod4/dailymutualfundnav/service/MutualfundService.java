package com.pod4.dailymutualfundnav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.dailymutualfundnav.exception.MutualfundNotFoundException;
import com.pod4.dailymutualfundnav.model.MutualFund;
import com.pod4.dailymutualfundnav.repository.MutualfundRepository;

@Service
public class MutualfundService {

	@Autowired
	private MutualfundRepository mutualFundRepository;	
	
	public List<MutualFund> getAll() throws MutualfundNotFoundException{
		
		List<MutualFund> mf=mutualFundRepository.findAll();
		if(mf.isEmpty()) {
			throw new MutualfundNotFoundException("Mutual Found not Available");
		}
		return mf;
	}
	
	
	public MutualFund getByMutualFundName(String mfName) throws MutualfundNotFoundException {
		MutualFund mf=mutualFundRepository.findByMutualFundName(mfName);
		if(mf==null) {
			throw new MutualfundNotFoundException("Mutual Found not Available");
		}
		return mf;
	}
}
