//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.04 à 08:43:28 AM CET 
//


package WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}corrected" minOccurs="0"/>
 *         &lt;element ref="{}auto" minOccurs="0"/>
 *         &lt;element ref="{}auto_station" minOccurs="0"/>
 *         &lt;element ref="{}maintenance_indicator_on" minOccurs="0"/>
 *         &lt;element ref="{}no_signal" minOccurs="0"/>
 *         &lt;element ref="{}lightning_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}freezing_rain_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}present_weather_sensor_off" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "corrected",
    "auto",
    "autoStation",
    "maintenanceIndicatorOn",
    "noSignal",
    "lightningSensorOff",
    "freezingRainSensorOff",
    "presentWeatherSensorOff"
})
@XmlRootElement(name = "quality_control_flags")
public class QualityControlFlags {

    protected String corrected;
    protected String auto;
    @XmlElement(name = "auto_station")
    protected String autoStation;
    @XmlElement(name = "maintenance_indicator_on")
    protected String maintenanceIndicatorOn;
    @XmlElement(name = "no_signal")
    protected String noSignal;
    @XmlElement(name = "lightning_sensor_off")
    protected String lightningSensorOff;
    @XmlElement(name = "freezing_rain_sensor_off")
    protected String freezingRainSensorOff;
    @XmlElement(name = "present_weather_sensor_off")
    protected String presentWeatherSensorOff;

    /**
     * Obtient la valeur de la propriété corrected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrected() {
        return corrected;
    }

    /**
     * Définit la valeur de la propriété corrected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrected(String value) {
        this.corrected = value;
    }

    /**
     * Obtient la valeur de la propriété auto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuto() {
        return auto;
    }

    /**
     * Définit la valeur de la propriété auto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuto(String value) {
        this.auto = value;
    }

    /**
     * Obtient la valeur de la propriété autoStation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoStation() {
        return autoStation;
    }

    /**
     * Définit la valeur de la propriété autoStation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoStation(String value) {
        this.autoStation = value;
    }

    /**
     * Obtient la valeur de la propriété maintenanceIndicatorOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceIndicatorOn() {
        return maintenanceIndicatorOn;
    }

    /**
     * Définit la valeur de la propriété maintenanceIndicatorOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceIndicatorOn(String value) {
        this.maintenanceIndicatorOn = value;
    }

    /**
     * Obtient la valeur de la propriété noSignal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSignal() {
        return noSignal;
    }

    /**
     * Définit la valeur de la propriété noSignal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSignal(String value) {
        this.noSignal = value;
    }

    /**
     * Obtient la valeur de la propriété lightningSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightningSensorOff() {
        return lightningSensorOff;
    }

    /**
     * Définit la valeur de la propriété lightningSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightningSensorOff(String value) {
        this.lightningSensorOff = value;
    }

    /**
     * Obtient la valeur de la propriété freezingRainSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreezingRainSensorOff() {
        return freezingRainSensorOff;
    }

    /**
     * Définit la valeur de la propriété freezingRainSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreezingRainSensorOff(String value) {
        this.freezingRainSensorOff = value;
    }

    /**
     * Obtient la valeur de la propriété presentWeatherSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentWeatherSensorOff() {
        return presentWeatherSensorOff;
    }

    /**
     * Définit la valeur de la propriété presentWeatherSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentWeatherSensorOff(String value) {
        this.presentWeatherSensorOff = value;
    }

}
