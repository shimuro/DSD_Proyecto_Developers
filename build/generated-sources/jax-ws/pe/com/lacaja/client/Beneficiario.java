
package pe.com.lacaja.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APENOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLPENSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODDOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODINST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECNAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRODOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NROSEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PORCEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEXO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "beneficiario", propOrder = {
    "apenom",
    "clpension",
    "coddoc",
    "codinst",
    "codper",
    "domicilio",
    "estado",
    "fecmod",
    "fecnac",
    "fecreg",
    "nrodoc",
    "nrosec",
    "porcen",
    "postal",
    "sexo",
    "tipoper",
    "usumod",
    "usureg"
})
public class Beneficiario {

    @XmlElement(name = "APENOM")
    protected String apenom;
    @XmlElement(name = "CLPENSION")
    protected String clpension;
    @XmlElement(name = "CODDOC")
    protected String coddoc;
    @XmlElement(name = "CODINST")
    protected String codinst;
    @XmlElement(name = "CODPER")
    protected String codper;
    @XmlElement(name = "DOMICILIO")
    protected String domicilio;
    @XmlElement(name = "ESTADO")
    protected String estado;
    @XmlElement(name = "FECMOD")
    protected String fecmod;
    @XmlElement(name = "FECNAC")
    protected String fecnac;
    @XmlElement(name = "FECREG")
    protected String fecreg;
    @XmlElement(name = "NRODOC")
    protected String nrodoc;
    @XmlElement(name = "NROSEC")
    protected String nrosec;
    @XmlElement(name = "PORCEN")
    protected String porcen;
    @XmlElement(name = "POSTAL")
    protected String postal;
    @XmlElement(name = "SEXO")
    protected String sexo;
    @XmlElement(name = "TIPOPER")
    protected String tipoper;
    @XmlElement(name = "USUMOD")
    protected String usumod;
    @XmlElement(name = "USUREG")
    protected String usureg;

    /**
     * Gets the value of the apenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPENOM() {
        return apenom;
    }

    /**
     * Sets the value of the apenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPENOM(String value) {
        this.apenom = value;
    }

    /**
     * Gets the value of the clpension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLPENSION() {
        return clpension;
    }

    /**
     * Sets the value of the clpension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLPENSION(String value) {
        this.clpension = value;
    }

    /**
     * Gets the value of the coddoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDOC() {
        return coddoc;
    }

    /**
     * Sets the value of the coddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDOC(String value) {
        this.coddoc = value;
    }

    /**
     * Gets the value of the codinst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODINST() {
        return codinst;
    }

    /**
     * Sets the value of the codinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODINST(String value) {
        this.codinst = value;
    }

    /**
     * Gets the value of the codper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPER() {
        return codper;
    }

    /**
     * Sets the value of the codper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPER(String value) {
        this.codper = value;
    }

    /**
     * Gets the value of the domicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMICILIO() {
        return domicilio;
    }

    /**
     * Sets the value of the domicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMICILIO(String value) {
        this.domicilio = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO(String value) {
        this.estado = value;
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
     * Gets the value of the fecnac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECNAC() {
        return fecnac;
    }

    /**
     * Sets the value of the fecnac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECNAC(String value) {
        this.fecnac = value;
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
     * Gets the value of the nrodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODOC() {
        return nrodoc;
    }

    /**
     * Sets the value of the nrodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODOC(String value) {
        this.nrodoc = value;
    }

    /**
     * Gets the value of the nrosec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROSEC() {
        return nrosec;
    }

    /**
     * Sets the value of the nrosec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROSEC(String value) {
        this.nrosec = value;
    }

    /**
     * Gets the value of the porcen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORCEN() {
        return porcen;
    }

    /**
     * Sets the value of the porcen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORCEN(String value) {
        this.porcen = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTAL() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTAL(String value) {
        this.postal = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXO() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXO(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the tipoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPER() {
        return tipoper;
    }

    /**
     * Sets the value of the tipoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPER(String value) {
        this.tipoper = value;
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
