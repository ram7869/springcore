package com.balram.springcore.property.placeholder;

public class MyDao {
	
	private String dbServer;

	
	
	public MyDao(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

}
