package com.cg.sts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.sts.dto.Stock;

@Repository("stsdao")
public class StsDaoImpl implements StsDao{
	
	@PersistenceContext
	EntityManager em;
		
	@Override
	public List<Stock> getAllStocks() {
		
		
		Query q=em.createQuery("FROM Stock");
		List<Stock> list=q.getResultList();
		return list;
	}

	

	@Override
	public Stock getStock(String stockname) {
		Query q=em.createQuery("FROM Stock where stock=:sname");
		q.setParameter("sname", stockname);
		Stock st=(Stock) q.getSingleResult();
		return st;
	}

}
