
package ar.com.educacionit.app.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObtenerBodegaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObtenerBodegaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreDelVino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerBodegaType", propOrder = {
    "nombreDelVino"
})
public class ObtenerBodegaType {

    protected String nombreDelVino;

    /**
     * Obtiene el valor de la propiedad nombreDelVino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDelVino() {
        return nombreDelVino;
    }

    /**
     * Define el valor de la propiedad nombreDelVino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDelVino(String value) {
        this.nombreDelVino = value;
    }

}
