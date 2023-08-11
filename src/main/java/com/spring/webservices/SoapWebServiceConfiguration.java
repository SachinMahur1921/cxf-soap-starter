package com.spring.webservices;


import org.apache.camel.component.cxf.common.DataFormat;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.http.HttpDestinationFactory;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.apache.cxf.transport.servlet.ServletDestinationFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

import com.media.services.calculate.CalculatorPortType;

@EnableWs
@Configuration
 
public class SoapWebServiceConfiguration extends WsConfigurerAdapter {
	 
     
	@Bean
	public HttpDestinationFactory httpDestinationFactory()
	{
		return new ServletDestinationFactory();
	}
	
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(applicationContext);
        
        return new ServletRegistrationBean<>(messageDispatcherServlet, "/media/ws/*");
    }
    
  
   
//    @Bean("cxfEndpoint")
//    public CxfEndpoint requestEndpoint( SpringBus bus) throws ClassNotFoundException {
//    	 CxfEndpoint endpoint = new CxfEndpoint();
////	      endpoint.setAddress("/soap/hello");
//	      
////	      endpoint.setBus(bus);
//	      
//	      endpoint.setDataFormat(DataFormat.POJO);
//	    
//	      endpoint.setServiceClass(CalculatorPortType.class);
//	       endpoint.setWsdlURL("wsdl/calculater.wsdl");
//       return endpoint;
//    }
   
    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/services/*");
    }
    
    @Bean(name = "calculater")
    public Wsdl11Definition wsdl11Definition() {
        SimpleWsdl11Definition simpleWsdl11Definition = new SimpleWsdl11Definition();
        simpleWsdl11Definition.setWsdl(new ClassPathResource("/wsdl/calculater.wsdl"));
        return simpleWsdl11Definition;
    }
    @Bean
    public SpringBus cxf(HttpDestinationFactory destinationFactory) {  
    	SpringBus bus= new SpringBus();
    	bus.setExtension(destinationFactory, HttpDestinationFactory.class);
    	 return new SpringBus();
    }
     
  
    
}
