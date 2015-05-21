
package ar.com.educacionit.app.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObtenerBodegaResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the nombreBodega property.
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
     * Sets the value of the nombreBodega property.
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
