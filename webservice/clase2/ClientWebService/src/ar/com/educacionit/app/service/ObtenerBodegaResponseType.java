
package ar.com.educacionit.app.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObtenerBodegaResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObtenerBodegaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreBodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerBodegaResponseType", propOrder = {
    "nombreBodega"
})
public class ObtenerBodegaResponseType {

    protected String nombreBodega;

    /**
     * Obtiene el valor de la propiedad nombreBodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBodega() {
        return nombreBodega;
    }

    /**
     * Define el valor de la propiedad nombreBodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBodega(String value) {
        this.nombreBodega = value;
    }

}
