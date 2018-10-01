package com.designpatterns.factory;

import javax.sql.DataSource;

public class OracleDbConnection extends DbConnection {
	public  OracleDbConnection() {
	}

	@Override
	public DataSource getConnection() {
		System.out.println("Construting Oracle DB Connection");
		return null;
	}

}
