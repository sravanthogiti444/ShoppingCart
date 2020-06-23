package com.cdkglobal.util;

import java.util.List;

import com.cdkglobal.model.Slab;

public class DiscountCalculator {
	
	public static long calculate(long purchaseAmount, List<Slab> slabs) {
		
		long discountAmount = 0;
		
		for (Slab slab : slabs) {
			if(slab.getMax() <= purchaseAmount || (slab.getMin() <= purchaseAmount && purchaseAmount <= slab.getMax())) {
				long onDiscountAmount = Math.min(slab.getMax()-slab.getMin(), purchaseAmount-slab.getMin());
				discountAmount =  discountAmount + (onDiscountAmount * (100 - slab.getDiscount()))/100;
			}else {
				break;
			}
		}
		
		
		return discountAmount;
		
	}
	
}
