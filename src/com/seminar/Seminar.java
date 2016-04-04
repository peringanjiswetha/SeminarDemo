package com.seminar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seminar {
	public final String seminarName = "From aptamers to SOMAmers (with remarkable structures) to proteomics on a grand scale: Monitoring disease and wellness";
	public String startTime;
	public String endTime;
	
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyy (EEE)");
	String date = sdf.format(d);
	
	public Seminar(String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
}
