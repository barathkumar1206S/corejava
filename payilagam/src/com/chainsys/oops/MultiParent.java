package com.chainsys.oops;

public class MultiParent extends MultiGrandParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiParent parentObj=new MultiParent();
		parentObj.doAgri();

	}
	void doAgri() {
		System.out.println("Agriculturing");
	}
	public void doAudit() {
		System.out.println("Auditing");
		
	}


}
