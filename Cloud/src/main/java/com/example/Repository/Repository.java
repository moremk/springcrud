package com.example.Repository;
import com.example.Entity.EntityData;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface Repository extends JpaRepository <EntityData,Integer> {

	
	
}
