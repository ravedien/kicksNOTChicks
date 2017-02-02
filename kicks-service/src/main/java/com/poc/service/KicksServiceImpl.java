package com.poc.service;

import org.springframework.stereotype.Service;

import com.poc.domain.Kicks;
import com.poc.repository.KicksRepository;

@Service
public class KicksServiceImpl implements KicksService{

	private KicksRepository repository;
	
	public KicksServiceImpl(KicksRepository repository) {
		this.repository = repository;
	}

	@Override
	public Kicks findById(int id) {
		return repository.findOne(id);
	}

}
