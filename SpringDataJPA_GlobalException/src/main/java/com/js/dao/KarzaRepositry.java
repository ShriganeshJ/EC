package com.js.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js.entity.KarzaEntity;
@Repository
public interface KarzaRepositry extends JpaRepository<KarzaEntity,Integer> {

	//KarzaEntity findByRC_Number(String rcNumber);

	
	
}
