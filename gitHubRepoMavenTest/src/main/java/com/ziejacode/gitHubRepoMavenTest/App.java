package com.ziejacode.gitHubRepoMavenTest;

import java.util.ArrayList;
import java.util.List;

public class App{
    
	

	private static  double payeRate1 = 0.2;
	private static  double payeRate2 = 0.4;
	private static  double taxCreditAmount = 64.5;
	
	private  static double PRSIRate = 0.04;
	
	public static void main(String[] args) {

		App us = new App();
		
		for(double d: us.calculateMyTax(543)) {
			System.out.println("- " + d + " - ");
		}		
		System.out.println("Sorteds");
	}
	
	
	public List<Double> calculateMyTax(double wage) {
		
		List<Double> taxes = new ArrayList<Double>();
		
		double paye = wage * payeRate1 - taxCreditAmount;
		taxes.add(paye);
		
		double prsi = wage * PRSIRate;
		taxes.add(prsi);
		
		
		return taxes;
	}


}
