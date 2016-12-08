package com.nerdstore.clientsample;

import com.nerdstore.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ConsultaCEP_Service service1 = new ConsultaCEP_Service();
	        System.out.println("Create Web Service...");
	        ConsultaCEP port1 = service1.getConsultaCEPSOAP();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.consultarCEP(null,null,null,null,null,null,null,null,null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ConsultaCEP port2 = service1.getConsultaCEPSOAP();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.consultarCEP(null,null,null,null,null,null,null,null,null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
