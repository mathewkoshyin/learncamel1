package com.mkincloud.learning.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopy {
	
	public static void copyFiles(final String inPath, final String outPath) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				from("file:"+inPath+"?noop=true")
				.to("file:"+outPath);
			}
			
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		copyFiles("D:/Mathew/tech/testarea/inbox","D:/Mathew/tech/testarea/outbox");
	}
}
