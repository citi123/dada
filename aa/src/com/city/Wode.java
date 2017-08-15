package com.city;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Wode {
	@WebMethod
	public String sayHello(){
		return "ni hao";
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://10.100.32.30:8080/wode", new Wode());
	}
}
