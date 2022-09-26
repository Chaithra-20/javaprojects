package com.emphibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("fresherEmployee")
public class fresherEmployee extends employee {
	
	private int ContractPeriod;
	private int increment;
	public int getContractPeriod() {
		return ContractPeriod;
	}
	public void setContractPeriod(int contractPeriod) {
		ContractPeriod = contractPeriod;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	@Override
	public String toString() {
		return "fresherEmployee [ContractPeriod=" + ContractPeriod + ", increment=" + increment + "]";
	}
	
	
}
	


