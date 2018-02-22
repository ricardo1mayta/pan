
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

    private final static QName _InsertarVentasTienda_QNAME = new QName("http://api.ws/", "InsertarVentasTienda");
    private final static QName _InsertarVentasTiendaResponse_QNAME = new QName("http://api.ws/", "InsertarVentasTiendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarVentasTiendaResponse }
     * 
     */
    public InsertarVentasTiendaResponse createInsertarVentasTiendaResponse() {
        return new InsertarVentasTiendaResponse();
    }

    /**
     * Create an instance of {@link InsertarVentasTienda }
     * 
     */
    public InsertarVentasTienda createInsertarVentasTienda() {
        return new InsertarVentasTienda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVentasTienda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "InsertarVentasTienda")
    public JAXBElement<InsertarVentasTienda> createInsertarVentasTienda(InsertarVentasTienda value) {
        return new JAXBElement<InsertarVentasTienda>(_InsertarVentasTienda_QNAME, InsertarVentasTienda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVentasTiendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.ws/", name = "InsertarVentasTiendaResponse")
    public JAXBElement<InsertarVentasTiendaResponse> createInsertarVentasTiendaResponse(InsertarVentasTiendaResponse value) {
        return new JAXBElement<InsertarVentasTiendaResponse>(_InsertarVentasTiendaResponse_QNAME, InsertarVentasTiendaResponse.class, null, value);
    }

}
