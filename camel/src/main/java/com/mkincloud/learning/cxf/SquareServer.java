package com.mkincloud.learning.cxf;

import org.apache.cxf.frontend.ServerFactoryBean;

public class SquareServer {

	  protected SquareServer() {
	      ServerFactoryBean factory = new ServerFactoryBean();
	      factory.setServiceClass(SquareNumber.class);
	      factory.setAddress("http://localhost:5000/Square");
	      factory.setServiceBean(new SquareNumImpl());
	      factory.create();
	   }
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	     new SquareServer();
	     System.out.println("Listening on port 5000 ...");
	     Thread.sleep(5 * 60 * 1000);
	     System.out.println("Server exiting ...");
	     System.exit(0);
	}

}
