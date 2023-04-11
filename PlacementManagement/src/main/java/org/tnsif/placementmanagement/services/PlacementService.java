package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.Placement;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.repository.PlacementRepository;
import org.tnsif.placementmanagement.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class PlacementService {
	private PlacementRepository repo;
	//addition/creation/insertion
	public void add(Placement placement)
	{
		
		repo.save(placement);
	}
	
	//retrieve with specified id
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
	 repo.deleteById(id);	
	}
	
	
	public List<Placement>retriveAll()
	{
		return repo.findAll();
	}


}
