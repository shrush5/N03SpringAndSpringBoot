package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
