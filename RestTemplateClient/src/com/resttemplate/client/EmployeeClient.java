package com.resttemplate.client;

import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

public class EmployeeClient {
	private static final Logger logger = Logger.getLogger(EmployeeClient.class.getName());
	final static String uri = "http://localhost:8089/RestTemplateDemo/employees";

	public static void main(String[] args) {
		getEmployee();
		createEmployee();
	}

	private static void getEmployee() {
		final String uri = "http://localhost:8089/RestTemplateDemo/getEmployee";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		// System.out.println(result);
	}

	private static void createEmployee() { 

		try {
			Employee employee = new Employee();
			employee.setEmpId(1);
			employee.setEmpName("eewew");
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(new Gson().toJson(employee), headers);
			Employee postForObject = restTemplate.postForObject(uri, entity, Employee.class);
			System.err.println("Employee data " + postForObject);
		}
		catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
