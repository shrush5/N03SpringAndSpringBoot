package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entites.Student;
import org.tnsif.placementmanagement.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	private StudentRepository repo;
	//addition/creation/insertion
	public void add(Student student)
	{
		repo.save(student);
	}
	
	//retrieve with specified id
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
	 repo.deleteById(id);	
	}
	
	
	public List<Student>retriveAll()
	{
		return repo.findAll();
	}

}
