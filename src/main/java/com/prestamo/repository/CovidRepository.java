package com.prestamo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.prestamo.entity.Covid;

public interface CovidRepository extends MongoRepository<Covid, ObjectId> {

	@Query("{$and:[{'year':?0},{'month':?1},{'day':?2}] }")
	public List<Covid> listaPorYearMonthDia(String year, String month, String day);

}
