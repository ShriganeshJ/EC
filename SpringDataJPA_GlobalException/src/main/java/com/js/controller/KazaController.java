package com.js.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.js.entity.KarzaEntity;
import com.js.exception.RecordNotFoundExcepiton;
import com.js.service.KarzaService;

@RestController
public class KazaController {
	@Autowired
	private KarzaService service;

	@PostMapping("/addKarza")
	public KarzaEntity saveKarzaData(@RequestBody KarzaEntity karzaEntity) {
		return service.saveKarzaData(karzaEntity);
	}

	@PostMapping("/addKarzaBatch")
	public List<KarzaEntity> saveKarzaDataList(@RequestBody List<KarzaEntity> list) {
		return service.saveKarzaDataBatch(list);
	}

	@GetMapping("/getAllKarzaData")
	public List<KarzaEntity> getKarzaAll() {
		return service.getKarzaAll();
	}

	@GetMapping("/getKarzaData/{id}")
	public KarzaEntity getkarzaId(@PathVariable int id) {
		return service.getById(id);
	}

	/*
	 * @GetMapping("/getKarzaData/{rc}") public KarzaEntity getkarzaId(@PathVariable
	 * String rcNumber) { return service.getByRcNumber(rcNumber); }
	 */
	
	
	@PutMapping("/updateKarza")
	public KarzaEntity saveUpdateKarzaData(@RequestBody KarzaEntity karzaEntity) {
		return service.updateKarzaData(karzaEntity);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable int id) throws RecordNotFoundExcepiton  {
		return service.delete(id);
	}
	
	

}
