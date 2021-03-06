
package servicexml;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MalformedURLException", targetNamespace = "http://ServiceXML/")
public class MalformedURLException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MalformedURLException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MalformedURLException_Exception(String message, MalformedURLException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MalformedURLException_Exception(String message, MalformedURLException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: servicexml.MalformedURLException
     */
    public MalformedURLException getFaultInfo() {
        return faultInfo;
    }

}
