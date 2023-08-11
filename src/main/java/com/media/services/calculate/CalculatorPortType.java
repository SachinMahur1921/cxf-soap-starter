package com.media.services.calculate;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.1
 * 2023-08-10T11:56:57.978+05:30
 * Generated source version: 4.0.1
 *
 */
@WebService(targetNamespace = "http://media.com/services/calculate", name = "Calculator_PortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CalculatorPortType {

    @WebMethod(action = "http://media.com/services/calculate/addition")
    @WebResult(name = "output", targetNamespace = "http://media.com/services/calculate", partName = "outputData")
    public Output addition(

        @WebParam(partName = "inputData", name = "AdditionInput", targetNamespace = "http://media.com/services/calculate")
        AdditionInput inputData
    );

    @WebMethod(action = "http://media.com/services/calculate/multiplication")
    @WebResult(name = "output", targetNamespace = "http://media.com/services/calculate", partName = "outputData")
    public Output multiplication(

        @WebParam(partName = "inputData", name = "MultiplicationInput", targetNamespace = "http://media.com/services/calculate")
        MultiplicationInput inputData
    );

    @WebMethod(action = "http://media.com/services/calculate/division")
    @WebResult(name = "output", targetNamespace = "http://media.com/services/calculate", partName = "outputData")
    public Output division(

        @WebParam(partName = "inputData", name = "DivisionInput", targetNamespace = "http://media.com/services/calculate")
        DivisionInput inputData
    );

    @WebMethod(action = "http://media.com/services/calculate/substraction")
    @WebResult(name = "output", targetNamespace = "http://media.com/services/calculate", partName = "outputData")
    public Output subtraction(

        @WebParam(partName = "inputData", name = "SubtractionInput", targetNamespace = "http://media.com/services/calculate")
        SubtractionInput inputData
    );
}