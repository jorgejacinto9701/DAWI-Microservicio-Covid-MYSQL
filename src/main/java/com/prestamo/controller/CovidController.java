package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Covid;
import com.prestamo.service.CovidService;

@RestController
@RequestMapping("/url/covid")
public class CovidController {

	@Autowired
	private CovidService covidService;
	
	@GetMapping("/listaPorYearMonthDia/{year}-{month}-{day}")
	public List<Covid> listaPorYearMonthDia(@PathVariable String year, @PathVariable String month, @PathVariable String day) {
		return covidService.listaPorYearMonthDia(year, month, day);
	}
}
