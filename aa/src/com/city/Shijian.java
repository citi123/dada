package com.city;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Shijian {
	public static void main(String[] args) throws Exception{
		System.out.println("[8:00~10:00],[16:00,20:00]:" + compare("08:00", "10:00", "16:00", "20:00"));
		System.out.println("[8:00~10:00],[09:00,20:00]:" + compare("08:00", "10:00", "09:00", "20:00"));
		System.out.println("[8:00~10:00],[10:00,20:00]:" + compare("08:00", "10:00", "10:00", "20:00"));
		System.out.println("[16:00~20:00],[08:00,10:00]:" + compare("16:00", "20:00", "08:00", "10:00"));
		System.out.println("[16:00~20:00],[08:00,20:00]:" + compare("16:00", "20:00", "08:00", "20:00"));
		
	}
	
	static boolean compare(String startTime1 , String endTime1,String startTime2 , String endTime2) throws Exception{
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date startDate1 = dateFormat.parse(startTime1);
		Date endDate1 = dateFormat.parse(endTime1);
		
		Date startDate2 = dateFormat.parse(startTime2);
		Date endDate2 = dateFormat.parse(endTime2);
		
		
		if(startDate1.before(endDate1) && startDate2.before(endDate2)){
			if(endDate1.equals(startDate2) || endDate1.equals(startDate1)){
				return true;
			}
			if(startDate1.equals(startDate2) || endDate1.equals(endDate2)){
				return false;
			}
			if(startDate1.before(startDate2)){
				if(endDate1.before(startDate2)){
					return true;
				}
			}
			if(startDate1.after(startDate2)){
				if(endDate1.after(startDate2)){
					return true;
				}
			}
		}
		
		return false;
	}
}
