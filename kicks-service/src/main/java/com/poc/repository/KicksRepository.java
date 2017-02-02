package com.poc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poc.domain.Kicks;

@Repository
public interface KicksRepository extends CrudRepository<Kicks, Integer> {
	List<Kicks> findByName(String name);
}
