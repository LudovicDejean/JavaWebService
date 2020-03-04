/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsoapmap;

import java.util.Scanner;
import servicexml.JAXBException_Exception;
import servicexml.MalformedURLException_Exception;

/**
 *
 * @author dejea
 */
public class ClientSOAPMAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException_Exception, JAXBException_Exception {
        servicexml.RecupererXML_Service service = new servicexml.RecupererXML_Service();
        servicexml.RecupererXML port = service.getRecupererXMLPort();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un Id de 4 lettres correspondant à une station :");
        String str = sc.nextLine();
        try{
            System.out.println(port.getIdMetar(str));
        }catch(JAXBException_Exception e){
            e.getStackTrace();
        }
//        if (str.length() == 4) {
//            System.out.println("Vous avez saisi : " + str.toUpperCase());
//            System.out.println(port.getIdMetar(str));
//        }else{
//            System.out.println("ce n'est pas un mot de 4 lettres");
//        }        
//        try{
//           port.test();
//        }catch(servicexml.JAXBException_Exception e){
//            e.getStackTrace();
//        }

    }

}
