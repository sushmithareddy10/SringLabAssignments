package com.cg.trainee.serviceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.model.Trainee;
import com.cg.trainee.respository.TraineeJpaRepository;
import com.cg.trainee.*;

@Service
public class TraineeServiceImpl {
	
	@Autowired
	private TraineeJpaRepository repository;

	public void insert(Trainee trainee) {
	   repository.save(trainee);	
	}
	
	public Trainee finById(int traineeId) {
		return repository.findById(traineeId);
	}
	
	public List<Trainee> findAll() {
		return (List<Trainee>) repository.findAll();
	}
	
	public List<Trainee> findByName(String traineeName) {
		List<Trainee> traineeList = new ArrayList<>();
		List<Trainee> list = (List<Trainee>) repository.findAll();
		for(Trainee t: list) {
			if(t.getTraineeName().equalsIgnoreCase(traineeName)) {
				traineeList.add(t);
			}
		}
		return traineeList;
	}
	
	public void deleteById(int traineeId) {
		repository.deleteById(traineeId);
	}
	
	public void updateByName(int traineeId, String traineeName) {
		Trainee trainee = repository.findById(traineeId);
		trainee.setTraineeName(traineeName);
		repository.save(trainee);
	}
	
	public void updateByDomain(int traineeId, String traineeDomain) {
		Trainee trainee = repository.findById(traineeId);
		trainee.setTraineeDomain(traineeDomain);
		repository.save(trainee);
		
	}
	
	public void updateByLocation(int traineeId, String traineeLocation) {
		Trainee trainee = repository.findById(traineeId);
		trainee.setTraineeLocation(traineeLocation);
		repository.save(trainee);
	}
	
	
}
