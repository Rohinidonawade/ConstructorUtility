package com.vstl.assignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class UtilityFaceBookPage {
	
	         //RandomMobileNumber
       public String getMobileNumber(int intLeght) {
		
   		String strArray[] = {"99","98","89","73","63"};		
   		String strFirstNumber = strArray[new Random().nextInt(strArray.length)];  		
   		
		String allowChar ="0123456789";
		String randomString = " ";       
		      		
	for(int intIndex=0; intIndex<intLeght-2; intIndex++) {
			int intNum =(int) Math.floor(Math.random()*allowChar.length());
			
			randomString+=allowChar.substring(intNum,intNum+1);			
		}	 
	return strFirstNumber.concat(randomString).trim();    
        }	
	
          //Date and time(current)
	public String getDateAndTimeFormat() {
	
		String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(Calendar.getInstance().getTime());
		
		System.out.println(date); 
		
		return date;			
	}
		
	      //RandomDate
	public String getRandomDate() {
		try {			
			String strRandomDate=" ";
			int intRandomDate = (int) (Math.random()*30);
			if(intRandomDate==0);
			    strRandomDate="28";
			    strRandomDate = String.valueOf(intRandomDate).trim();
			    return strRandomDate;				
			}catch(Exception exception) {
				System.out.println("Error msg==>"+ exception.getMessage());
		return "";
		}
	}
	
	   //RandomString
	 public String getRandomString(int intLeght) {
		
			String allowChar ="qwertyuiopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM";
			String randomString = " ";       
			      		
		for(int intIndex=0; intIndex<intLeght; intIndex++) {
				int intNum =(int) Math.floor(Math.random()*allowChar.length());
				
				randomString+=allowChar.substring(intNum,intNum+1);			
			}	 
		return randomString;    
	        }
	 
	     //RandomNumberWithString
	 public String getRandomNumberWithString(int intLeght) {
			
			String allowChar ="0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
			String randomString = " ";       
			      		
		for(int intIndex=0; intIndex<intLeght; intIndex++) {
				int intNum =(int) Math.floor(Math.random()*allowChar.length());
				
				randomString+=allowChar.substring(intNum,intNum+1);			
			}	 
		return randomString;    
	        }
	
	    //RandomNumberWithSpecialCharecter
	 
	 public String getRandomNumberWithSpecialCharecter(int intLeght) {
			
			String allowChar ="0123456789!@#$%^&*?~";
			String randomString = " ";       
			      		
		for(int intIndex=0; intIndex<intLeght; intIndex++) {
				int intNum =(int) Math.floor(Math.random()*allowChar.length());
				
				randomString+=allowChar.substring(intNum,intNum+1);			
			}	 
		return randomString;    
	        }
}


