package com.dealer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dealer.entity.Dealer;
import com.dealer.exception.NameNotFoundException;
import com.dealer.exception.RatingCustomException;
import com.dealer.service.Dealerservice;

@RestController
@RequestMapping(value = "/dealer")
public class DealerController {

	@Autowired
	Dealerservice ds;

	@PutMapping("/saveall")
	public List<Dealer> saveall(@RequestBody List<Dealer> d) {
		return ds.saveall(d);
	}
	
	@GetMapping("/getbyproduct/{s}")
	public List<Dealer>getbyproduct(@PathVariable("s") String s){
	return ds.getbyproduct(s);
	}
	
	@PostMapping("/saveDealer")//handleexception
	public String saveDealer(@RequestBody Dealer d) throws RatingCustomException{
		return ds.saveDealer(d);
	}
	
	@GetMapping(value="/getbyname/{name}")//globalexception
	public List<Dealer> getbyname(@PathVariable String name)throws NameNotFoundException, Exception{
		return ds.getbyname(name);
	}
	
	@PostMapping(value="/getbyid/{did}")
	public List<Dealer> getbydid(@PathVariable int did)throws NullPointerException{
		return ds.getbydid(did);
	}
	

	
	
	
	}
	
	
