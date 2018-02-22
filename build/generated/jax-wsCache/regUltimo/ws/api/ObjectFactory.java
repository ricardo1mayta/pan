
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

    private final static QName _Ultimo_QNAME = new QName("http://api.ws/", "ultimo");
    private final static QName _UltimoResponse_QNAME = new QName("http://api.ws/", "ultimoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ultimo }
     * 
     */
    public Ultimo createUltimo() {
        return new Ultimo();
    }

    /**
     * Create an instance of {@link UltimoResponse }
     * 
     */
    public UltimoResponse createUltimoResponse() {
        return new UltimoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ultimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "ultimo")
    public JAXBElement<Ultimo> createUltimo(Ultimo value) {
        return new JAXBElement<Ultimo>(_Ultimo_QNAME, Ultimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UltimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "ultimoResponse")
    public JAXBElement<UltimoResponse> createUltimoResponse(UltimoResponse value) {
        return new JAXBElement<UltimoResponse>(_UltimoResponse_QNAME, UltimoResponse.class, null, value);
    }

}
