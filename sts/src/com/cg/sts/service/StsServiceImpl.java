package com.cg.sts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sts.dao.StsDao;
import com.cg.sts.dto.Stock;


@Service("stsservice")
@Transactional
public class StsServiceImpl implements StsService{
	
	
	@Autowired
	StsDao stsdao;

	@Override
	public List<Stock> getAllStocks() {
		
		return stsdao.getAllStocks();
	}

	@Override
	public Stock getStock(String stockname) {
		// TODO Auto-generated method stub
		return stsdao.getStock(stockname);
	}
	
}
