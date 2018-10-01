package com.designpatterns.factory;

import javax.sql.DataSource;

public class DatabaseConnectionFactory {

	public static DataSource getDbConnection(DatabaseType dbType) {
		switch (dbType) {
		case ORACLE:
			return new OracleDbConnection().getConnection();
		case MSSQL:
			return new MssqlDbConnection().getConnection();
		default:
			return null;
		}

	}

}
