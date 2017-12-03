package com.resttemplate.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

/*
 * Author :Minal
 */
@RestController
public class EmployeeController {

	@RequestMapping(value = "getEmployee", method = RequestMethod.GET)
	public String getEmpoyee() {
		return "hello";
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		System.out.println("=============>" + employee);
		return new ResponseEntity<String>(JsonUtil.toJson(employee), HttpStatus.OK);
	}
}
