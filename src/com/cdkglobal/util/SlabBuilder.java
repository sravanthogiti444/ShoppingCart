package com.cdkglobal.util;

import java.util.ArrayList;
import java.util.List;

import com.cdkglobal.model.CustomerType;
import com.cdkglobal.model.Slab;

public class SlabBuilder {
	
	public static List<Slab> fetchSlabs(CustomerType customerType){
		
		List<Slab> slabs = new ArrayList<>();
		
		switch (customerType) {
		case REGULAR:
			
			slabs.add(new Slab(0, 5000, 0));
			slabs.add(new Slab(5000, 10000, 10));
			slabs.add(new Slab(10000, Long.MAX_VALUE, 20));
			
			break;
			
		case PREMIUM:
			
			slabs.add(new Slab(0, 4000, 10));
			slabs.add(new Slab(4000, 8000, 15));
			slabs.add(new Slab(8000, 12000, 20));
			slabs.add(new Slab(12000, Long.MAX_VALUE, 30));
			
			break;

		default:
			break;
		}
		
		return slabs;
		
	}
	

}
