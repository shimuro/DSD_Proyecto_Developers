
package pe.com.lacaja.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LaCajaServiceImplService", targetNamespace = "http://service.lacaja.com.pe/", wsdlLocation = "http://localhost:8080/WebServiceLaCaja/LaCajaServiceImplService?wsdl")
public class LaCajaServiceImplService
    extends Service
{

    private final static URL LACAJASERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException LACAJASERVICEIMPLSERVICE_EXCEPTION;
    private final static QName LACAJASERVICEIMPLSERVICE_QNAME = new QName("http://service.lacaja.com.pe/", "LaCajaServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceLaCaja/LaCajaServiceImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LACAJASERVICEIMPLSERVICE_WSDL_LOCATION = url;
        LACAJASERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public LaCajaServiceImplService() {
        super(__getWsdlLocation(), LACAJASERVICEIMPLSERVICE_QNAME);
    }

    public LaCajaServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LACAJASERVICEIMPLSERVICE_QNAME, features);
    }

    public LaCajaServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, LACAJASERVICEIMPLSERVICE_QNAME);
    }

    public LaCajaServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LACAJASERVICEIMPLSERVICE_QNAME, features);
    }

    public LaCajaServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LaCajaServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LaCajaService
     */
    @WebEndpoint(name = "LaCajaServiceImplPort")
    public LaCajaService getLaCajaServiceImplPort() {
        return super.getPort(new QName("http://service.lacaja.com.pe/", "LaCajaServiceImplPort"), LaCajaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LaCajaService
     */
    @WebEndpoint(name = "LaCajaServiceImplPort")
    public LaCajaService getLaCajaServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.lacaja.com.pe/", "LaCajaServiceImplPort"), LaCajaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LACAJASERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw LACAJASERVICEIMPLSERVICE_EXCEPTION;
        }
        return LACAJASERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
