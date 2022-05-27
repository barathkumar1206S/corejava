package com.chainsys.oops;

public class HierarchicalSurya extends HierarchicalSiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalSurya suryaObj=new HierarchicalSurya();
		suryaObj.act();
	}
	void produce() {
		System.out.println("Producing");
	}
	public void act() {
		System.out.println("SuryaActing");
	}


}
