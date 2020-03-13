package com.balram.springcore.list;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> departtmentsName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDeparttmentsName() {
		return departtmentsName;
	}

	public void setDeparttmentsName(List<String> departtmentsName) {
		this.departtmentsName = departtmentsName;
	}

}
