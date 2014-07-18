
package pe.com.lacaja.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boleta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boleta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODCOND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODDEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODGRADBAJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODGRADREM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODINST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODMOTB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CODVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESGRADBAJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESGRADREM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESTIPOBEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalle" type="{http://service.lacaja.com.pe/}boletaDetalle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DOMICILIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECGEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECMOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NROCUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRODOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NROREP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PERANO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PERMES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PLANA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSTAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPDOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOBEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPOPLANA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTDES" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTREM" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "boleta", propOrder = {
    "banco",
    "codcond",
    "coddep",
    "codgradbaj",
    "codgradrem",
    "codinst",
    "codmotb",
    "codper",
    "codval",
    "desgradbaj",
    "desgradrem",
    "destipoben",
    "detalle",
    "domicilio",
    "fecgen",
    "fecmod",
    "fecreg",
    "nrocuenta",
    "nrodoc",
    "nrorep",
    "perano",
    "permes",
    "plana",
    "postal",
    "tipdoc",
    "tipoben",
    "tipopla",
    "tipoplana",
    "totdes",
    "totrem",
    "usumod",
    "usureg"
})
public class Boleta {

    @XmlElement(name = "BANCO")
    protected String banco;
    @XmlElement(name = "CODCOND")
    protected String codcond;
    @XmlElement(name = "CODDEP")
    protected String coddep;
    @XmlElement(name = "CODGRADBAJ")
    protected String codgradbaj;
    @XmlElement(name = "CODGRADREM")
    protected String codgradrem;
    @XmlElement(name = "CODINST")
    protected String codinst;
    @XmlElement(name = "CODMOTB")
    protected String codmotb;
    @XmlElement(name = "CODPER")
    protected String codper;
    @XmlElement(name = "CODVAL")
    protected String codval;
    @XmlElement(name = "DESGRADBAJ")
    protected String desgradbaj;
    @XmlElement(name = "DESGRADREM")
    protected String desgradrem;
    @XmlElement(name = "DESTIPOBEN")
    protected String destipoben;
    @XmlElement(nillable = true)
    protected List<BoletaDetalle> detalle;
    @XmlElement(name = "DOMICILIO")
    protected String domicilio;
    @XmlElement(name = "FECGEN")
    protected String fecgen;
    @XmlElement(name = "FECMOD")
    protected String fecmod;
    @XmlElement(name = "FECREG")
    protected String fecreg;
    @XmlElement(name = "NROCUENTA")
    protected String nrocuenta;
    @XmlElement(name = "NRODOC")
    protected String nrodoc;
    @XmlElement(name = "NROREP")
    protected int nrorep;
    @XmlElement(name = "PERANO")
    protected int perano;
    @XmlElement(name = "PERMES")
    protected int permes;
    @XmlElement(name = "PLANA")
    protected String plana;
    @XmlElement(name = "POSTAL")
    protected String postal;
    @XmlElement(name = "TIPDOC")
    protected String tipdoc;
    @XmlElement(name = "TIPOBEN")
    protected String tipoben;
    @XmlElement(name = "TIPOPLA")
    protected String tipopla;
    @XmlElement(name = "TIPOPLANA")
    protected String tipoplana;
    @XmlElement(name = "TOTDES")
    protected double totdes;
    @XmlElement(name = "TOTREM")
    protected double totrem;
    @XmlElement(name = "USUMOD")
    protected String usumod;
    @XmlElement(name = "USUREG")
    protected String usureg;

