package com.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dealer.entity.Dealer;
import java.util.List;


public interface DealerRepository extends JpaRepository<Dealer, Integer>{
	
	@Query(value="select d from Dealer d where d.product=:product")//jpaquary
	public List<Dealer> getbyproduct(@Param(value="product")String product);
	
	@Query(value="select d from Dealer d where d.name=:name")
	public List<Dealer> getbyName(@Param(value="name")String name);
	
	@Query(value="select d from Dealer d where d.did=:did")
	public List<Dealer> getbyId(@Param(value="did")int did);
	
}
