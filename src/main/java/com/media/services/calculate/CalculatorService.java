package com.media.services.calculate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * Calculator Service
 *
 * This class was generated by Apache CXF 4.0.1
 * 2023-08-10T11:56:58.073+05:30
 * Generated source version: 4.0.1
 *
 */
@WebServiceClient(name = "Calculator_Service",
                  wsdlLocation = "file:/C:/Users/Administrator/Downloads/webservices/webservices/src/main/resources/wsdl/calculater.wsdl",
                  targetNamespace = "http://media.com/services/calculate")
public class CalculatorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://media.com/services/calculate", "Calculator_Service");
    public final static QName CalculatorPortType = new QName("http://media.com/services/calculate", "Calculator_PortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Administrator/Downloads/webservices/webservices/src/main/resources/wsdl/calculater.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculatorService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Administrator/Downloads/webservices/webservices/src/main/resources/wsdl/calculater.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CalculatorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CalculatorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CalculatorPortType
     */
    @WebEndpoint(name = "Calculator_PortType")
    public CalculatorPortType getCalculatorPortType() {
        return super.getPort(CalculatorPortType, CalculatorPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorPortType
     */
    @WebEndpoint(name = "Calculator_PortType")
    public CalculatorPortType getCalculatorPortType(WebServiceFeature... features) {
        return super.getPort(CalculatorPortType, CalculatorPortType.class, features);
    }

}
