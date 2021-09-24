package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.KarzaRepositry;
import com.js.entity.KarzaEntity;
import com.js.exception.RecordNotFoundExcepiton;

@Service
public class KarzaService {
	@Autowired
	private KarzaRepositry karzaRepositry;

	public KarzaEntity saveKarzaData(KarzaEntity entity) {
		return karzaRepositry.save(entity);
	}

	public List<KarzaEntity> saveKarzaDataBatch(List<KarzaEntity> entityBatch) {
		return karzaRepositry.saveAll(entityBatch);
	}

	public List<KarzaEntity> getKarzaAll() {
		return karzaRepositry.findAll();
	}

	public KarzaEntity getById(int id) {
		return karzaRepositry.findById(id).orElse(null);
	}

	/*
	 * public KarzaEntity getByRcNumber(String rcNumber) { return
	 * karzaRepositry.findByRC_Number(rcNumber); }
	 */

	public String delete(int id) throws RecordNotFoundExcepiton {
		
		try
		{
		karzaRepositry.deleteById(id);
		}
		catch (Exception e) {
			// TODO: handle exception
			
			throw new RecordNotFoundExcepiton(e.getMessage());
		}
		
		

		return "Product Deleted" + id;
	}
	
	public KarzaEntity updateKarzaData(KarzaEntity entity)
	{
		KarzaEntity entityExist = karzaRepositry.findById(entity.getAgg_id()).orElse(null);
		
		entityExist.setAgg_id(entity.getAgg_id());
		entityExist.setName(entity.getName());
		entityExist.setEng_number(entity.getEng_number());
		entityExist.setChasiess_number(entity.getChasiess_number());
		entityExist.setRc_number(entity.getRc_number());
		entityExist.setTime(entity.getTime());
		return karzaRepositry.save(entityExist);
	}

}
