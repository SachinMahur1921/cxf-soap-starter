//package com.spring.camelRoutes;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.xml.namespace.QName;
//
//import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
//import org.springframework.stereotype.Component;
//
//import jakarta.inject.Named;
//
//@Component
//
//	@Named("registration")
//	@ApplicationScoped
//	public class SoapServiceBean extends CxfEndpoint {
//
//	    public SoapServiceBean() {
//	        super();
//
//
//           QName serviceQname = new QName("http://media.com/services/calculate/", "Calculator_Service");    // From WSDL :: <wsdl:service name="registrationService">
//	       this.setServiceNameAsQName(serviceQname);
//
//	       QName endpointQname = new QName("http://media.com/services/calculate/", "Calculator_PortType");    // From WSDL :: <wsdl:port name="registrationPort">
//	       this.setEndpointNameAsQName(endpointQname);
//
//	       this.setAddress("http://localhost:8080/soap/registration");                    // Exposed address with the /soap root context defined in application.properties
//
//	    
//	}
//}
