package com.apallapu.springdata.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apallapu.springdata.sample.entities.Company;
import com.apallapu.springdata.sample.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	CompanyService buildingService;

	@PostMapping(value = "/building")
	public Company save(@RequestBody Company building) {

		return buildingService.save(building);
	}

}
