//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.04 à 08:43:28 AM CET 
//


package WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}request_index"/>
 *         &lt;element ref="{}data_source"/>
 *         &lt;element ref="{}request"/>
 *         &lt;element ref="{}errors"/>
 *         &lt;element ref="{}warnings"/>
 *         &lt;element ref="{}time_taken_ms"/>
 *         &lt;element ref="{}data"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="1.2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestIndex",
    "dataSource",
    "request",
    "errors",
    "warnings",
    "timeTakenMs",
    "data"
})
@XmlRootElement(name = "response")
public class Response {

    @XmlElement(name = "request_index")
    protected int requestIndex;
    @XmlElement(name = "data_source", required = true)
    protected DataSource dataSource;
    @XmlElement(required = true)
    protected Request request;
    @XmlElement(required = true)
    protected Errors errors;
    @XmlElement(required = true)
    protected Warnings warnings;
    @XmlElement(name = "time_taken_ms")
    protected int timeTakenMs;
    @XmlElement(required = true)
    protected Data data;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtient la valeur de la propriété requestIndex.
     * 
     */
    public int getRequestIndex() {
        return requestIndex;
    }

    /**
     * Définit la valeur de la propriété requestIndex.
     * 
     */
    public void setRequestIndex(int value) {
        this.requestIndex = value;
    }

    /**
     * Obtient la valeur de la propriété dataSource.
     * 
     * @return
     *     possible object is
     *     {@link DataSource }
     *     
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Définit la valeur de la propriété dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSource }
     *     
     */
    public void setDataSource(DataSource value) {
        this.dataSource = value;
    }

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Obtient la valeur de la propriété errors.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Définit la valeur de la propriété errors.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Obtient la valeur de la propriété warnings.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Définit la valeur de la propriété warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Obtient la valeur de la propriété timeTakenMs.
     * 
     */
    public int getTimeTakenMs() {
        return timeTakenMs;
    }

    /**
     * Définit la valeur de la propriété timeTakenMs.
     * 
     */
    public void setTimeTakenMs(int value) {
        this.timeTakenMs = value;
    }

    /**
     * Obtient la valeur de la propriété data.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Définit la valeur de la propriété data.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.2";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
