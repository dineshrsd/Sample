package com.dealer.service;

import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dealer.dao.DealerDao;
import com.dealer.entity.Dealer;
import com.dealer.exception.RatingCustomException;

@Service
public class Dealerservice {
	@Autowired
	DealerDao dao;

	public List<Dealer> saveall(List<Dealer> d) {
		return dao.saveall(d);
	}

	public List<Dealer> getbyproduct(String s) {
		return dao.getbyproduct(s);
	}

	public String saveDealer(Dealer d) throws RatingCustomException {
		try {
			if (d.getRating() >= 1 && d.getRating() <= 5) {
				return dao.saveDealer(d);
			} else {
				throw new RatingCustomException("please give rating between 1 To 5");
			}
		} catch (Exception e) {
			return "please give rating between 1 to 5 in catch ";
		}
	}

	public List<Dealer> getbyname(String name) throws NameNotFoundException {
		if (dao.getbyname(name).isEmpty()) {
			throw new NameNotFoundException("there is no data in this field");
		} else {

			return dao.getbyname(name);
		}
	}
	
	public List<Dealer> getbydid(int did) throws NullPointerException{
		if (dao.getbydid(did).isEmpty()) {
			throw new NullPointerException("there is no data ");
		} else {

			return dao.getbydid(did);
		}
	}

}
