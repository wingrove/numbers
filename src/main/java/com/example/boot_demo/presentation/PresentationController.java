package com.example.boot_demo.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot_demo.pojo.Property;
import com.example.boot_demo.service.BusinessService;

@RestController
public class PresentationController {

	private BusinessService bs;

	@Autowired
	public PresentationController(BusinessService bs) {
		this.bs = bs;
	}

	@RequestMapping("service")
	public ResponseEntity<List<String>> service(String number) {
		List<String> numbers = bs.letterCombinations(number);
		return ResponseEntity.accepted().body(numbers);
	}
}
