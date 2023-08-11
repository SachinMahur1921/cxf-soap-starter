package com.spring.webservices;


import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.media.services.calculate.AdditionInput;
import com.media.services.calculate.DivisionInput;
import com.media.services.calculate.MultiplicationInput;
import com.media.services.calculate.ObjectFactory;
import com.media.services.calculate.Output;
import com.media.services.calculate.SubtractionInput;

import jakarta.inject.Named;
import jakarta.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Endpoint
@Component("CalculaterResult")


 @WebService
 
public class Calculator {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ResponsePayload
    @PayloadRoot(namespace = "http://media.com/services/calculate", localPart = "AdditionInput")
    public Output addition(@RequestPayload AdditionInput input){
        logger.info("Request received for addition with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        Output output = objectFactory.createOutput();
        output.setResult(input.getNumber1() + input.getNumber2());
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://media.com/services/calculate", localPart = "SubtractionInput")
    public Output subtraction(@RequestPayload SubtractionInput input){
        logger.info("Request received for addition with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        Output output = objectFactory.createOutput();
        output.setResult(input.getNumber1() - input.getNumber2());
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://media.com/services/calculate", localPart = "MultiplicationInput")
    public Output multiplication(@RequestPayload MultiplicationInput input){
        logger.info("Request received for addition with input "+input);
        ObjectFactory objectFactory = new ObjectFactory();
        Output output = objectFactory.createOutput();
        output.setResult(input.getNumber1() * input.getNumber2());
        return output;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = "http://media.com/services/calculate", localPart = "DivisionInput")
    public Output division(@RequestPayload DivisionInput input){
        logger.info("Request received for addition with input "+input);
        if(input.getNumber2() == 0){
            throw new IllegalArgumentException("Divisor can't be null");
        }
        ObjectFactory objectFactory = new ObjectFactory();
        Output output = objectFactory.createOutput();
        output.setResult(input.getNumber1() + input.getNumber2());
        return output;
    }
}
