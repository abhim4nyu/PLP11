package com.cg.sts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sts.dto.Stock;
import com.cg.sts.service.StsService;
import java.util.Map;


@Controller
public class StsController {

	@Autowired
	StsService stsservice;
	
	@RequestMapping(value="index")
	public ModelAndView stsindex(@ModelAttribute("my") Stock st){
		
	
		List<Stock> l=stsservice.getAllStocks();
		
		return new ModelAndView("index","data",l);	
	}
	
	@RequestMapping(value="Reliance Industries")
	public ModelAndView stspage1(@ModelAttribute("my") Stock st,@RequestParam("sName") String stockname){
		
	
		Stock st1=stsservice.getStock(stockname);
		
		
		
		return new ModelAndView("order","data",st1);	
	}
	
	
	
	
	@RequestMapping(value="summary")
	public ModelAndView summary(@ModelAttribute("my") Stock st,@RequestParam("qua") double quantity,@RequestParam("name") String name,Map<String, String> m){
		
		
		Stock st1=stsservice.getStock(name);
	
		int totalprice=(int) (quantity*st1.getQuote());
		m.put("name", st1.getStock());
	
		return new ModelAndView("summary","data",totalprice);	
	}
	
	
	
	
	
	
	@RequestMapping(value="Tata Steel")
	public ModelAndView stspage2(@ModelAttribute("my") Stock st,@RequestParam("sName") String stockname){
		
		Stock st1=stsservice.getStock(stockname);
	
		
		
		return new ModelAndView("order","data",st1);	
	}
	
	@RequestMapping(value="LNT")
	public ModelAndView stspage3(@ModelAttribute("my") Stock st,@RequestParam("sName") String stockname){
	
		
		Stock st1=stsservice.getStock(stockname);
	
		
		
		return new ModelAndView("order","data",st1);	
	}
	
	
	
}
