package com.grouptheamigos.elitas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grouptheamigos.elitas.enitities.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {

}
