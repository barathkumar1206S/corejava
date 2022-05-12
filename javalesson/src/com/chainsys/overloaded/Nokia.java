package com.chainsys.overloaded;

public class Nokia extends Phone {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Nokia ph=new Nokia();
	 //ph.makeCall();
	    ph.sendSms();
	    ph.makeCall();
	}
public void makeCall() {
       System.out.println("call made from nokia");
    }

}

