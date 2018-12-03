package com.cg.sts.dao;

import java.util.List;

import com.cg.sts.dto.Stock;

public interface StsDao {

	List<Stock> getAllStocks();

	Stock getStock(String stockname);

}
