package com.demo.dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.demo.entity.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmpDB {

	public static List<Employee> getEmpList() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(new File("employees.json"), new TypeReference<List<Employee>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
