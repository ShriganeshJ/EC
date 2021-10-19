package com.syn.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateApi06 {
	
	public static void main(String[] args) {
		
		
		//zone and zone id
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("Zone is "+zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println("Dow Time is  "+ dt);
		
		
	}

}
