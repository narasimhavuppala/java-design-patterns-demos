package com.designpatterns.factory;

import javax.sql.DataSource;

public class MssqlDbConnection extends DbConnection {

	@Override
	public DataSource getConnection() {

		System.out.println("Constructing MSSQL db connection");
		return null;
	}

}
