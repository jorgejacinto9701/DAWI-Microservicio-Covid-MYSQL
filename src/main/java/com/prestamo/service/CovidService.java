package com.prestamo.service;

import java.util.List;

import com.prestamo.entity.Covid;

public interface CovidService {

	public List<Covid> listaPorYearMonthDia(String year, String month, String day);

}
