package com.chainsys.oops;



public class MultiGrandChild extends MultiParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiGrandChild gcObj=new MultiGrandChild();
		gcObj.engineering();
		gcObj.doAgri();
		gcObj.doAudit();
	}
	void doRide() {
		System.out.println("Riding");
	}
	public void engineering() {
		System.out.println("engineer");
	}

}
