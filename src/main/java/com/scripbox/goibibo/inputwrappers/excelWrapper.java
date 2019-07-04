package com.scripbox.goibibo.inputwrappers;

/*The purpose of this class is to fetch the column value from the data sheet.*/

public class excelWrapper {
	private excelParser params;
	private int idx;
	
	public excelWrapper(excelParser params, int idx) {
		super();
		this.params = params;
		this.idx = idx;
		
	}
	
	public String getTestname() {
		
	return params.getCellValueType("Testname", idx);
		
	}
	
	public String getFromAirport() {
		return params.getCellValueType("fromAirport", idx);
	}
	
	public String getToAirport() {
		return params.getCellValueType("toAirport", idx);
	}
	
	public String getFromDate() {
		return params.getCellValueType("fromDate", idx);
	}
	
	public String getToDate() {
		return params.getCellValueType("toDate", idx);
	}
	
	public String getoneWayFlag() {
		return params.getCellValueType("oneWay", idx);
	}

	public String getRoundTrip() {
		return params.getCellValueType("roundTrip", idx);
	}
	
	public String getMultiTrip() {
		return params.getCellValueType("multiTrip", idx);
	}
	
	public String getStudentFare() {
		return params.getCellValueType("studentFare", idx);
	}

}
