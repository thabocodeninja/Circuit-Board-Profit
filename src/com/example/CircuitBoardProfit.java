package com.example;
import javax.swing.JOptionPane;

public class CircuitBoardProfit {

	public static void main(String[] args) {
	
		final double PROFIT_PERCENTAGE = 0.4;
		double userRetailPrice;
		double companyProfit;
		
		String userOutputString =JOptionPane.showInputDialog("Please enter the retail price of the product");
		userRetailPrice = Double.parseDouble(userOutputString);

		companyProfit = PROFIT_PERCENTAGE * userRetailPrice;
		JOptionPane.showMessageDialog(null, "The profit earned on " +userRetailPrice +"is" +companyProfit );
		System.exit(0);
	}

}
