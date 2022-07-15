package com.pod4.dailymutualfundnav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="mutualfund")
@Data
public class MutualFund {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mutual_Fund_Id")
	private int mutualFundId;
	@Column( name="mutual_Fund_Name", unique = true, nullable = false)
	private String mutualFundName;
	@Column(name="mutual_Fund_Value")
	private double mutualFundValue;
}
