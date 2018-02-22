
package ws.api;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "login", targetNamespace = "http://api.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Login {


    /**
     * 
     * @param pass
     * @param user
     * @param key
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logear", targetNamespace = "http://api.ws/", className = "ws.api.Logear")
    @ResponseWrapper(localName = "logearResponse", targetNamespace = "http://api.ws/", className = "ws.api.LogearResponse")
    @Action(input = "http://api.ws/login/logearRequest", output = "http://api.ws/login/logearResponse")
    public int logear(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pass", targetNamespace = "")
        String pass,
        @WebParam(name = "key", targetNamespace = "")
        String key);

}