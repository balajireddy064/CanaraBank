package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repo.DemoRepo;

@RestController
@RequestMapping("/can")
public class DemoController {
	
	@Autowired
	private DemoRepo rep;
	
	@PostMapping("/add")
	public DemoEntity add(@RequestBody DemoEntity enty) {
		return rep.save(enty);
	}

	public String get() {
		return "well come ";
	}
	
}
