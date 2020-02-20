package com.mkincloud.learning.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalcEndPoint {
	@WebMethod int add(int num1, int num2);
	@WebMethod int mult(int num1, int num2);
}
