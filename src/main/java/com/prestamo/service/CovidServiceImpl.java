package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Covid;
import com.prestamo.repository.CovidRepository;

@Service
public class CovidServiceImpl implements CovidService{

	@Autowired
	private CovidRepository covidRepository;
	
	@Override
	public List<Covid> listaPorYearMonthDia(String year, String month, String day) {
		return covidRepository.listaPorYearMonthDia(year, month, day);
	}
}
