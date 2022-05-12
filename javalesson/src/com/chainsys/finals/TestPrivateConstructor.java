package com.chainsys.finals;

public class TestPrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPrivateConstructor();

	}
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
		ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}

}
