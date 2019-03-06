
package org.mines.douai.j2ee.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mines.douai.j2ee.soap package. 
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

    private final static QName _GetPeopleCountResponse_QNAME = new QName("http://soap.j2ee.douai.mines.org/", "getPeopleCountResponse");
    private final static QName _GetPeopleCount_QNAME = new QName("http://soap.j2ee.douai.mines.org/", "getPeopleCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mines.douai.j2ee.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPeopleCount }
     * 
     */
    public GetPeopleCount createGetPeopleCount() {
        return new GetPeopleCount();
    }

    /**
     * Create an instance of {@link GetPeopleCountResponse }
     * 
     */
    public GetPeopleCountResponse createGetPeopleCountResponse() {
        return new GetPeopleCountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.j2ee.douai.mines.org/", name = "getPeopleCountResponse")
    public JAXBElement<GetPeopleCountResponse> createGetPeopleCountResponse(GetPeopleCountResponse value) {
        return new JAXBElement<GetPeopleCountResponse>(_GetPeopleCountResponse_QNAME, GetPeopleCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.j2ee.douai.mines.org/", name = "getPeopleCount")
    public JAXBElement<GetPeopleCount> createGetPeopleCount(GetPeopleCount value) {
        return new JAXBElement<GetPeopleCount>(_GetPeopleCount_QNAME, GetPeopleCount.class, null, value);
    }

}
