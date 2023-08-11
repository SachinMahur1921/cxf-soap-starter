package com.spring.camelRoutes;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

 
 @Component
public class camel_ws  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		  from("cxf:/hello?serviceClass=com.media.services.calculate.CalculatorPortType&dataFormat=pojo").to("bean:CalculaterResult?method=multiplication");
		    		
	}

}
