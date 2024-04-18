package com.demo.interfaces;

import java.util.Optional;

import com.demo.impl.mysql.MySqlDB;
import com.demo.impl.oracle.OracleDB;

public class MyConFactory {

	public static Optional<MyConnection> getMyConnection(String dbname) {
		if (dbname.equals("oracle")) {
			return Optional.of(new OracleDB());
		} else if (dbname.equals("mysql")) {
			return Optional.of(new MySqlDB());
		} else {
			return Optional.empty(); 
		}
	}
}
