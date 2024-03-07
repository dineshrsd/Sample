package com.dealer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealer.entity.Dealer;
import com.dealer.repository.DealerRepository;

@Repository
public class DealerDao {
	@Autowired
	DealerRepository dr;

	public List<Dealer> saveall(List<Dealer> d) {
		return dr.saveAll(d);
	}

	public List<Dealer> getbyproduct(String s) {
		return dr.getbyproduct(s);
	}

	public String saveDealer(Dealer d) {
		 dr.save(d);
		 return "sucess";
	}
	
	public List<Dealer>getbyname(String name){
		return dr.getbyName(name);
	}
	public List<Dealer>getbydid(int did){
		return dr.getbyId(did);
	}
}
