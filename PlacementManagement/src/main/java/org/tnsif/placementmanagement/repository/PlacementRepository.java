package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Placement;
import org.tnsif.placementmanagement.entites.Student;

public interface PlacementRepository extends JpaRepository<Placement,Integer> {

}
