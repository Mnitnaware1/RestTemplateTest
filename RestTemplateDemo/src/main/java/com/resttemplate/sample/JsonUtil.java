package com.resttemplate.sample;

import com.google.gson.Gson;

public class JsonUtil {
	
	public static void main(String[]args) {
		//Employee emp = new Employee(101, "minal");
		//toJson(emp);
	}
	public static String toJson(Employee employee) {
		
		Gson gson = new Gson();
		System.err.println(gson.toJson(employee));
		return gson.toJson(employee);
	}
}
