
package pe.com.lacaja.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boletaDetalle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boletaDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONCEPTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCRI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPORTE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TIPOMOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USUMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USUREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boletaDetalle", propOrder = {
    "concepto",
    "descri",
    "fecmod",
    "fecreg",
    "importe",
    "tipomov",
    "usumod",
    "usureg"
})
public class BoletaDetalle {

    @XmlElement(name = "CONCEPTO")
    protected String concepto;
    @XmlElement(name = "DESCRI")
    protected String descri;
    @XmlElement(name = "FECMOD")
    protected String fecmod;
    @XmlElement(name = "FECREG")
    protected String fecreg;
    @XmlElement(name = "IMPORTE")
    protected double importe;
    @XmlElement(name = "TIPOMOV")
    protected String tipomov;
    @XmlElement(name = "USUMOD")
    protected String usumod;
    @XmlElement(name = "USUREG")
    protected String usureg;

    /**
     * Gets the value of the concepto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCEPTO() {
        return concepto;
    }

    /**
     * Sets the value of the concepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCEPTO(String value) {
        this.concepto = value;
    }

    /**
     * Gets the value of the descri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRI() {
        return descri;
    }

    /**
     * Sets the value of the descri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRI(String value) {
        this.descri = value;
    }

    /**
     * Gets the value of the fecmod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECMOD() {
        return fecmod;
    }

    /**
     * Sets the value of the fecmod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECMOD(String value) {
        this.fecmod = value;
    }

    /**
     * Gets the value of the fecreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECREG() {
        return fecreg;
    }

    /**
     * Sets the value of the fecreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECREG(String value) {
        this.fecreg = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     */
    public double getIMPORTE() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setIMPORTE(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the tipomov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMOV() {
        return tipomov;
    }

    /**
     * Sets the value of the tipomov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMOV(String value) {
        this.tipomov = value;
    }

    /**
     * Gets the value of the usumod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUMOD() {
        return usumod;
    }

    /**
     * Sets the value of the usumod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUMOD(String value) {
        this.usumod = value;
    }

    /**
     * Gets the value of the usureg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUREG() {
        return usureg;
    }

    /**
     * Sets the value of the usureg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUREG(String value) {
        this.usureg = value;
    }

}
