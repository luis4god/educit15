
package ar.com.educacionit.app.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.educacionit.app.service package. 
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

    private final static QName _ObtenerBodegaResponse_QNAME = new QName("http://service.app.educacionit.com.ar/", "ObtenerBodegaResponse");
    private final static QName _ObtenerBodega_QNAME = new QName("http://service.app.educacionit.com.ar/", "ObtenerBodega");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.educacionit.app.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerBodegaResponseType }
     * 
     */
    public ObtenerBodegaResponseType createObtenerBodegaResponseType() {
        return new ObtenerBodegaResponseType();
    }

    /**
     * Create an instance of {@link ObtenerBodegaType }
     * 
     */
    public ObtenerBodegaType createObtenerBodegaType() {
        return new ObtenerBodegaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerBodegaResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.app.educacionit.com.ar/", name = "ObtenerBodegaResponse")
    public JAXBElement<ObtenerBodegaResponseType> createObtenerBodegaResponse(ObtenerBodegaResponseType value) {
        return new JAXBElement<ObtenerBodegaResponseType>(_ObtenerBodegaResponse_QNAME, ObtenerBodegaResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerBodegaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.app.educacionit.com.ar/", name = "ObtenerBodega")
    public JAXBElement<ObtenerBodegaType> createObtenerBodega(ObtenerBodegaType value) {
        return new JAXBElement<ObtenerBodegaType>(_ObtenerBodega_QNAME, ObtenerBodegaType.class, null, value);
    }

}
