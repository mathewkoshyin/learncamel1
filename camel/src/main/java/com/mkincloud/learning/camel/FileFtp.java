package com.mkincloud.learning.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileFtp {
	
	public static void ftpFiles(final String inPath) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				/*
				  from("file:"+inPath+"?noop=true")
					.to("ftp://speedtest.tele2.net");*/
				from("ftp://speedtest.tele2.net?fileName=1KB.zip")
				.to("file:"+inPath);
			}
			
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ftpFiles("D:/Mathew/tech/testarea/inbox");
	}
}
