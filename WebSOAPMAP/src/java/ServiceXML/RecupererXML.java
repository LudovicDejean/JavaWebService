/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceXML;

import WS.METAR;
import WS.Response;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author dejea
 */
@WebService(serviceName = "RecupererXML")
public class RecupererXML {

    /**
     * This is a sample web service operation
     *
     * @param url
     * @return
     */
//    @WebMethod(operationName = "queryFlux")
//    public URL queryFlux(@WebParam(name = "url") String txt) throws MalformedURLException {
//        URL url = new URL("https://aviationweather.gov/adds/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&hoursBeforeNow=1");
//        return url;
//    }
    
    
    @WebMethod()
    public void test() throws JAXBException, MalformedURLException{
        JAXBContext jc = JAXBContext.newInstance("WS");
        Unmarshaller u = jc.createUnmarshaller();
        URL url = new URL( "https://aviationweather.gov/adds/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&hoursBeforeNow=1" );
        Response reponse = (Response) u.unmarshal(url);
        
        List<METAR> tabMapedMetar = (List<METAR>) reponse.getData().getMETAR();
        
        for (int i = 0; i < tabMapedMetar.size(); i++) {
            System.out.println("Metar numéro : " + i +" Latitude : "+tabMapedMetar.get(i).getLatitude()+ " Longitude : "+tabMapedMetar.get(i).getLongitude());
            System.out.println(tabMapedMetar.get(i).getStationId());
        }
    }
    
    @WebMethod()
    public List<METAR> listMetar() throws JAXBException, MalformedURLException{
        JAXBContext jc = JAXBContext.newInstance("WS");
        Unmarshaller u = jc.createUnmarshaller();
        URL url = new URL( "https://aviationweather.gov/adds/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&hoursBeforeNow=1" );
        Response reponse = (Response) u.unmarshal(url);
        
        List<METAR> tabMapedMetar = (List<METAR>) reponse.getData().getMETAR();
        return tabMapedMetar;
    }
    
    @WebMethod()
    public String getIdMetar(@WebParam(name = "name") String id) throws JAXBException, MalformedURLException{
        JAXBContext jc = JAXBContext.newInstance("WS");
        Unmarshaller u = jc.createUnmarshaller();
        URL url = new URL( "https://aviationweather.gov/adds/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&hoursBeforeNow=1" );
        Response reponse = (Response) u.unmarshal(url);
        
        List<METAR> tabMapedMetar = (List<METAR>) reponse.getData().getMETAR();
        for (int i = 0; i < tabMapedMetar.size(); i++) {
            if (tabMapedMetar.get(i).getStationId().equals(id)){
                return("StationID: " + tabMapedMetar.get(i).getStationId() + " Longitude: " + tabMapedMetar.get(i).getLongitude() +" Latitude: " + tabMapedMetar.get(i).getLatitude());
            }else{
                return("StationId inexistante");
            }
        }
        return("Ce Station Id n'existe pas.");
    }
}
