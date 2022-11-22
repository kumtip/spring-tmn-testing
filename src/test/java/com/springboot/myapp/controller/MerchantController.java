package com.springboot.myapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {

	@GetMapping(path = "/merchantnoti/callback", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> callback() {
		//Get data from service layer into entityList.
		
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		/*
        List<HashMap> entities = new ArrayList<HashMap>();
        for (Entity n : entities) {
        	HashMap entity = new HashMap();
            entity.put("aa", "bb");
            entities.add(entity);
        }*/
        return null;//new ResponseEntity<Object>(entities, HttpStatus.OK);
	}
}
