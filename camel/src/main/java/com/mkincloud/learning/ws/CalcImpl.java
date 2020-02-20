package com.mkincloud.learning.ws;

import javax.jws.WebService;

/*
 * Basic calculator
 */

@WebService(endpointInterface = "com.mk.learning.ws.CalcEndPoint")
public class CalcImpl implements CalcEndPoint {

	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int mult(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
