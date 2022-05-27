package com.vstl.assignment;

import com.vstl.javatraining.StringConcatenation;

public class TestFaceBookPage {


	public static void main(String[] args) {

		FaceBookPage objFaceBookPage = new FaceBookPage();
		UtilityFaceBookPage objUtilityFaceBookPage = new UtilityFaceBookPage();
		
		objFaceBookPage.setMobileNumber(objUtilityFaceBookPage.getMobileNumber(8));
		
		objFaceBookPage.setDateAndTime(objUtilityFaceBookPage.getDateAndTimeFormat());
		
		objFaceBookPage.setDate(objUtilityFaceBookPage.getRandomDate());
		
		objFaceBookPage.setRandomString(objUtilityFaceBookPage.getRandomString(9).toLowerCase());
		
		objFaceBookPage.setRandomNumberWithString(objUtilityFaceBookPage.getRandomNumberWithString(10).toUpperCase());
		
		objFaceBookPage.setRandomNumberWithSpecialCharecter(objUtilityFaceBookPage.getRandomNumberWithSpecialCharecter(10));

	}

}
