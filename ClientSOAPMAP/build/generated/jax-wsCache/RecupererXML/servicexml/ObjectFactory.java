
package servicexml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicexml package. 
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

    private final static QName _SkyCondition_QNAME = new QName("http://ServiceXML/", "sky_condition");
    private final static QName _MalformedURLException_QNAME = new QName("http://ServiceXML/", "MalformedURLException");
    private final static QName _QualityControlFlags_QNAME = new QName("http://ServiceXML/", "quality_control_flags");
    private final static QName _GetIdMetar_QNAME = new QName("http://ServiceXML/", "getIdMetar");
    private final static QName _JAXBException_QNAME = new QName("http://ServiceXML/", "JAXBException");
    private final static QName _Test_QNAME = new QName("http://ServiceXML/", "test");
    private final static QName _ListMetar_QNAME = new QName("http://ServiceXML/", "listMetar");
    private final static QName _TestResponse_QNAME = new QName("http://ServiceXML/", "testResponse");
    private final static QName _GetIdMetarResponse_QNAME = new QName("http://ServiceXML/", "getIdMetarResponse");
    private final static QName _ListMetarResponse_QNAME = new QName("http://ServiceXML/", "listMetarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicexml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link METAR }
     * 
     */
    public METAR createMETAR() {
        return new METAR();
    }

    /**
     * Create an instance of {@link METAR.QualityControlFlags }
     * 
     */
    public METAR.QualityControlFlags createMETARQualityControlFlags() {
        return new METAR.QualityControlFlags();
    }

    /**
     * Create an instance of {@link METAR.SkyCondition }
     * 
     */
    public METAR.SkyCondition createMETARSkyCondition() {
        return new METAR.SkyCondition();
    }

    /**
     * Create an instance of {@link GetIdMetar }
     * 
     */
    public GetIdMetar createGetIdMetar() {
        return new GetIdMetar();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ListMetar }
     * 
     */
    public ListMetar createListMetar() {
        return new ListMetar();
    }

    /**
     * Create an instance of {@link ListMetarResponse }
     * 
     */
    public ListMetarResponse createListMetarResponse() {
        return new ListMetarResponse();
    }

    /**
     * Create an instance of {@link GetIdMetarResponse }
     * 
     */
    public GetIdMetarResponse createGetIdMetarResponse() {
        return new GetIdMetarResponse();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "sky_condition")
    public JAXBElement<Object> createSkyCondition(Object value) {
        return new JAXBElement<Object>(_SkyCondition_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "quality_control_flags")
    public JAXBElement<Object> createQualityControlFlags(Object value) {
        return new JAXBElement<Object>(_QualityControlFlags_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdMetar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "getIdMetar")
    public JAXBElement<GetIdMetar> createGetIdMetar(GetIdMetar value) {
        return new JAXBElement<GetIdMetar>(_GetIdMetar_QNAME, GetIdMetar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMetar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "listMetar")
    public JAXBElement<ListMetar> createListMetar(ListMetar value) {
        return new JAXBElement<ListMetar>(_ListMetar_QNAME, ListMetar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdMetarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "getIdMetarResponse")
    public JAXBElement<GetIdMetarResponse> createGetIdMetarResponse(GetIdMetarResponse value) {
        return new JAXBElement<GetIdMetarResponse>(_GetIdMetarResponse_QNAME, GetIdMetarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMetarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServiceXML/", name = "listMetarResponse")
    public JAXBElement<ListMetarResponse> createListMetarResponse(ListMetarResponse value) {
        return new JAXBElement<ListMetarResponse>(_ListMetarResponse_QNAME, ListMetarResponse.class, null, value);
    }

}
