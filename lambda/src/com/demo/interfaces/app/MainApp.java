package com.demo.interfaces.app;

import java.util.Optional;

import com.demo.impl.mysql.MySqlDB;
import com.demo.interfaces.MyConFactory;
import com.demo.interfaces.MyConnection;

public class MainApp {

	public static void main(String[] args) {
		Optional<MyConnection> con=MyConFactory.getMyConnection("sqlserver");
		
		if(con.isPresent()) {
		System.out.println(MyConnection.releaseVer);
		System.out.println(con.get().getConnectionInfo());
		System.out.println(con.get().getDbDetails());
		}else {
			System.out.println("Not yet Implemented..");
		}

	}

}
