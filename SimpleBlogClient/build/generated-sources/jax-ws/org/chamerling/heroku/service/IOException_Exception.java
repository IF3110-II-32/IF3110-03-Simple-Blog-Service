
package org.chamerling.heroku.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IOException", targetNamespace = "http://service.heroku.chamerling.org/")
public class IOException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IOException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IOException_Exception(String message, IOException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IOException_Exception(String message, IOException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.chamerling.heroku.service.IOException
     */
    public IOException getFaultInfo() {
        return faultInfo;
    }

}
