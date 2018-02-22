
package ws.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Logear_QNAME = new QName("http://api.ws/", "logear");
    private final static QName _LogearResponse_QNAME = new QName("http://api.ws/", "logearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogearResponse }
     * 
     */
    public LogearResponse createLogearResponse() {
        return new LogearResponse();
    }

    /**
     * Create an instance of {@link Logear }
     * 
     */
    public Logear createLogear() {
        return new Logear();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "logear")
    public JAXBElement<Logear> createLogear(Logear value) {
        return new JAXBElement<Logear>(_Logear_QNAME, Logear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "logearResponse")
    public JAXBElement<LogearResponse> createLogearResponse(LogearResponse value) {
        return new JAXBElement<LogearResponse>(_LogearResponse_QNAME, LogearResponse.class, null, value);
    }

}
