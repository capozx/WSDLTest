package com.cleverbuilder.bookservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-14T16:40:06.367+02:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "BookService",
                  wsdlLocation = "file:/home/sysfrog/IdeaProjects/WSDLTest/src/main/resources/rules.wsdl",
                  targetNamespace = "http://www.cleverbuilder.com/BookService/")
public class BookService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.cleverbuilder.com/BookService/", "BookService");
    public final static QName BookServiceSOAP = new QName("http://www.cleverbuilder.com/BookService/", "BookServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/sysfrog/IdeaProjects/WSDLTest/src/main/resources/rules.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/sysfrog/IdeaProjects/WSDLTest/src/main/resources/rules.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BookService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceSOAP")
    public BookService getBookServiceSOAP() {
        return super.getPort(BookServiceSOAP, BookService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceSOAP")
    public BookService getBookServiceSOAP(WebServiceFeature... features) {
        return super.getPort(BookServiceSOAP, BookService.class, features);
    }

}
