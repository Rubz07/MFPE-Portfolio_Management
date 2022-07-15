package com.pod4.dailymutualfundnav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pod4.dailymutualfundnav.authorization.AuthorizationClient;
import com.pod4.dailymutualfundnav.exception.MutualfundNotFoundException;
import com.pod4.dailymutualfundnav.model.MutualFund;
import com.pod4.dailymutualfundnav.service.MutualfundService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/DailyMutualFundNAV")
public class MutualfundController {
	@Autowired
	private MutualfundService  mutualFundService;
	@Autowired
	private AuthorizationClient authorizationClient;

	@GetMapping(value = "/{mutualFundName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MutualFund getMutualFundDetails(@RequestHeader("Authorization") String authorization,@PathVariable String mutualFundName) throws MutualfundNotFoundException {
		authorizationClient.getUname(authorization);
		log.info("Fetching MutualFund using MutualName");
		return mutualFundService.getByMutualFundName(mutualFundName);
	}

	@GetMapping(value = "/allmf", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MutualFund> getAllMutualFund(@RequestHeader("Authorization") String authorization)
			throws MutualfundNotFoundException {
		authorizationClient.getUname(authorization);
		return mutualFundService.getAll();
	}

}
