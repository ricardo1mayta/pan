
package ws.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "regUltimo", targetNamespace = "http://api.ws/", wsdlLocation = "http://192.168.1.212:8080/WSservidor/regUltimo?wsdl")
public class RegUltimo_Service
    extends Service
{

    private final static URL REGULTIMO_WSDL_LOCATION;
    private final static WebServiceException REGULTIMO_EXCEPTION;
    private final static QName REGULTIMO_QNAME = new QName("http://api.ws/", "regUltimo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.212:8080/WSservidor/regUltimo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGULTIMO_WSDL_LOCATION = url;
        REGULTIMO_EXCEPTION = e;
    }

    public RegUltimo_Service() {
        super(__getWsdlLocation(), REGULTIMO_QNAME);
    }

    public RegUltimo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGULTIMO_QNAME, features);
    }

    public RegUltimo_Service(URL wsdlLocation) {
        super(wsdlLocation, REGULTIMO_QNAME);
    }

    public RegUltimo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGULTIMO_QNAME, features);
    }

    public RegUltimo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegUltimo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegUltimo
     */
    @WebEndpoint(name = "regUltimoPort")
    public RegUltimo getRegUltimoPort() {
        return super.getPort(new QName("http://api.ws/", "regUltimoPort"), RegUltimo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegUltimo
     */
    @WebEndpoint(name = "regUltimoPort")
    public RegUltimo getRegUltimoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.ws/", "regUltimoPort"), RegUltimo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGULTIMO_EXCEPTION!= null) {
            throw REGULTIMO_EXCEPTION;
        }
        return REGULTIMO_WSDL_LOCATION;
    }

}
