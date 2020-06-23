package com.cdkglobal.model;

public class Slab {
	
	private long min;
	private long max;
	private int discount;
	
	public Slab(long min, long max, int discount) {
		super();
		this.min = min;
		this.max = max;
		this.discount = discount;
	}
	
	public long getMin() {
		return min;
	}
	public void setMin(long min) {
		this.min = min;
	}
	public long getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
