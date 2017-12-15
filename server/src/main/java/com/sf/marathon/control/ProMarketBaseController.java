package com.sf.marathon.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sf.marathon.domain.ProMarketBase;
import com.sf.marathon.service.ProMarketBaseService;

@RestController
public class ProMarketBaseController {
	
	@Autowired
	public ProMarketBaseService proMarketBaseService;

	@RequestMapping(value = "/list/{page}/{pageSize}", method = RequestMethod.GET)
	public Page<ProMarketBase> list(@PathVariable("page")int page, @PathVariable("pageSize")int pageSize) {
		return proMarketBaseService.findAll(page,pageSize);
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public ProMarketBase detail(@PathVariable("id") String id) {
		
		return null;
	}
	
	@RequestMapping(value = "/offer", method = RequestMethod.POST)
	public void offer (Long id) {
		// TODO
	}
	
	
	
}