package com.mkincloud.learning.ws;

import javax.xml.ws.Endpoint;

public class CalcPublisher {
	public static void main(String[] args)
	   {
	      Endpoint.publish("http://localhost:9905/Calc", new CalcImpl());
	   }
}