    /**
     * Gets the value of the banco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANCO() {
        return banco;
    }

    /**
     * Sets the value of the banco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANCO(String value) {
        this.banco = value;
    }

    /**
     * Gets the value of the codcond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCOND() {
        return codcond;
    }

    /**
     * Sets the value of the codcond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCOND(String value) {
        this.codcond = value;
    }

    /**
     * Gets the value of the coddep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODDEP() {
        return coddep;
    }

    /**
     * Sets the value of the coddep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODDEP(String value) {
        this.coddep = value;
    }

    /**
     * Gets the value of the codgradbaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRADBAJ() {
        return codgradbaj;
    }

    /**
     * Sets the value of the codgradbaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRADBAJ(String value) {
        this.codgradbaj = value;
    }

    /**
     * Gets the value of the codgradrem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODGRADREM() {
        return codgradrem;
    }

    /**
     * Sets the value of the codgradrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODGRADREM(String value) {
        this.codgradrem = value;
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
     * Gets the value of the codmotb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMOTB() {
        return codmotb;
    }

    /**
     * Sets the value of the codmotb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMOTB(String value) {
        this.codmotb = value;
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
     * Gets the value of the codval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODVAL() {
        return codval;
    }

    /**
     * Sets the value of the codval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODVAL(String value) {
        this.codval = value;
    }

    /**
     * Gets the value of the desgradbaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESGRADBAJ() {
        return desgradbaj;
    }

    /**
     * Sets the value of the desgradbaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESGRADBAJ(String value) {
        this.desgradbaj = value;
    }

    /**
     * Gets the value of the desgradrem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESGRADREM() {
        return desgradrem;
    }

    /**
     * Sets the value of the desgradrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESGRADREM(String value) {
        this.desgradrem = value;
    }

    /**
     * Gets the value of the destipoben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTIPOBEN() {
        return destipoben;
    }

    /**
     * Sets the value of the destipoben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTIPOBEN(String value) {
        this.destipoben = value;
    }

    /**
     * Gets the value of the detalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoletaDetalle }
     * 
     * 
     */
    public List<BoletaDetalle> getDetalle() {
        if (detalle == null) {
            detalle = new ArrayList<BoletaDetalle>();
        }
        return this.detalle;
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
     * Gets the value of the fecgen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECGEN() {
        return fecgen;
    }

    /**
     * Sets the value of the fecgen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECGEN(String value) {
        this.fecgen = value;
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
     * Gets the value of the nrocuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROCUENTA() {
        return nrocuenta;
    }

    /**
     * Sets the value of the nrocuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROCUENTA(String value) {
        this.nrocuenta = value;
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
     * Gets the value of the nrorep property.
     * 
     */
    public int getNROREP() {
        return nrorep;
    }

    /**
     * Sets the value of the nrorep property.
     * 
     */
    public void setNROREP(int value) {
        this.nrorep = value;
    }

    /**
     * Gets the value of the perano property.
     * 
     */
    public int getPERANO() {
        return perano;
    }

    /**
     * Sets the value of the perano property.
     * 
     */
    public void setPERANO(int value) {
        this.perano = value;
    }

    /**
     * Gets the value of the permes property.
     * 
     */
    public int getPERMES() {
        return permes;
    }

    /**
     * Sets the value of the permes property.
     * 
     */
    public void setPERMES(int value) {
        this.permes = value;
    }

    /**
     * Gets the value of the plana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANA() {
        return plana;
    }

    /**
     * Sets the value of the plana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANA(String value) {
        this.plana = value;
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
     * Gets the value of the tipdoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPDOC() {
        return tipdoc;
    }

    /**
     * Sets the value of the tipdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPDOC(String value) {
        this.tipdoc = value;
    }

    /**
     * Gets the value of the tipoben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOBEN() {
        return tipoben;
    }

    /**
     * Sets the value of the tipoben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOBEN(String value) {
        this.tipoben = value;
    }

    /**
     * Gets the value of the tipopla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPLA() {
        return tipopla;
    }

    /**
     * Sets the value of the tipopla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPLA(String value) {
        this.tipopla = value;
    }

    /**
     * Gets the value of the tipoplana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPLANA() {
        return tipoplana;
    }

    /**
     * Sets the value of the tipoplana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPLANA(String value) {
        this.tipoplana = value;
    }

    /**
     * Gets the value of the totdes property.
     * 
     */
    public double getTOTDES() {
        return totdes;
    }

    /**
     * Sets the value of the totdes property.
     * 
     */
    public void setTOTDES(double value) {
        this.totdes = value;
    }

    /**
     * Gets the value of the totrem property.
     * 
     */
    public double getTOTREM() {
        return totrem;
    }

    /**
     * Sets the value of the totrem property.
     * 
     */
    public void setTOTREM(double value) {
        this.totrem = value;
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
