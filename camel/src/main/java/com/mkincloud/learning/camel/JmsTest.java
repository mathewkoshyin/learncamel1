package com.mkincloud.learning.camel;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class JmsTest {
	
	public static void putFiles(final String inPath) throws Exception {
		ConnectionFactory connectionFactory =
		    new ActiveMQConnectionFactory("vm://localhost");
		
		CamelContext context = new DefaultCamelContext();
		context.addComponent("jms",JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				from("file:"+inPath+"?noop=true")
				.process(new Processor() {

					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						System.out.println("We just downloaded: "+exchange.getIn().getHeader("CamelFileName"));
					}})
				.to("jms:incomingOrders")
				.to("file:D:/Mathew/tech/testarea/outbox");
			}
			
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		putFiles("D:/Mathew/tech/testarea/inbox");
	}
}
