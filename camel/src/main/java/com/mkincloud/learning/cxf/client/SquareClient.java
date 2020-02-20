package com.mkincloud.learning.cxf.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import com.mkincloud.learning.cxf.SquareNumber;

public class SquareClient {

	public static void main(String[] args) throws Exception {
	      ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
	      factory.setAddress("http://localhost:5000/Square");
	      SquareNumber server = factory.create(SquareNumber.class);
	      System.out.println("Square of 10 is " + server.square(10));
	   }
	
}
