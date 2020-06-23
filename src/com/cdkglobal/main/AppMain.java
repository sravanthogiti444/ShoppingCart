package com.cdkglobal.main;

import com.cdkglobal.model.Customer;
import com.cdkglobal.model.CustomerType;
import com.cdkglobal.service.ShoppingCartService;

public class AppMain {

	public static void main(String[] args) {
		
		ShoppingCartService service = new ShoppingCartService();
		
		// Checking the test cases given in the document
		
		System.out.println(service.calculateBill(new Customer(1L, "Regular1", CustomerType.REGULAR), 5000));
		System.out.println(service.calculateBill(new Customer(1L, "Regular2", CustomerType.REGULAR), 10000));
		System.out.println(service.calculateBill(new Customer(1L, "Regular3", CustomerType.REGULAR), 15000));
		
		System.out.println(service.calculateBill(new Customer(1L, "Premium1", CustomerType.PREMIUM), 4000));
		System.out.println(service.calculateBill(new Customer(1L, "Premium2", CustomerType.PREMIUM), 8000));
		System.out.println(service.calculateBill(new Customer(1L, "Premium3", CustomerType.PREMIUM), 12000));
		System.out.println(service.calculateBill(new Customer(1L, "Premium4", CustomerType.PREMIUM), 20000));

	}

}
