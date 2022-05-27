package com.chainsys.oops;

public class HierarchicalKarthi extends HierarchicalSiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HierarchicalKarthi karthiObj=new  HierarchicalKarthi();
		 karthiObj.act();
		 karthiObj.produce();
		

	}
	 
	void produce() {
		System.out.println("KarthiProducing");
	}
	public void act() {
		System.out.println("KarthiActing");
	}

}
