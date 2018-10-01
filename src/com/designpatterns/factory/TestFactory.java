package com.designpatterns.factory;

import javax.sql.DataSource;

public class TestFactory {

	public static void main(String[] args) {

		DataSource connection = DatabaseConnectionFactory.getDbConnection(DatabaseType.MSSQL);
		

	}

}
