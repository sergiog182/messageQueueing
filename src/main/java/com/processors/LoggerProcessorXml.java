package com.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class LoggerProcessorXml implements Processor{
	final static Logger log = Logger.getLogger(LoggerProcessorXml.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("Country XML: " + exchange.getIn().getHeader("country", String.class));
		log.info("OrderId XML: " + exchange.getIn().getHeader("orderId", String.class));
		log.info("Provider XML: " + exchange.getIn().getHeader("provider", String.class));
		log.info("FileName XML: " + exchange.getIn().getHeader("fileName", String.class));
	}
}
