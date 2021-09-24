package com.js.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.js.entity.KarzaEntity;

public class test {
	
	
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper jp = new ObjectMapper();
		KarzaEntity ent = new KarzaEntity();
		String json=jp.writeValueAsString(ent);
		
		System.out.println(json);
	}

}
