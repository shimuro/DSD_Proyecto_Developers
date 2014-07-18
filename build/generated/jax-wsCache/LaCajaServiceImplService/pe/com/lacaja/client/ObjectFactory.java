
package pe.com.lacaja.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.lacaja.client package. 
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

    private final static QName _GetBeneficiarioResponse_QNAME = new QName("http://service.lacaja.com.pe/", "getBeneficiarioResponse");
    private final static QName _GetBoletas_QNAME = new QName("http://service.lacaja.com.pe/", "getBoletas");
    private final static QName _GetUsuarioPorNroDocResponse_QNAME = new QName("http://service.lacaja.com.pe/", "getUsuarioPorNroDocResponse");
    private final static QName _GetUsuarioPorNroDoc_QNAME = new QName("http://service.lacaja.com.pe/", "getUsuarioPorNroDoc");
    private final static QName _GetBeneficiario_QNAME = new QName("http://service.lacaja.com.pe/", "getBeneficiario");
    private final static QName _GetBoletasResponse_QNAME = new QName("http://service.lacaja.com.pe/", "getBoletasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.lacaja.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBoletas }
     * 
     */
    public GetBoletas createGetBoletas() {
        return new GetBoletas();
    }

    /**
     * Create an instance of {@link GetBeneficiarioResponse }
     * 
     */
    public GetBeneficiarioResponse createGetBeneficiarioResponse() {
        return new GetBeneficiarioResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioPorNroDocResponse }
     * 
     */
    public GetUsuarioPorNroDocResponse createGetUsuarioPorNroDocResponse() {
        return new GetUsuarioPorNroDocResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioPorNroDoc }
     * 
     */
    public GetUsuarioPorNroDoc createGetUsuarioPorNroDoc() {
        return new GetUsuarioPorNroDoc();
    }

    /**
     * Create an instance of {@link GetBeneficiario }
     * 
     */
    public GetBeneficiario createGetBeneficiario() {
        return new GetBeneficiario();
    }

    /**
     * Create an instance of {@link GetBoletasResponse }
     * 
     */
    public GetBoletasResponse createGetBoletasResponse() {
        return new GetBoletasResponse();
    }

    /**
     * Create an instance of {@link Boleta }
     * 
     */
    public Boleta createBoleta() {
        return new Boleta();
    }

    /**
     * Create an instance of {@link BoletaDetalle }
     * 
     */
    public BoletaDetalle createBoletaDetalle() {
        return new BoletaDetalle();
    }

    /**
     * Create an instance of {@link Beneficiario }
     * 
     */
    public Beneficiario createBeneficiario() {
        return new Beneficiario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeneficiarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getBeneficiarioResponse")
    public JAXBElement<GetBeneficiarioResponse> createGetBeneficiarioResponse(GetBeneficiarioResponse value) {
        return new JAXBElement<GetBeneficiarioResponse>(_GetBeneficiarioResponse_QNAME, GetBeneficiarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoletas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getBoletas")
    public JAXBElement<GetBoletas> createGetBoletas(GetBoletas value) {
        return new JAXBElement<GetBoletas>(_GetBoletas_QNAME, GetBoletas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioPorNroDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getUsuarioPorNroDocResponse")
    public JAXBElement<GetUsuarioPorNroDocResponse> createGetUsuarioPorNroDocResponse(GetUsuarioPorNroDocResponse value) {
        return new JAXBElement<GetUsuarioPorNroDocResponse>(_GetUsuarioPorNroDocResponse_QNAME, GetUsuarioPorNroDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioPorNroDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getUsuarioPorNroDoc")
    public JAXBElement<GetUsuarioPorNroDoc> createGetUsuarioPorNroDoc(GetUsuarioPorNroDoc value) {
        return new JAXBElement<GetUsuarioPorNroDoc>(_GetUsuarioPorNroDoc_QNAME, GetUsuarioPorNroDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeneficiario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getBeneficiario")
    public JAXBElement<GetBeneficiario> createGetBeneficiario(GetBeneficiario value) {
        return new JAXBElement<GetBeneficiario>(_GetBeneficiario_QNAME, GetBeneficiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoletasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lacaja.com.pe/", name = "getBoletasResponse")
    public JAXBElement<GetBoletasResponse> createGetBoletasResponse(GetBoletasResponse value) {
        return new JAXBElement<GetBoletasResponse>(_GetBoletasResponse_QNAME, GetBoletasResponse.class, null, value);
    }

}
