package com.lti.demos;

public class Customer {
	
	private int custNo;
	private String name;
	private double billAmount;
	

	public Customer() {
		super();
	}
		
	public Customer(int custNo, String name, double billAmount) {
		super();
		this.custNo = custNo;
		this.name = name;
		this.billAmount = billAmount;
	}
	
	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", name=" + name + ", billAmount=" + billAmount + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
