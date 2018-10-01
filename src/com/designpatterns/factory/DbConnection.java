package com.designpatterns.factory;

import javax.sql.DataSource;

public abstract class DbConnection {
	
	public abstract DataSource getConnection();

}
