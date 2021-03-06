
package com.apress.ejb.chapter06.services.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreditCheckEndpointBean", targetNamespace = "http://www.apress.com/ejb/credit")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreditCheckEndpointBean {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CreditCheck")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreditCheck", targetNamespace = "http://www.apress.com/ejb/credit", className = "com.apress.ejb.chapter06.services.client.CreditCheck")
    @ResponseWrapper(localName = "CreditCheckResponse", targetNamespace = "http://www.apress.com/ejb/credit", className = "com.apress.ejb.chapter06.services.client.CreditCheckResponse")
    @Action(input = "http://www.apress.com/ejb/credit/CreditCheckEndpointBean/CreditCheckRequest", output = "http://www.apress.com/ejb/credit/CreditCheckEndpointBean/CreditCheckResponse")
    public boolean creditCheck(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
