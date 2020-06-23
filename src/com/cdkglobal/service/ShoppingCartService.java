package com.cdkglobal.service;

import com.cdkglobal.model.Customer;
import com.cdkglobal.util.DiscountCalculator;
import com.cdkglobal.util.SlabBuilder;

public class ShoppingCartService {
	
	public long calculateBill(Customer customer, long purchaseAmount) {
		return DiscountCalculator.calculate(purchaseAmount, SlabBuilder.fetchSlabs(customer.getCustomerType()));
	}

}
